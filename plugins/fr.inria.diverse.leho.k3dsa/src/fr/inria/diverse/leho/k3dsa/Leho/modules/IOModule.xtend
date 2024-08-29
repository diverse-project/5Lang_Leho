package fr.inria.diverse.leho.k3dsa.Leho.modules

import fr.inria.diverse.leho.model.leho.LehoFactory
import fr.inria.diverse.leho.model.leho.Packet
import fr.inria.diverse.leho.model.leho.Policy
import fr.inria.diverse.leho.model.leho.Port
import java.io.File
import java.io.FileOutputStream
import java.math.BigInteger
import java.util.Scanner

class IOModule {
	static Packet currentPacket
	
	def private static int read(int offset, int length) {
		new BigInteger(currentPacket.rawContent.toString.substring(offset, offset + length), 2).intValue
	}
	
	def static createPacketsFromFile(Policy root, File inputData) {
		val input = new Scanner(inputData)
		
		while (input.hasNextLine) { // for each packet
			val line = input.nextLine
			currentPacket = LehoFactory.eINSTANCE.createPacket
			val String[] packet_data = line.substring(1, line.length-1).split(";")
			// time
			currentPacket.time = Integer.valueOf(packet_data.get(0))
			// port
			var port = root.inPorts.findFirst[p | p.number.equals(Integer.parseInt(packet_data.get(1)))]
			if (port === null) {
				port = LehoFactory.eINSTANCE.createPort
				port.number = Integer.parseInt(packet_data.get(1))
				root.inPorts.add(port)
			}
			currentPacket.inPort = port
			//content
			currentPacket.rawContent = packet_data.get(2)
			var nextEhStart = 320
			var nextHeader = read(48, 8);
			while (nextHeader != 59) {
				var saveNext = read(nextEhStart, 8)
				switch(nextHeader) {
					case 0: { // hop by hop
						var eh = LehoFactory.eINSTANCE.createHopByHopOpts
						val hdrExtLen = read(nextEhStart+8, 8)
						var nextOptStart = nextEhStart+16
						nextEhStart += 64+hdrExtLen*64
						
						var optDataLen = 0
						var optionType = 0
						while (nextOptStart < nextEhStart) {
							optionType = read(nextOptStart, 8)
							optDataLen = optionType == 0 ? 8 : read(nextOptStart+8, 8)
							switch (optionType) {
								case 0: eh.options.add(LehoFactory.eINSTANCE.createPad1)
								case 1: eh.options.add(LehoFactory.eINSTANCE.createPadN)
								case 77: {
									eh.options.add(LehoFactory.eINSTANCE.createDeprecated)
									nextOptStart = nextEhStart
								}
								case 138: eh.options.add(LehoFactory.eINSTANCE.createEndPointIdentification)
								case optionType == 30 || optionType == 62 || optionType == 94 || optionType == 126  || optionType == 158 || optionType == 190 || optionType == 222 || optionType == 254: 
									eh.options.add(LehoFactory.eINSTANCE.createRFC3692Experiment)
								case 5: {  eh.options.add(LehoFactory.eINSTANCE.createRouterAlert)
//									val router = LehoFactory.eINSTANCE.createRouterAlert
//									val protocol = read(nextOptStart+16, 16)
//									if (protocol == 0) router.protocol = LehoFactory.eINSTANCE.createRSVP
//									else if (protocol == 1) router.protocol = LehoFactory.eINSTANCE.createMLD
//									eh.options.add(router)
								}
								case 7: eh.options.add(LehoFactory.eINSTANCE.createCalipso)
								case 8: eh.options.add(LehoFactory.eINSTANCE.createSmfDpd)
								case optionType == 35 || optionType == 99: eh.options.add(LehoFactory.eINSTANCE.createRPLOption)
								case 38: eh.options.add(LehoFactory.eINSTANCE.createQuickStart)
								case 109: eh.options.add(LehoFactory.eINSTANCE.createMPLOption)
								case 194: {
									eh.options.add(LehoFactory.eINSTANCE.createJumboPayload)
									optDataLen = 6
								}
								case 238: eh.options.add(LehoFactory.eINSTANCE.createDFF)
							}
							nextOptStart += optDataLen*8
						}
						
						currentPacket.extensionheader.add(eh)
					}
					case 43: { // routing
						var eh = LehoFactory.eINSTANCE.createRouting
						val hdrExtLen = read(nextEhStart+8, 8)
						var routingType = read(nextEhStart+8+8, 8)
						nextEhStart += 64+hdrExtLen*64
						switch (routingType) {
							case 0: eh.type = LehoFactory.eINSTANCE.createSourceRoute
							case 1: eh.type = LehoFactory.eINSTANCE.createNimrod
							case 2: eh.type = LehoFactory.eINSTANCE.createType2
							case 3: eh.type = LehoFactory.eINSTANCE.createRPLSource
							case 4: eh.type = LehoFactory.eINSTANCE.createSegment
							case routingType > 4 && routingType < 253: eh.type = LehoFactory.eINSTANCE.createUnassigned
							case 253: eh.type = LehoFactory.eINSTANCE.createRFC3692Experiment1
							case 254: eh.type = LehoFactory.eINSTANCE.createRFC3692Experiment2
							case 255: eh.type = LehoFactory.eINSTANCE.createReserved
						}
						currentPacket.extensionheader.add(eh)
					}
					case 44: { //fragment
						currentPacket.extensionheader.add(LehoFactory.eINSTANCE.createFragment)
						nextEhStart += 64
					}
//					case 50: { // encapsuling security payload
//						currentPacket.extensionheader.add(LehoFactory.eINSTANCE.createEncapsulingSecurityPayload)
//						// TODO: understand this one
//					}
					case 51: { // authetification header
						currentPacket.extensionheader.add(LehoFactory.eINSTANCE.createAuthentificationHeader)
						nextEhStart += 64+(read(nextEhStart+8, 8) *32)
					}
					case 60: { // destination options
						var eh = LehoFactory.eINSTANCE.createDestinationOpts
						val hdrExtLen = read(nextEhStart+8, 8)
						var nextOptStart = nextEhStart+16
						nextEhStart += 64+hdrExtLen*64
						
						var optDataLen = 0
						var optionType = 0
						while (nextOptStart < nextEhStart) {
							optionType = read(nextOptStart, 8)
							optDataLen = optionType == 0 ? 1 : read(nextOptStart+8, 8)
							switch (optionType) {
								case 0: eh.options.add(LehoFactory.eINSTANCE.createPad1)
								case 1: eh.options.add(LehoFactory.eINSTANCE.createPadN)
								case 77: eh.options.add(LehoFactory.eINSTANCE.createDeprecated)
								case 138: eh.options.add(LehoFactory.eINSTANCE.createEndPointIdentification)
								case optionType == 30 || optionType == 62 || optionType == 94 || optionType == 126  || optionType == 158 || optionType == 190 || optionType == 222 || optionType == 254: 
									eh.options.add(LehoFactory.eINSTANCE.createRFC3692Experiment)
								case 4: {
									eh.options.add(LehoFactory.eINSTANCE.createTunnelEncapsulationLimit)
									optDataLen = 3
								}
								case 15: eh.options.add(LehoFactory.eINSTANCE.createIPv6PerformanceDiagnostic)
								case 139: eh.options.add(LehoFactory.eINSTANCE.createILNPNonce)
								case 140: eh.options.add(LehoFactory.eINSTANCE.createLineIdOption)
								case 201: eh.options.add(LehoFactory.eINSTANCE.createHomeAdress)
							}
							nextOptStart += optDataLen*8
						}
						currentPacket.extensionheader.add(eh)
					}
					case 135: { // mobility header
						currentPacket.extensionheader.add(LehoFactory.eINSTANCE.createMobilityHeader)
						nextEhStart += 64+read(nextEhStart+8, 8)*64
					}
					case 139: { // host identity protocol
						currentPacket.extensionheader.add(LehoFactory.eINSTANCE.createHostIdentityProtocol)
						nextEhStart += 8+read(nextEhStart+8, 8)*8
					}
					case 140: { // shim6 protocol
						currentPacket.extensionheader.add(LehoFactory.eINSTANCE.createShim6Protocol)
						nextEhStart += 64
					}
					case nextHeader == 253 || nextHeader == 254: { // Experimentation and testing
						currentPacket.extensionheader.add(LehoFactory.eINSTANCE.createExperimentationAndTesting)
						nextHeader = 59
					}
					default: { //unknown header
						currentPacket.extensionheader.add(LehoFactory.eINSTANCE.createUnknownEH)
					}
				}
				nextHeader = saveNext != 59 ? saveNext : 59
			}
			
			// source address
			currentPacket.sourceAddress = new BigInteger(currentPacket.rawContent.toString.substring(64, 64 + 128), 2)
			// destination address 
			currentPacket.destinationAddress = new BigInteger(currentPacket.rawContent.toString.substring(192, 192 + 128), 2)
			
			root.packets.add(currentPacket)
		}
		input.close
	}
	
	static var FileOutputStream output = null
	
	def static createOutputFile(File outputData) {
		output = new FileOutputStream(outputData)
		output.write(''.getBytes)
	}
	
	def static writePacket(Packet packet, Port port) {
		var outPacket = "("+packet.time+";"+ port.number+";"+packet.rawContent+")\n"
		output.write(outPacket.getBytes)
	}
}