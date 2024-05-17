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
import fr.inria.diverse.eho.model.eho.PacketSpec
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
import fr.inria.diverse.eho.model.eho.TypeInterface
import fr.inria.diverse.eho.model.eho.TypeRouting
import fr.inria.diverse.eho.model.eho.Unassigned
import fr.inria.diverse.eho.model.eho.UnknownEH
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.stream.IntStream

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
class RuleAspect {}

@Aspect(className=IpAddSpec)
class IpAddSpecAspect {}

@Aspect(className=PacketSpec)
class PacketSpecAspect {}

// ------------------------ Port ------------------------ //

@Aspect(className=TypeInterface)
class TypeInterfaceAspect {
	def Boolean eval() {
		EhoMessagingModule.error("Port: run of " +_self +" should never occur, please tell the developer to write a method run for this class") 
		return false 
	}
}

@Aspect(className=Inbound)
class InboundAspect {}

@Aspect(className=Outbound)
class OutboundAspect {}

// ------------------------ Extension Header ------------------------ //

@Aspect(className=ExtensionHeader)
abstract class ExtensionHeaderAspect {
	def Boolean eval() {
		EhoMessagingModule.error("EH: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
		return false
	}
}

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
	def void run() {
		EhoMessagingModule.error("Action: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
	}
}

@Aspect(className=Drop)
class DropAspect extends ActionAspect {}

@Aspect(className=Reject)
class RejectAspect extends ActionAspect {}

@Aspect(className=Discard)
class DiscardAspect extends ActionAspect {}

@Aspect(className=Accept)
class AcceptAspect extends ActionAspect {}

@Aspect(className=Bandwidth)
class BandwidthAspect extends ActionAspect {}