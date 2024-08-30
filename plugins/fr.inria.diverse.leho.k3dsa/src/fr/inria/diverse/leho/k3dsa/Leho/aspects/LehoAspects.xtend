package fr.inria.diverse.leho.k3dsa.Leho.aspects

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.leho.k3dsa.Leho.modules.IOModule
import fr.inria.diverse.leho.k3dsa.Leho.modules.MessagingModule
import fr.inria.diverse.leho.k3dsa.Leho.src.ConfigPort
import fr.inria.diverse.leho.model.leho.Accept
import fr.inria.diverse.leho.model.leho.Action
import fr.inria.diverse.leho.model.leho.AuthentificationHeader
import fr.inria.diverse.leho.model.leho.Bandwidth
import fr.inria.diverse.leho.model.leho.BitUnit
import fr.inria.diverse.leho.model.leho.Calipso
import fr.inria.diverse.leho.model.leho.Configuration
import fr.inria.diverse.leho.model.leho.DFF
import fr.inria.diverse.leho.model.leho.Day
import fr.inria.diverse.leho.model.leho.DestinationOpts
import fr.inria.diverse.leho.model.leho.Discard
import fr.inria.diverse.leho.model.leho.DiscardDrop
import fr.inria.diverse.leho.model.leho.DiscardReject
import fr.inria.diverse.leho.model.leho.Drop
import fr.inria.diverse.leho.model.leho.EncapsulingSecurityPayload
import fr.inria.diverse.leho.model.leho.EndPointIdentification
import fr.inria.diverse.leho.model.leho.ExperimentationAndTesting
import fr.inria.diverse.leho.model.leho.ExtensionHeader
import fr.inria.diverse.leho.model.leho.Filter
import fr.inria.diverse.leho.model.leho.Fragment
import fr.inria.diverse.leho.model.leho.HomeAdress
import fr.inria.diverse.leho.model.leho.HopByHopOpts
import fr.inria.diverse.leho.model.leho.HostIdentityProtocol
import fr.inria.diverse.leho.model.leho.Hour
import fr.inria.diverse.leho.model.leho.ILNPNonce
import fr.inria.diverse.leho.model.leho.IPv6PerformanceDiagnostic
import fr.inria.diverse.leho.model.leho.Inbound
import fr.inria.diverse.leho.model.leho.IpAddSpec
import fr.inria.diverse.leho.model.leho.JumboPayload
import fr.inria.diverse.leho.model.leho.LehoFactory
import fr.inria.diverse.leho.model.leho.LineIdOption
import fr.inria.diverse.leho.model.leho.MLD
import fr.inria.diverse.leho.model.leho.MPLOption
import fr.inria.diverse.leho.model.leho.Minute
import fr.inria.diverse.leho.model.leho.MobilityHeader
import fr.inria.diverse.leho.model.leho.Nimrod
import fr.inria.diverse.leho.model.leho.OctetUnit
import fr.inria.diverse.leho.model.leho.OptionDestination
import fr.inria.diverse.leho.model.leho.OptionHopByHop
import fr.inria.diverse.leho.model.leho.Options
import fr.inria.diverse.leho.model.leho.Outbound
import fr.inria.diverse.leho.model.leho.Packet
import fr.inria.diverse.leho.model.leho.PacketUnit
import fr.inria.diverse.leho.model.leho.Pad1
import fr.inria.diverse.leho.model.leho.PadN
import fr.inria.diverse.leho.model.leho.Policy
import fr.inria.diverse.leho.model.leho.Protocol
import fr.inria.diverse.leho.model.leho.QuickStart
import fr.inria.diverse.leho.model.leho.RFC3692Experiment
import fr.inria.diverse.leho.model.leho.RFC3692Experiment1
import fr.inria.diverse.leho.model.leho.RFC3692Experiment2
import fr.inria.diverse.leho.model.leho.RPLOption
import fr.inria.diverse.leho.model.leho.RPLSource
import fr.inria.diverse.leho.model.leho.RSVP
import fr.inria.diverse.leho.model.leho.Reject
import fr.inria.diverse.leho.model.leho.Reserved
import fr.inria.diverse.leho.model.leho.RouterAlert
import fr.inria.diverse.leho.model.leho.Routing
import fr.inria.diverse.leho.model.leho.Rule
import fr.inria.diverse.leho.model.leho.Second
import fr.inria.diverse.leho.model.leho.Segment
import fr.inria.diverse.leho.model.leho.Shim6Protocol
import fr.inria.diverse.leho.model.leho.Side
import fr.inria.diverse.leho.model.leho.SmfDpd
import fr.inria.diverse.leho.model.leho.SourceRoute
import fr.inria.diverse.leho.model.leho.TunnelEncapsulationLimit
import fr.inria.diverse.leho.model.leho.Type2
import fr.inria.diverse.leho.model.leho.TypeRouting
import fr.inria.diverse.leho.model.leho.Unassigned
import fr.inria.diverse.leho.model.leho.UnknownEH
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.math.BigInteger
import java.net.InetAddress
import java.util.ArrayList
import java.util.Scanner
import org.eclipse.core.resources.IWorkspace
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.common.util.EList

import static fr.inria.diverse.leho.k3dsa.Leho.aspects.PolicyAspect.*

import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.ActionAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.ConfigurationAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.FilterAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.IpAddSpecAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.RuleAspect.*

@Aspect(className=Policy)
class PolicyAspect {
	public static boolean endOfFilter
	public static FileOutputStream outputFile
	
	@Step
	@InitializeModel
	def void initializeModel(EList<String> args) {
		val IWorkspace workspace = ResourcesPlugin.getWorkspace()
		try {
			_self.inbound = LehoFactory.eINSTANCE.createInbound
			_self.outbound = LehoFactory.eINSTANCE.createOutbound
			
			var mapper = new ObjectMapper(new YAMLFactory())
			
			val portOracle = new File(workspace.root.findMember(args.get(2)).locationURI.path)
			val input = new Scanner(portOracle)
			val configs = new ArrayList<ConfigPort>
			while (input.hasNextLine) {
				var line = input.nextLine
				for (var i=0; i<3; i++) {
					line += "\n" + input.nextLine
				}
				var configPort = mapper.readValue(line, typeof(ConfigPort))
				configs.add(configPort)
				var port = LehoFactory.eINSTANCE.createPort
				port.number = configPort.number
				if (configPort.side.toLowerCase.equals("inside") || configPort.side.toLowerCase.equals("inbound"))
					port.side = _self.inbound
				else if (configPort.side.toLowerCase.equals("outside") || configPort.side.toLowerCase.equals("outbound"))
					port.side = _self.outbound
				else {
					MessagingModule.error("Configuration of ports: Wrong side, a side must be desiganted by terms \"inside\" \"inbound\" \"outside\" or \"outbound\". Go check port_config.yaml.")
					throw new Exception("Wrong side name") 
				}
				_self.inPorts.add(port)
			}
			for (port: _self.inPorts) {
				port.mappedOut = _self.inPorts.findFirst[p | p.number == configs.findFirst[c | c.number == port.number].out]
			}
			input.close
		} catch(NullPointerException e) {
			MessagingModule.error("Port file " + args.get(2) + " not found. Go check run configurations")
			e.printStackTrace
		}
		// ------------ Read input file and create the packets ------------ //
		_self.packets.clear
		
		try {			
			IOModule.createPacketsFromFile(_self, new File(workspace.root.findMember(args.get(0)).locationURI.path))
		} catch(FileNotFoundException e) {
			MessagingModule.error("Input file " + args.get(0) + "not found. Go check run configurations")
			e.printStackTrace
		}
		try {
			outputFile = new FileOutputStream(new File(workspace.root.findMember(args.get(1)).locationURI.path))
		} catch(NullPointerException e) {
			MessagingModule.error("Output file " + args.get(1) + "not found. Go check run configurations")
			e.printStackTrace
		}
		
	}
    
    @Main
    @Step
    def void run() {
    	_self.configuration.run()
    	for (packet : _self.packets) {
	 		endOfFilter = false
			_self.filter.currentPacket = packet
			_self.filter.currentTime = packet.time
	 		_self.filter.run(_self)
		}
    }
}

@Aspect(className=Filter)
class FilterAspect {
	def void run(Policy root) {
		_self.currentRule = _self.firstRule
		while (_self.currentRule !== null && !PolicyAspect.endOfFilter) {
			_self.currentRule.run(root)
			_self.currentRule = _self.currentRule.next
		}
	}
}

@Aspect(className=Packet)
class PacketAspect {}

// --------------------------------------------------------------- //
// ------------------------ CONFIGURATION ------------------------ //
// --------------------------------------------------------------- //

@Aspect(className=Configuration)
abstract class ConfigurationAspect { 
	public static var Action discard
	
	def void run() {
		MessagingModule.error("Configuration: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
	}
}

@Aspect(className=DiscardDrop)
class DiscardDropAspect extends ConfigurationAspect {
	def void run() {
		discard = LehoFactory.eINSTANCE.createDrop
	}
}

@Aspect(className=DiscardReject)
class DiscardRejectAspect extends ConfigurationAspect {
	def void run() {
		discard = LehoFactory.eINSTANCE.createReject
	}
}

// ------------------------------------------------------ //
// ------------------------ RULE ------------------------ //
// ------------------------------------------------------ //

@Aspect(className=Rule)
class RuleAspect {
	def void run(Policy root) {
		// evaluate address range 
		var from = _self.from === null ? true : _self.from.eval(root, true)
		var to = _self.to === null ? true : _self.to.eval(root, true)
		
		// evaluate extension header content
		var packetSpec = true
		for (eh: _self.extensionheader) {
			if (!root.filter.currentPacket.extensionheader.exists[ext | ext.class === eh.class])
				packetSpec = false
		}
		
		// evaluate rule
		if (from && to && packetSpec) {
			_self.action.run(root)
		}
	}
}

@Aspect(className=IpAddSpec)
class IpAddSpecAspect {
	def Boolean eval(Policy root, Boolean type) {
		if((_self.port !== null && (_self.port.number.equals(root.filter.currentPacket.inPort.number) || _self.port.equals("any"))) || _self.port === null) {
			val compIp = new BigInteger(1, InetAddress.getByName(_self.adress).getAddress())
			if ((type && root.filter.currentPacket.sourceAddress >= compIp) || (!type && root.filter.currentPacket.destinationAddress <= compIp)) return true
		}
		return false
	}
}

// ------------------------ Port ------------------------ //

@Aspect(className=Side)
class SideAspect {
	def Boolean eval(Policy root) {
		MessagingModule.error("Port: run of " +_self +" should never occur, please tell the developer to write a method run for this class") 
		return false 
	}
}

@Aspect(className=Inbound)
class InboundAspect {
	def Boolean eval(Policy root) {
		return root.filter.currentPacket.inPort.side instanceof Inbound
	}
}

@Aspect(className=Outbound)
class OutboundAspect {
	def Boolean eval(Policy root) {
		return root.filter.currentPacket.inPort.side instanceof Outbound
	}
}

// ------------------------ Extension Header ------------------------ //

@Aspect(className=ExtensionHeader)
abstract class ExtensionHeaderAspect {}

@Aspect(className=HopByHopOpts)
class HopByHopOptsAspect extends ExtensionHeaderAspect {}

@Aspect(className=Routing)
class RoutingAspect extends ExtensionHeaderAspect {}

@Aspect(className=Fragment)
class FragmentAspect extends ExtensionHeaderAspect {}

@Aspect(className=EncapsulingSecurityPayload)
class EncapsulingSecurityPayloadAspect extends ExtensionHeaderAspect {}

@Aspect(className=AuthentificationHeader)
class AuthentificationHeaderAspect extends ExtensionHeaderAspect {}

@Aspect(className=DestinationOpts)
class DestinationOptsAspect extends ExtensionHeaderAspect {}

@Aspect(className=MobilityHeader)
class MobilityHeaderAspect extends ExtensionHeaderAspect {}

@Aspect(className=HostIdentityProtocol)
class HostIdentityProtocolAspect extends ExtensionHeaderAspect {}

@Aspect(className=Shim6Protocol)
class Shim6ProtocolAspect extends ExtensionHeaderAspect {}

@Aspect(className=ExperimentationAndTesting)
class ExperimentationAndTestingAspect extends ExtensionHeaderAspect {}

@Aspect(className=UnknownEH)
class UnknownEHAspect extends ExtensionHeaderAspect {}

// ------------------------ Options ------------------------ //

@Aspect(className=Options, with=#[OptionDestinationAspect])
abstract class OptionsAspect extends OptionHopByHopAspect {}

@Aspect(className=Pad1)
class Pad1Aspect extends OptionsAspect {}

@Aspect(className=PadN)
class PadNAspect extends OptionsAspect {}

@Aspect(className=Deprecated)
class DeprecatedAspect extends OptionsAspect {}

@Aspect(className=EndPointIdentification)
class EndPointIdentificationAspect extends OptionsAspect {}

@Aspect(className=RFC3692Experiment)
class RFC3692ExperimentAspect extends OptionsAspect {}

@Aspect(className=OptionHopByHop)
abstract class OptionHopByHopAspect {}

@Aspect(className=RouterAlert)
class RouterAlertAspect extends OptionHopByHopAspect {}

@Aspect(className=Calipso)
class CalipsoAspect extends OptionHopByHopAspect {}

@Aspect(className=SmfDpd)
class SmfDpdAspect extends OptionHopByHopAspect {}

@Aspect(className=RPLOption)
class RPLOptionAspect extends OptionHopByHopAspect {}

@Aspect(className=QuickStart)
class QuickStartAspect extends OptionHopByHopAspect {}

@Aspect(className=MPLOption)
class MPLOptionAspect extends OptionHopByHopAspect {}

@Aspect(className=JumboPayload)
class JumboPayloadAspect extends OptionHopByHopAspect {}

@Aspect(className=DFF)
class DFFAspect extends OptionHopByHopAspect {}

@Aspect(className=OptionDestination)
abstract class OptionDestinationAspect {}

@Aspect(className=TunnelEncapsulationLimit)
class TunnelEncapsulationLimitAspect extends OptionDestinationAspect {}

@Aspect(className=IPv6PerformanceDiagnostic)
class IPv6PerformanceDiagnosticAspect extends OptionDestinationAspect {}

@Aspect(className=ILNPNonce)
class ILNPNonceAspect extends OptionDestinationAspect {}

@Aspect(className=LineIdOption)
class LineIdOptionAspect extends OptionDestinationAspect {}

@Aspect(className=HomeAdress)
class HomeAdressAspect extends OptionDestinationAspect {}

// ------------------------ Protocol of router alert ------------------------ //

@Aspect(className=Protocol)
abstract class ProtocolAspect {}

@Aspect(className=RSVP)
class RSVPAspect extends ProtocolAspect {}

@Aspect(className=MLD)
class MLDAspect extends ProtocolAspect {}

// ------------------------ Type for routing ------------------------ //

@Aspect(className=TypeRouting)
abstract class TypeRoutingAspect {}

@Aspect(className=SourceRoute)
class SourceRouteAspect extends TypeRoutingAspect {}

@Aspect(className=Nimrod)
class NimrodAspect extends TypeRoutingAspect {}

@Aspect(className=Type2)
class Type2Aspect extends TypeRoutingAspect {}

@Aspect(className=RPLSource)
class RPLSourceAspect extends TypeRoutingAspect {}

@Aspect(className=Segment)
class SegmentAspect extends TypeRoutingAspect {}

@Aspect(className=Unassigned)
class UnassignedAspect extends TypeRoutingAspect {}

@Aspect(className=RFC3692Experiment1)
class RFC3692Experiment1Aspect extends TypeRoutingAspect {}

@Aspect(className=RFC3692Experiment2)
class RFC3692Experiment2Aspect extends TypeRoutingAspect {}

@Aspect(className=Reserved)
class ReservedAspect extends TypeRoutingAspect {}

// -------------------------------------------------------- //
// ------------------------ ACTION ------------------------ //
// -------------------------------------------------------- //

@Aspect(className=Action)
abstract class ActionAspect {
	def void run(Policy root) {
		MessagingModule.error("Action: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
	}
}

@Aspect(className=Accept)
class AcceptAspect extends ActionAspect {
	def void run(Policy root) {
	 	MessagingModule.debug("ACCEPT\n")
		
		IOModule.writePacket(root.filter.currentPacket, root.filter.currentPacket.inPort.mappedOut, outputFile)
		endOfFilter = true
	 }
}

@Aspect(className=Drop)
class DropAspect extends ActionAspect {
	def void run(Policy root) {
		MessagingModule.debug("DROP\n")
		endOfFilter = true
	}
}

@Aspect(className=Reject)
class RejectAspect extends ActionAspect {
	// TODO later: change to a real reject
	// (would take too much time with all the particular cases)
	def void run(Policy root) {
	 	val drop = LehoFactory.eINSTANCE.createDrop
	 	drop.run(root)
	}
}

@Aspect(className=Discard)
class DiscardAspect extends ActionAspect {
	def void run(Policy root) {
		discard.run(root)
	}
}

@Aspect(className=Bandwidth)
class BandwidthAspect extends ActionAspect {
	public static var nextAcceptTime = 0
	public static var nbPackets = 0
	public static var nbOctets = 0
	public static var nbBits = 0
	
	def void run(Policy root) {
		val time = _self.time instanceof Day ? 86400 :
			_self.time instanceof Hour ? 3600 :
			_self.time instanceof Minute ? 60 :
			_self.time instanceof Second ? 1
			
		nbPackets++
		nbOctets += root.filter.currentPacket.rawContent.length/8
		nbBits += root.filter.currentPacket.rawContent.length
			
		val unit = _self.unit instanceof PacketUnit ? nbPackets :
			_self.unit instanceof OctetUnit ? nbOctets :
			_self.unit instanceof BitUnit ? nbBits
			
		if(unit > _self.number) {
			nextAcceptTime = root.filter.currentTime+time
		}
		if(root.filter.currentTime < nextAcceptTime) {
			val drop = LehoFactory.eINSTANCE.createDrop
	 		drop.run(root)
		}
		// if the limitation is finished
		if (root.filter.currentTime > nextAcceptTime && unit > _self.number) {
			nbPackets = 0
			nbOctets = 0
			nbBits = 0
		}
	}
}