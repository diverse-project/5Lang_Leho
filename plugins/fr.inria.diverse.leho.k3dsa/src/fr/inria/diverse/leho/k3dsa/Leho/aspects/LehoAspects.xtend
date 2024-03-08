package fr.inria.diverse.leho.k3dsa.Leho.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.leho.model.Leho.Configuration
import fr.inria.diverse.leho.model.Leho.Drop
import fr.inria.diverse.leho.model.Leho.Reject
import fr.inria.diverse.leho.model.Leho.Action
import fr.inria.diverse.leho.model.Leho.Allow
import fr.inria.diverse.leho.model.Leho.Discard
import fr.inria.diverse.leho.model.Leho.PacketSpec
import fr.inria.diverse.leho.model.Leho.Inbound
import fr.inria.diverse.leho.model.Leho.Outbound
import fr.inria.diverse.leho.model.Leho.Bandwidth
import fr.inria.diverse.leho.model.Leho.Unit
import fr.inria.diverse.leho.model.Leho.Time
import fr.inria.diverse.leho.model.Leho.BitUnit
import fr.inria.diverse.leho.model.Leho.OctetUnit
import fr.inria.diverse.leho.model.Leho.PacketUnit
import fr.inria.diverse.leho.model.Leho.Second
import fr.inria.diverse.leho.model.Leho.Minute
import fr.inria.diverse.leho.model.Leho.Hour
import fr.inria.diverse.leho.model.Leho.Day
import fr.inria.diverse.leho.model.Leho.ExtensionHeader
import fr.inria.diverse.leho.model.Leho.OptionHopByHop
import fr.inria.diverse.leho.model.Leho.HopByHopOpts
import fr.inria.diverse.leho.model.Leho.Routing
import fr.inria.diverse.leho.model.Leho.Fragment
import fr.inria.diverse.leho.model.Leho.EncapsulingSecurityPayload
import fr.inria.diverse.leho.model.Leho.AuthentificationHeader
import fr.inria.diverse.leho.model.Leho.DestinationOpts
import fr.inria.diverse.leho.model.Leho.MobilityHeader
import fr.inria.diverse.leho.model.Leho.UnknownEH
import fr.inria.diverse.leho.model.Leho.ExperimentationAndTesting
import fr.inria.diverse.leho.model.Leho.HostIdentityProtocol
import fr.inria.diverse.leho.model.Leho.Shim6Protocol
import fr.inria.diverse.leho.model.Leho.Pad1
import fr.inria.diverse.leho.model.Leho.PadN
import fr.inria.diverse.leho.model.Leho.JumboPayload
import fr.inria.diverse.leho.model.Leho.RPLOption
import fr.inria.diverse.leho.model.Leho.TunnelEncapsulationLimit
import fr.inria.diverse.leho.model.Leho.RouterAlert
import fr.inria.diverse.leho.model.Leho.QuickStart
import fr.inria.diverse.leho.model.Leho.Calipso
import fr.inria.diverse.leho.model.Leho.SmfDpd
import fr.inria.diverse.leho.model.Leho.HomeAdress
import fr.inria.diverse.leho.model.Leho.Deprecated
import fr.inria.diverse.leho.model.Leho.EndPointIdentification
import fr.inria.diverse.leho.model.Leho.ILNPNonce
import fr.inria.diverse.leho.model.Leho.LineIdOption
import fr.inria.diverse.leho.model.Leho.MPLOption
import fr.inria.diverse.leho.model.Leho.RFC3692Experiment
import fr.inria.diverse.leho.model.Leho.IpAddSpec
import fr.inria.diverse.leho.model.Leho.Port
import fr.inria.diverse.leho.model.Leho.Rule
import fr.inria.diverse.leho.model.Leho.Protocol
import fr.inria.diverse.leho.model.Leho.RSVP
import fr.inria.diverse.leho.model.Leho.MLD
import fr.inria.diverse.leho.model.Leho.OptionDestination
import fr.inria.diverse.leho.model.Leho.IPv6PerformanceDiagnostic
import fr.inria.diverse.leho.model.Leho.TypeRouting
import fr.inria.diverse.leho.model.Leho.SourceRoute
import fr.inria.diverse.leho.model.Leho.Nimrod
import fr.inria.diverse.leho.model.Leho.Type2
import fr.inria.diverse.leho.model.Leho.RPLSource
import fr.inria.diverse.leho.model.Leho.Segment
import fr.inria.diverse.leho.model.Leho.Unassigned
import fr.inria.diverse.leho.model.Leho.RFC3692Experiment1
import fr.inria.diverse.leho.model.Leho.RFC3692Experiment2
import fr.inria.diverse.leho.model.Leho.Reserved
import fr.inria.diverse.leho.model.Leho.DiscardDrop
import fr.inria.diverse.leho.model.Leho.DiscardReject
import fr.inria.diverse.leho.model.Leho.DFF
import fr.inria.diverse.leho.model.Leho.Options

import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.ConfigurationAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.DropAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.RejectAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.ActionAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.AllowAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.DiscardAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.PacketSpecAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.InboundAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.OutboundAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.BandwidthAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.UnitAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.TimeAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.BitUnitAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.OctetUnitAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.PacketUnitAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.SecondAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.MinuteAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.HourAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.DayAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.ExtensionHeaderAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.OptionHopByHopAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.HopByHopOptsAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.RoutingAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.FragmentAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.EncapsulingSecurityPayloadAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.AuthentificationHeaderAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.DestinationOptsAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.MobilityHeaderAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.UnknownEHAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.ExperimentationAndTestingAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.HostIdentityProtocolAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.Shim6ProtocolAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.Pad1Aspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.PadNAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.JumboPayloadAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.RPLOptionAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.TunnelEncapsulationLimitAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.RouterAlertAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.QuickStartAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.CalipsoAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.SmfDpdAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.HomeAdressAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.DeprecatedAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.EndPointIdentificationAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.ILNPNonceAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.LineIdOptionAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.MPLOptionAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.RFC3692ExperimentAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.IpAddSpecAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.PortAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.RuleAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.ProtocolAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.RSVPAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.MLDAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.OptionDestinationAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.IPv6PerformanceDiagnosticAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.TypeRoutingAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.SourceRouteAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.NimrodAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.Type2Aspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.RPLSourceAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.SegmentAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.UnassignedAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.RFC3692Experiment1Aspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.RFC3692Experiment2Aspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.ReservedAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.DiscardDropAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.DiscardRejectAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.DFFAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.OptionsAspect.*

import fr.inria.diverse.leho.model.Leho.LehoFactory
import fr.inria.diverse.leho.k3dsa.Leho.modules.LehoMessagingSystem
import java.util.stream.IntStream

// --------------------------------------------------------------- //
// ------------------------ CONFIGURATION ------------------------ //
// --------------------------------------------------------------- //

@Aspect(className=Configuration)
abstract class ConfigurationAspect {
	public static var Action discard
	
	def void run() {
		LehoMessagingSystem.error("Configuration: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
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
class RuleAspect {}

@Aspect(className=IpAddSpec)
class IpAddSpecAspect {}

@Aspect(className=PacketSpec)
class PacketSpecAspect {}

// ------------------------ Port ------------------------ //

@Aspect(className=Port)
class PortAspect {
	def Boolean eval() {
		LehoMessagingSystem.error("Port: run of " +_self +" should never occur, please tell the developer to write a method run for this class") 
		return false 
	}
}

@Aspect(className=Inbound)
class InboundAspect extends PortAspect {}

@Aspect(className=Outbound)
class OutboundAspect extends PortAspect {}

// ------------------------ Extension Header ------------------------ //

@Aspect(className=ExtensionHeader)
abstract class ExtensionHeaderAspect {
	def Boolean eval() {
		LehoMessagingSystem.error("EH: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
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

@Aspect(className=Options, with=#[OptionDestination])
abstract class OptionsAspect extends OptionHopByHopAspect {
	def Boolean eval(int optionType) {
		LehoMessagingSystem.error("Options: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
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
		LehoMessagingSystem.error("Options Hop By Hop: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
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
		LehoMessagingSystem.error("Options Destination: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
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
		LehoMessagingSystem.error("Protocol: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
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
		LehoMessagingSystem.error("Type routing: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
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
		LehoMessagingSystem.error("Action: run of " +_self +" should never occur, please tell the developer to write a method run for this class")
	}
}

@Aspect(className=Drop)
class DropAspect extends ActionAspect {}

@Aspect(className=Reject)
class RejectAspect extends ActionAspect {}

@Aspect(className=Discard)
class DiscardAspect extends ActionAspect {}

@Aspect(className=Allow)
class AllowAspect extends ActionAspect {}

@Aspect(className=Bandwidth)
class BandwidthAspect extends ActionAspect {}

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
