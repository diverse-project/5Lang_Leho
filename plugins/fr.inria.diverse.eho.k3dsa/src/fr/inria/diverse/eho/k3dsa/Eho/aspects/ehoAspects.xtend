package fr.inria.diverse.eho.k3dsa.Eho.aspects

import fr.inria.diverse.eho.k3dsa.Eho.modules.EhoMessagingModule
import fr.inria.diverse.eho.model.eho.Accept
import fr.inria.diverse.eho.model.eho.Action
import fr.inria.diverse.eho.model.eho.AuthentificationHeader
import fr.inria.diverse.eho.model.eho.Bandwidth
import fr.inria.diverse.eho.model.eho.Calipso
import fr.inria.diverse.eho.model.eho.Configuration
import fr.inria.diverse.eho.model.eho.DFF
import fr.inria.diverse.eho.model.eho.Deprecated
import fr.inria.diverse.eho.model.eho.DestinationOpts
import fr.inria.diverse.eho.model.eho.Discard
import fr.inria.diverse.eho.model.eho.DiscardDrop
import fr.inria.diverse.eho.model.eho.DiscardReject
import fr.inria.diverse.eho.model.eho.Drop
import fr.inria.diverse.eho.model.eho.EhoFactory
import fr.inria.diverse.eho.model.eho.EncapsulingSecurityPayload
import fr.inria.diverse.eho.model.eho.EndPointIdentification
import fr.inria.diverse.eho.model.eho.ExperimentationAndTesting
import fr.inria.diverse.eho.model.eho.ExtensionHeader
import fr.inria.diverse.eho.model.eho.Fragment
import fr.inria.diverse.eho.model.eho.HomeAdress
import fr.inria.diverse.eho.model.eho.HopByHopOpts
import fr.inria.diverse.eho.model.eho.HostIdentityProtocol
import fr.inria.diverse.eho.model.eho.ILNPNonce
import fr.inria.diverse.eho.model.eho.IPv6PerformanceDiagnostic
import fr.inria.diverse.eho.model.eho.Inbound
import fr.inria.diverse.eho.model.eho.IpAddSpec
import fr.inria.diverse.eho.model.eho.JumboPayload
import fr.inria.diverse.eho.model.eho.LineIdOption
import fr.inria.diverse.eho.model.eho.MLD
import fr.inria.diverse.eho.model.eho.MPLOption
import fr.inria.diverse.eho.model.eho.MobilityHeader
import fr.inria.diverse.eho.model.eho.Nimrod
import fr.inria.diverse.eho.model.eho.OptionDestination
import fr.inria.diverse.eho.model.eho.OptionHopByHop
import fr.inria.diverse.eho.model.eho.Options
import fr.inria.diverse.eho.model.eho.Outbound
import fr.inria.diverse.eho.model.eho.Pad1
import fr.inria.diverse.eho.model.eho.PadN
import fr.inria.diverse.eho.model.eho.Protocol
import fr.inria.diverse.eho.model.eho.QuickStart
import fr.inria.diverse.eho.model.eho.RFC3692Experiment
import fr.inria.diverse.eho.model.eho.RFC3692Experiment1
import fr.inria.diverse.eho.model.eho.RFC3692Experiment2
import fr.inria.diverse.eho.model.eho.RPLOption
import fr.inria.diverse.eho.model.eho.RPLSource
import fr.inria.diverse.eho.model.eho.RSVP
import fr.inria.diverse.eho.model.eho.Reject
import fr.inria.diverse.eho.model.eho.Reserved
import fr.inria.diverse.eho.model.eho.RouterAlert
import fr.inria.diverse.eho.model.eho.Routing
import fr.inria.diverse.eho.model.eho.Rule
import fr.inria.diverse.eho.model.eho.Segment
import fr.inria.diverse.eho.model.eho.Shim6Protocol
import fr.inria.diverse.eho.model.eho.SmfDpd
import fr.inria.diverse.eho.model.eho.SourceRoute
import fr.inria.diverse.eho.model.eho.TunnelEncapsulationLimit
import fr.inria.diverse.eho.model.eho.Type2
import fr.inria.diverse.eho.model.eho.TypeRouting
import fr.inria.diverse.eho.model.eho.Unassigned
import fr.inria.diverse.eho.model.eho.UnknownEH
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.stream.IntStream
import fr.inria.diverse.eho.model.eho.Interface
import fr.inria.diverse.eho.model.eho.Policy

import static extension fr.inria.diverse.eho.k3dsa.Eho.aspects.ConfigurationAspect.*
import static extension fr.inria.diverse.eho.k3dsa.Eho.aspects.ProtocolAspect.*
import static extension fr.inria.diverse.eho.k3dsa.Eho.aspects.TypeRoutingAspect.*
import static extension fr.inria.diverse.eho.k3dsa.Eho.aspects.OptionHopByHopAspect.*
import static extension fr.inria.diverse.eho.k3dsa.Eho.aspects.OptionDestinationAspect.*
import static extension fr.inria.diverse.eho.k3dsa.Eho.aspects.ActionAspect.*
import static extension fr.inria.diverse.eho.k3dsa.Eho.aspects.IpAddSpecAspect.*
import static extension fr.inria.diverse.eho.k3dsa.Eho.aspects.RuleAspect.*
import static extension fr.inria.diverse.eho.k3dsa.Eho.aspects.ExtensionHeaderAspect.*
import static extension fr.inria.diverse.eho.k3dsa.Eho.aspects.InterfaceAspect.*
import static extension fr.inria.diverse.eho.k3dsa.Eho.aspects.ActionAspect.*
import java.math.BigInteger
import java.net.InetAddress

// --------------------------------------------------------------- //
// ------------------------ CONFIGURATION ------------------------ //
// --------------------------------------------------------------- //

@Aspect(className=Configuration)
abstract class ConfigurationAspect { 
	public static var Action discard
	
	def void run() {
		EhoMessagingModule.error("Configuration: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
	}
}

@Aspect(className=DiscardDrop)
class DiscardDropAspect extends ConfigurationAspect {
	def void run() {
		discard = EhoFactory.eINSTANCE.createDrop
	}
}

@Aspect(className=DiscardReject)
class DiscardRejectAspect extends ConfigurationAspect {
	def void run() {
		discard = EhoFactory.eINSTANCE.createReject
	}
}

// ------------------------------------------------------ //
// ------------------------ RULE ------------------------ //
// ------------------------------------------------------ //

@Aspect(className=Rule)
class RuleAspect {
	public static var ExtensionHeader nextHeader
	
	private def Boolean eval(Policy root) {
		nextHeader = root.filter.currentPacket.extensionheader.get(0)
		for(var i=0; i<_self.extensionheader.length &&  nextHeader!= 59; i++) {
			if(!_self.extensionheader.get(i).eval(root)) return false
			nextHeader = root.filter.currentPacket.extensionheader.get(i+1)
		}
		return true
	}
	
	def void run(Policy root) {
		var from = _self.from === null ? true : _self.from.eval(root, true)
		var to = _self.to === null ? true : _self.to.eval(root, true)
		var interface = _self.interface === null ? true : _self.interface.eval(root)
		var packetSpec = _self.eval(root)
		if (from && to && interface && packetSpec) {
			_self.action.run(root)
		}
	}
}

@Aspect(className=IpAddSpec)
class IpAddSpecAspect {
	def Boolean eval(Policy root, Boolean type) {
		if((_self.port !== null && (_self.port.equals(root.filter.currentPacket.inPort.number) || _self.port.equals("any"))) || _self.port === null) {
			val compIp = new BigInteger(1, InetAddress.getByName(_self.adress).getAddress())
			if ((type && root.filter.currentPacket.sourceAddress >= compIp) || (!type && root.filter.currentPacket.destinationAddress <= compIp)) return true
		}
		return false
	}
}


// ------------------------ Port ------------------------ //

@Aspect(className=Interface)
class InterfaceAspect {
	def Boolean eval(Policy root) {
		EhoMessagingModule.error("Port: run of " +_self +" should never occur, please tell the developer to write a method run for this class") 
		return false 
	}
}

@Aspect(className=Inbound)
class InboundAspect {
	def Boolean eval(Policy root) {
		return root.filter.currentPacket.inPort.interface instanceof Inbound
	}
}

@Aspect(className=Outbound)
class OutboundAspect {
	def Boolean eval(Policy root) {
		return root.filter.currentPacket.inPort.interface instanceof Outbound
	} 
}

// ------------------------ Extension Header ------------------------ //

@Aspect(className=ExtensionHeader)
abstract class ExtensionHeaderAspect {
	def Boolean eval(Policy root) {
		EhoMessagingModule.error("EH: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
		return false
	}
}

@Aspect(className=HopByHopOpts)
class HopByHopOptsAspect extends ExtensionHeaderAspect {
	def Boolean eval(Policy root) {
		if(nextHeader == 0) {
			
			val hdrExtLen = root.read(nextEhStart+8, 8).intValue
			nextEhStart += 64+hdrExtLen*64
			var optDataLen = 0
			for(option : _self.options) {
				var optionType = root.read(nextEhStart+optDataLen+16, 8).intValue
				optDataLen = optionType == 0 ? 8 : root.read(nextEhStart+16+8, 8).intValue
				if(!option.eval(optionType)) return false
				if(optionType == 5) {
					val protocol = root.read(nextEhStart+16+optDataLen+16, 16).intValue
					for (proto : (option as RouterAlert).protocol) {
						if(!proto.eval(protocol)) return false 
					}
				}
			}
			return true
		}
		return false
	}
}

@Aspect(className=Routing)
class RoutingAspect extends ExtensionHeaderAspect {
	def Boolean eval(Policy root) {
		if(nextHeader == 43) {
			val hdrExtLen = root.read(nextEhStart+8, 8).intValue
			var routingType = root.read(nextEhStart+8+8, 8).intValue
			nextEhStart += 64+hdrExtLen*64
			for(type : _self.types)
				if(type.eval(routingType)) return true
			return true
		}
		return false
	}
}

@Aspect(className=Fragment)
class FragmentAspect extends ExtensionHeaderAspect {
	def Boolean eval(Policy root) {
		if(nextHeader == 44) {
			nextEhStart += nextEhStart+64
			return true
		}
		return false
	}
}

@Aspect(className=EncapsulingSecurityPayload)
class EncapsulingSecurityPayloadAspect extends ExtensionHeaderAspect {
	def Boolean eval(Policy root) {
		if(nextHeader == 44) {
			nextHeader = 59
			// TODO understand how this header really works
			return true
		}
		return false
	}
}

@Aspect(className=AuthentificationHeader)
class AuthentificationHeaderAspect extends ExtensionHeaderAspect {
	// https://datatracker.ietf.org/doc/html/rfc4302#section-2
	def Boolean eval(Policy root) {
		if(nextHeader == 44) {
			nextEhStart += nextEhStart+64+(root.read(nextEhStart+8, 8).intValue *32)
			return true
		}
		return false
	}
}

@Aspect(className=DestinationOpts)
class DestinationOptsAspect extends ExtensionHeaderAspect {
	def Boolean eval(Policy root) {
		if(nextHeader == 60) {
			val hdrExtLen = root.read(nextEhStart+8, 8).intValue
			nextEhStart += 64+hdrExtLen*64
			var optDataLen = 0
			for(option : _self.options) {
				var optionType = root.read(nextEhStart+16+optDataLen, 8).intValue
				optDataLen = optionType == 0 ? 8 : root.read(nextEhStart+16+8, 8).intValue
				if(!option.eval(optionType)) return false
			}
			return true
		}
		return false
	}
}

@Aspect(className=MobilityHeader)
class MobilityHeaderAspect extends ExtensionHeaderAspect {
	// https://www.rfc-editor.org/rfc/set(nextEhStart, nextEhStart+8)rfc6275.html#section-6.1.1
	def Boolean eval(Policy root) {
		if(nextHeader == 135) {
			nextEhStart += 64+root.read(nextEhStart+8, 8).intValue*64
			return true
		}
		return false
	}
}

@Aspect(className=HostIdentityProtocol)
class HostIdentityProtocolAspect extends ExtensionHeaderAspect {
	// https://www.rfc-editor.org/rfc/rfc7401.html#section-5
	def Boolean eval(Policy root) {
		if(nextHeader == 139) {
			nextEhStart += 8+root.read(nextEhStart+8, 8).intValue*8
			return true
		}
		return false
	}
}

@Aspect(className=Shim6Protocol)
class Shim6ProtocolAspect extends ExtensionHeaderAspect {}

@Aspect(className=ExperimentationAndTesting)
class ExperimentationAndTestingAspect extends ExtensionHeaderAspect {
	// https://www.rfc-editor.org/rfc/rfc3692.html
	// https://www.rfc-editor.org/rfc/rfc4727.html
	def Boolean eval(Policy root) {
		if(nextHeader == 253 && nextHeader == 254) {
			nextHeader = 59
			return true
		}
		return false
	}
}

@Aspect(className=UnknownEH)
class UnknownEHAspect extends ExtensionHeaderAspect {
	def Boolean eval(Policy root) {
		val int[] knownHeaders = #[0, 43, 44, 50, 51, 60, 135, 139, 140, 253, 254]
		return IntStream.of(knownHeaders).anyMatch[num | num == nextHeader]
	}
}

// ------------------------ Options ------------------------ //

@Aspect(className=Options, with=#[OptionDestinationAspect])
abstract class OptionsAspect extends OptionHopByHopAspect {
	def Boolean eval(int optionType) {
		EhoMessagingModule.error("Options: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
		return false
	}
}

@Aspect(className=Pad1)
class Pad1Aspect extends OptionsAspect {
	def Boolean eval(int optionType) {
		return optionType == 0
	}
}

@Aspect(className=PadN)
class PadNAspect extends OptionsAspect {
	def Boolean eval(int optionType) {
		return optionType == 1
	}
}

@Aspect(className=Deprecated)
class DeprecatedAspect extends OptionsAspect {
	def Boolean eval(int optionType) {
		return optionType == 77
	}
}

@Aspect(className=EndPointIdentification)
class EndPointIdentificationAspect extends OptionsAspect {
	def Boolean eval(int optionType) {
		return optionType == 138
	}
}

@Aspect(className=RFC3692Experiment)
class RFC3692ExperimentAspect extends OptionsAspect {
	def Boolean eval(int optionType) {
		val int[] knownHeaders = #[30, 62, 94, 126, 158, 190, 222, 254]
		return IntStream.of(knownHeaders).anyMatch[num | num == optionType]
	}
}

@Aspect(className=OptionHopByHop)
abstract class OptionHopByHopAspect {
	def Boolean eval(int optionType) {
		EhoMessagingModule.error("Options Hop By Hop: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
		return false
	}
}

@Aspect(className=RouterAlert)
class RouterAlertAspect extends OptionHopByHopAspect {
	def Boolean eval(int optionType) {
		return optionType == 5
	}
}

@Aspect(className=Calipso)
class CalipsoAspect extends OptionHopByHopAspect {
	def Boolean eval(int optionType) {
		return optionType == 7
	}
}

@Aspect(className=SmfDpd)
class SmfDpdAspect extends OptionHopByHopAspect {
	def Boolean eval(int optionType) {
		return optionType == 8
	}
}

@Aspect(className=RPLOption)
class RPLOptionAspect extends OptionHopByHopAspect {
	def Boolean eval(int optionType) {
		return optionType == 35 || optionType == 99
	}
}

@Aspect(className=QuickStart)
class QuickStartAspect extends OptionHopByHopAspect {
	def Boolean eval(int optionType) {
		return optionType == 38
	}
}

@Aspect(className=MPLOption)
class MPLOptionAspect extends OptionHopByHopAspect {
	def Boolean eval(int optionType) {
		return optionType == 109
	}
}

@Aspect(className=JumboPayload)
class JumboPayloadAspect extends OptionHopByHopAspect {
	def Boolean eval(int optionType) {
		return optionType == 194
	}
}

@Aspect(className=DFF)
class DFFAspect extends OptionHopByHopAspect {
	def Boolean eval(int optionType) {
		return optionType == 238
	}
}

@Aspect(className=OptionDestination)
abstract class OptionDestinationAspect {
	def Boolean eval(int optionType) {
		EhoMessagingModule.error("Options Destination: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
		return false
	}
}

@Aspect(className=TunnelEncapsulationLimit)
class TunnelEncapsulationLimitAspect extends OptionDestinationAspect {
	def Boolean eval(int optionType) {
		return optionType == 4
	}
}

@Aspect(className=IPv6PerformanceDiagnostic)
class IPv6PerformanceDiagnosticAspect extends OptionDestinationAspect {
	def Boolean eval(int optionType) {
		return optionType == 15
	}
}

@Aspect(className=ILNPNonce)
class ILNPNonceAspect extends OptionDestinationAspect {
	def Boolean eval(int optionType) {
		return optionType == 139
	}
}

@Aspect(className=LineIdOption)
class LineIdOptionAspect extends OptionDestinationAspect {
	def Boolean eval(int optionType) {
		return optionType == 140
	}
}

@Aspect(className=HomeAdress)
class HomeAdressAspect extends OptionDestinationAspect {
	def Boolean eval(int optionType) {
		return optionType == 201
	}
}

// ------------------------ Protocol of router alert ------------------------ //

@Aspect(className=Protocol)
abstract class ProtocolAspect {
	def Boolean eval(int protocol) {
		EhoMessagingModule.error("Protocol: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
		return false
	}
}

@Aspect(className=RSVP)
class RSVPAspect extends ProtocolAspect {
	def Boolean eval(int protocol) {
		return protocol == 0
	}
}

@Aspect(className=MLD)
class MLDAspect extends ProtocolAspect {
	def Boolean eval(int protocol) {
		return protocol == 1
	}
}

// ------------------------ Type for routing ------------------------ //

@Aspect(className=TypeRouting)
abstract class TypeRoutingAspect {
	def Boolean eval(int routingType) {
		EhoMessagingModule.error("Type routing: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
		return false
	}
}

@Aspect(className=SourceRoute)
class SourceRouteAspect extends TypeRoutingAspect {
	def Boolean eval(int routingType) {
		return routingType == 0
	}
}

@Aspect(className=Nimrod)
class NimrodAspect extends TypeRoutingAspect {
	def Boolean eval(int routingType) {
		return routingType == 1
	}
}

@Aspect(className=Type2)
class Type2Aspect extends TypeRoutingAspect {
	def Boolean eval(int routingType) {
		return routingType == 2
	}
}

@Aspect(className=RPLSource)
class RPLSourceAspect extends TypeRoutingAspect {
	def Boolean eval(int routingType) {
		return routingType == 3
	}
}

@Aspect(className=Segment)
class SegmentAspect extends TypeRoutingAspect {
	def Boolean eval(int routingType) {
		return routingType == 4
	}
}

@Aspect(className=Unassigned)
class UnassignedAspect extends TypeRoutingAspect {
	def Boolean eval(int routingType) {
		return routingType >= 5 || routingType <= 252
	}
}

@Aspect(className=RFC3692Experiment1)
class RFC3692Experiment1Aspect extends TypeRoutingAspect {
	def Boolean eval(int routingType) {
		return routingType == 253
	}
}

@Aspect(className=RFC3692Experiment2)
class RFC3692Experiment2Aspect extends TypeRoutingAspect {
	def Boolean eval(int routingType) {
		return routingType == 254
	}
}

@Aspect(className=Reserved)
class ReservedAspect extends TypeRoutingAspect {
	def Boolean eval(int routingType) {
		return routingType == 255
	}
}

// -------------------------------------------------------- //
// ------------------------ ACTION ------------------------ //
// -------------------------------------------------------- //

@Aspect(className=Action)
abstract class ActionAspect {
	def void run(Policy root) {
		EhoMessagingModule.error("Action: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
	}
}

@Aspect(className=Drop)
class DropAspect extends ActionAspect {
	// TODO: voir si la reuse se fait pas toute seul sur ses classes en double 
	 def void run(Policy root) {
	 	val drop = GpflFactory.eINSTANCE.createDrop
	 	drop.run(root)
	 }
}

@Aspect(className=Reject)
class RejectAspect extends ActionAspect {
	// TODO later: change to a real reject
	// (would take too much time with all the particular cases)
	def void run(Policy root) {
	 	val drop = EhoFactory.eINSTANCE.createDrop
	 	drop.run(root)
	}
}

@Aspect(className=Discard)
class DiscardAspect extends ActionAspect {
	def void run(Policy root) {
		discard.run(root)
	}
}

@Aspect(className=Accept)
class AcceptAspect extends ActionAspect {
	def void run(Policy root) {
	 	val accept = GpflFactory.eINSTANCE.createAccept
	 	accept.run(root)
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
		nbOctets += root.currentPacket.content.length/8
		nbBits += root.currentPacket.content.length
			
		val unit = _self.unit instanceof PacketUnit ? nbPackets :
			_self.unit instanceof OctetUnit ? nbOctets :
			_self.unit instanceof BitUnit ? nbBits
			
		if(unit > _self.number) {
			nextAcceptTime = root.currentTime+time
		}
		if(root.currentTime < nextAcceptTime) {
			val drop = GpflFactory.eINSTANCE.createDrop
	 		drop.run(root)
		}
		// if the limitation is finished
		if (root.currentTime > nextAcceptTime && unit > _self.number) {
			nbPackets = 0
			nbOctets = 0
			nbBits = 0
		}
	}	
}
