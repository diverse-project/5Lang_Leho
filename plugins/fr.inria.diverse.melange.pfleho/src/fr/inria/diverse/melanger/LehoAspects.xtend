package fr.inria.diverse.melanger

import fr.inria.diverse.gpfl.k3dsa.Gpfl.modules.MessagingModule
import fr.inria.diverse.gpfl.model.gpfl.GpflFactory
import fr.inria.diverse.gpfl.model.gpfl.Policy
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.leho.model.leho.Accept
import fr.inria.diverse.leho.model.leho.Action
import fr.inria.diverse.leho.model.leho.AuthentificationHeader
import fr.inria.diverse.leho.model.leho.Bandwidth
import fr.inria.diverse.leho.model.leho.BitUnit
import fr.inria.diverse.leho.model.leho.Calipso
import fr.inria.diverse.leho.model.leho.Configuration
import fr.inria.diverse.leho.model.leho.DFF
import fr.inria.diverse.leho.model.leho.Day
import fr.inria.diverse.leho.model.leho.Deprecated
import fr.inria.diverse.leho.model.leho.DestinationOpts
import fr.inria.diverse.leho.model.leho.Discard
import fr.inria.diverse.leho.model.leho.DiscardDrop
import fr.inria.diverse.leho.model.leho.DiscardReject
import fr.inria.diverse.leho.model.leho.Drop
import fr.inria.diverse.leho.model.leho.EncapsulingSecurityPayload
import fr.inria.diverse.leho.model.leho.EndPointIdentification
import fr.inria.diverse.leho.model.leho.ExperimentationAndTesting
import fr.inria.diverse.leho.model.leho.ExtensionHeader
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
import fr.inria.diverse.leho.model.leho.PacketSpec
import fr.inria.diverse.leho.model.leho.PacketUnit
import fr.inria.diverse.leho.model.leho.Pad1
import fr.inria.diverse.leho.model.leho.PadN
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
import fr.inria.diverse.leho.model.leho.SmfDpd
import fr.inria.diverse.leho.model.leho.SourceRoute
import fr.inria.diverse.leho.model.leho.Time
import fr.inria.diverse.leho.model.leho.TunnelEncapsulationLimit
import fr.inria.diverse.leho.model.leho.Type2
import fr.inria.diverse.leho.model.leho.TypeInterface
import fr.inria.diverse.leho.model.leho.TypeRouting
import fr.inria.diverse.leho.model.leho.Unassigned
import fr.inria.diverse.leho.model.leho.Unit
import fr.inria.diverse.leho.model.leho.UnknownEH
import java.math.BigInteger
import java.net.InetAddress
import java.util.stream.IntStream

import static fr.inria.diverse.melanger.ConfigurationAspect.*

import static extension fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.AcceptAspect.*
import static extension fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.DropAspect.*
import static extension fr.inria.diverse.melanger.ActionAspect.*
import static extension fr.inria.diverse.melanger.ExtensionHeaderAspect.*
import static extension fr.inria.diverse.melanger.IpAddSpecAspect.*
import static extension fr.inria.diverse.melanger.OptionDestinationAspect.*
import static extension fr.inria.diverse.melanger.OptionHopByHopAspect.*
import static extension fr.inria.diverse.melanger.PacketSpecAspect.*
import static extension fr.inria.diverse.melanger.PolicyGlue.*
import static extension fr.inria.diverse.melanger.ProtocolAspect.*
import static extension fr.inria.diverse.melanger.TypeInterfaceAspect.*
import static extension fr.inria.diverse.melanger.TypeRoutingAspect.*

// --------------------------------------------------------------- //
// ------------------------ CONFIGURATION ------------------------ //
// --------------------------------------------------------------- //

@Aspect(className=Configuration)
abstract class ConfigurationAspect {
	public static var Action discard
	
	def void run() {
		MessagingModule.logger.error("Configuration: run of " +_self +" should never occur, please tell the developer to write a method run for this class", "Leho")
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
		var from = _self.from === null ? true : _self.from.eval(root, true)
		var to = _self.to === null ? true : _self.to.eval(root, true)
		if (from && to && _self.packetspec.eval(root)) {
			_self.action.run(root)
		}
	}
}

@Aspect(className=IpAddSpec)
class IpAddSpecAspect {
	def Boolean eval(Policy root, Boolean type) {
		if((_self.port !== null && (Integer.parseInt(_self.port).equals(root.currentPacket.inPort.number) || _self.port.equals("any"))) || _self.port === null) {
			val compIp = new BigInteger(1, InetAddress.getByName(_self.adress).getAddress())
			if ((type && root.read(64, 128) >= compIp) || (!type && root.read(192, 128) <= compIp)) return true
		}
		return false
	}
}

@Aspect(className=PacketSpec)
class PacketSpecAspect {
	public static var int nextHeader
	public static var nextEhStart = 320
	
	def Boolean eval(Policy root) {
		if(_self.port !== null && !_self.port.eval(root)) return false
		nextHeader = root.read(48, 8).intValue
		for(var i=0; i<_self.extensionheader.length &&  nextHeader!= 59; i++) {
			if(!_self.extensionheader.get(i).eval(root)) return false
			nextHeader = root.read(nextEhStart, 8).intValue
		}
	}
}

// ------------------------ Port ------------------------ //

@Aspect(className=TypeInterface)
class TypeInterfaceAspect {
	def Boolean eval(Policy root) {
		MessagingModule.logger.error("Port: run of " +_self +" should never occur, please tell the developer to write a method run for this class", "Leho") 
		return false 
	}
}

@Aspect(className=Inbound)
class InboundAspect {
	def Boolean eval(Policy root) {
		if(root.currentPacket.inPort.interface.name.equals("inbound"))
			return true
		return false
	} 
}

@Aspect(className=Outbound)
class OutboundAspect {
	def Boolean eval(Policy root) {
		if(root.currentPacket.inPort.interface.name.equals("outbound"))
			return true
		return false
	} 
}

// ------------------------ Extension Header ------------------------ //

@Aspect(className=ExtensionHeader)
abstract class ExtensionHeaderAspect {
	def Boolean eval(Policy root) {
		MessagingModule.logger.error("EH: run of " +_self +" should never occur, please tell the developer to write a method run for this class", "Leho")
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
class Shim6ProtocolAspect extends ExtensionHeaderAspect {
	// https://www.rfc-editor.org/rfc/rfc5533.html#section-5.1
	def Boolean eval(Policy root) {
		if(nextHeader == 140) {
			nextEhStart += 64+root.read(nextEhStart+8, 8).intValue*64
			return true
		}
		return false
	}
}

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
		MessagingModule.logger.error("Options: run of " +_self +" should never occur, please tell the developer to write a method run for this class", "Leho")
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
		MessagingModule.logger.error("Options Hop By Hop: run of " +_self +" should never occur, please tell the developer to write a method run for this class", "Leho")
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
		MessagingModule.logger.error("Options Destination: run of " +_self +" should never occur, please tell the developer to write a method run for this class", "Leho")
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
		MessagingModule.logger.error("Protocol: run of " +_self +" should never occur, please tell the developer to write a method run for this class", "Leho")
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
		MessagingModule.logger.error("Type routing: run of " +_self +" should never occur, please tell the developer to write a method run for this class", "Leho")
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
		MessagingModule.logger.error("Action: run of " +_self +" should never occur, please tell the developer to write a method run for this class", "Leho")
	}
}

@Aspect(className=Drop)
class DropAspect extends ActionAspect {
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

@Aspect(className=Unit)
abstract class UnitAspect {}
@Aspect(className=Time)
abstract class TimeAspect {}
@Aspect(className=BitUnit)
class BitUnitAspect extends UnitAspect {}
@Aspect(className=OctetUnit)
class OctetUnitAspect extends UnitAspect {}
@Aspect(className=PacketUnit)
class PacketUnitAspect extends UnitAspect {}
@Aspect(className=Second)
class SecondAspect extends TimeAspect {}
@Aspect(className=Minute)
class MinuteAspect extends TimeAspect {}
@Aspect(className=Hour)
class HourAspect extends TimeAspect {}
@Aspect(className=Day)
class DayAspect extends TimeAspect {}

