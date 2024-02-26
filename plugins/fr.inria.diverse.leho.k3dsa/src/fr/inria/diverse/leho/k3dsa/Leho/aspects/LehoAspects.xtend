package fr.inria.diverse.leho.k3dsa.Leho.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.leho.model.Leho.Policy
import fr.inria.diverse.leho.model.Leho.Configuration
import fr.inria.diverse.leho.model.Leho.Drop
import fr.inria.diverse.leho.model.Leho.DiscardDrop
import fr.inria.diverse.leho.model.Leho.Reject
import fr.inria.diverse.leho.model.Leho.DiscardReject
import fr.inria.diverse.leho.model.Leho.Filter
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
import fr.inria.diverse.leho.model.Leho.Packet
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

import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.PolicyAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.ConfigurationAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.DropAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.RejectAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.FilterAspect.*
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
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.PacketAspect.*
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
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem
import fr.inria.diverse.leho.k3dsa.Leho.modules.MessagingModule
import java.util.HashMap
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import org.eclipse.emf.common.util.EList
import fr.inria.diverse.leho.k3dsa.Leho.modules.IOModule
import java.io.File
import java.util.Scanner
import fr.inria.diverse.leho.model.Leho.LehoFactory
import org.eclipse.core.resources.IWorkspace
import org.eclipse.core.resources.ResourcesPlugin
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step

@Aspect(className=Policy)
class PolicyAspect {
	def MessagingSystem logger() {
		MessagingModule.logger
	}
	
	public static var endOfFilter = false
	public static var correspondingPort = new HashMap<Port, Port>()
	public static var Action discard
	
	@InitializeModel
	def void initializeModel(EList<String> args) {
		endOfFilter = false
		// ------------ Read input file and create the packets ------------ //
		_self.packets.clear
		_self.currentTime = 0
		val IWorkspace workspace = ResourcesPlugin.getWorkspace()
		try {			
			IOModule.createPacketsFromFile(_self, new File(workspace.root.findMember(args.get(0)).locationURI.path))
		} catch(NullPointerException e) {
			MessagingModule.logger.error("Input file " + args.get(0) + " not found. Go check run configurations", "Gpfl")
			e.printStackTrace
		}
		try {
			IOModule.createOutputFile(new File(workspace.root.findMember(args.get(1)).locationURI.path))
		} catch(NullPointerException e) {
			MessagingModule.logger.error("Output file " + args.get(1) + " not found. Go check run configurations", "Gpfl")
			e.printStackTrace
		}
		try {
			val portOracle = new File(workspace.root.findMember(args.get(2)).locationURI.path)
			val input = new Scanner(portOracle)
			while (input.hasNextLine) {
				val line = input.nextLine
				var portIn = _self.inPorts.findFirst[p | p.name.equals(line.split("->").get(0).trim())]
				if(portIn === null) {
					val port = LehoFactory.eINSTANCE.createPort
					port.name = line.split("->").get(0).trim()
					_self.inPorts.add(port)
					portIn = port
				}
				var portOut = _self.inPorts.findFirst[p | p.name.equals(line.split("->").get(1).trim())]
				if(portOut === null) {
					val port = LehoFactory.eINSTANCE.createPort
					port.name = line.split("->").get(1).trim()
					_self.inPorts.add(port)
					portOut = port
				}
				correspondingPort.put(portIn, portOut)
			}
			input.close
		} catch(NullPointerException e) {
			MessagingModule.logger.error("Output file " + args.get(2) + " not found. Go check run configurations", "Gpfl")
			e.printStackTrace
		}
	}
	
	@Main
	@Step
	def void run() {
		_self.configuration.run(_self)
		for (packet : _self.packets) {
			_self.currentPacket = packet			
	 		_self.filter.run(_self)
		}
	}
}

@Aspect(className=Configuration)
abstract class ConfigurationAspect {
	def void run(Policy root) {
		root.logger.error("Statement: run of " +_self +" should never occur, please tell the developer to write a method run for this class", "Leho")
	}
}

@Aspect(className=DiscardDrop)
class DiscardDropAspect extends ActionAspect {
	def void run(Policy root) {
		discard = LehoFactory.eINSTANCE.createDrop
	}
}

@Aspect(className=DiscardReject)
class DiscardRejectAspect extends ActionAspect {
	def void run(Policy root) {
		discard = LehoFactory.eINSTANCE.createReject
	}
}

@Aspect(className=Filter)
class FilterAspect {
	def void run(Policy root) {
		root.currentTime = root.currentPacket.time
		_self.currentRule = _self.firstRule
		while (_self.currentRule !== null && !endOfFilter) {
			_self.currentRule.run(root)
			_self.currentRule = _self.currentRule.next
		}
		endOfFilter = false
	}
}


@Aspect(className=Rule)
class RuleAspect {
	def void run(Policy root) {
		var from = true
		if (_self.from !== null) from = _self.from.eval(root)
		var to = true
		if (_self.to !== null) to = _self.to.eval(root)
		val spec = _self.packetspec.eval(root)
		if(from && to && spec) _self.action.run(root)
	}
}

@Aspect(className=Action)
abstract class ActionAspect {
	def void run(Policy root) {
		root.logger.error("Statement: run of " +_self +" should never occur, please tell the developer to write a method run for this class", "Leho")
	}
}

@Aspect(className=Drop)
class DropAspect extends ActionAspect {
	def void run(Policy root) {
		var packet = "("+root.currentTime+";"
			+ root.currentPacket.inPort.name
			+";"+root.currentPacket.content+")"
		root.logger.debug("DROP " + packet, "Gpfl")
		endOfFilter = true
	}
}

@Aspect(className=Reject)
class RejectAspect extends ActionAspect {
	def void run(Policy root) {
		var packet = "("+root.currentTime+";"
			+ root.currentPacket.inPort.name+";" 
			+ root.currentPacket.content + ")"
		root.logger.debug("SEND " + packet, "Gpfl")
		
		IOModule.writePacket(root.currentPacket, root.currentPacket.inPort)
		endOfFilter = true
	}
}

@Aspect(className=Allow)
class AllowAspect extends ActionAspect {
	def void run(Policy root) {
		var packet = "("+root.currentTime+";"
			+ correspondingPort.get(root.currentPacket.inPort).name+";" 
			+ root.currentPacket.content + ")"
		root.logger.debug("ACCEPT " + packet, "Gpfl")
		
		IOModule.writePacket(root.currentPacket, correspondingPort.get(root.currentPacket.inPort))
		endOfFilter = true
	}
}

@Aspect(className=Discard)
class DiscardAspect extends ActionAspect {
	def void run(Policy root) {
		discard.run(root)
	}
}

@Aspect(className=PacketSpec)
class PacketSpecAspect {
	def Boolean eval(Policy root) {
		
	}
}

@Aspect(className=Inbound)
class InboundAspect extends PortAspect {

}

@Aspect(className=Outbound)
class OutboundAspect extends PortAspect {

}

@Aspect(className=Bandwidth)
class BandwidthAspect extends ActionAspect {

}

@Aspect(className=Unit)
abstract class UnitAspect {

}

@Aspect(className=Time)
abstract class TimeAspect {

}

@Aspect(className=BitUnit)
class BitUnitAspect extends UnitAspect {

}

@Aspect(className=OctetUnit)
class OctetUnitAspect extends UnitAspect {

}

@Aspect(className=PacketUnit)
class PacketUnitAspect extends UnitAspect {

}

@Aspect(className=Second)
class SecondAspect extends TimeAspect {

}

@Aspect(className=Minute)
class MinuteAspect extends TimeAspect {

}

@Aspect(className=Hour)
class HourAspect extends TimeAspect {

}

@Aspect(className=Day)
class DayAspect extends TimeAspect {

}

@Aspect(className=ExtensionHeader)
abstract class ExtensionHeaderAspect {

}

@Aspect(className=OptionHopByHop)
abstract class OptionHopByHopAspect {

}

@Aspect(className=HopByHopOpts)
class HopByHopOptsAspect extends ExtensionHeaderAspect {

}

@Aspect(className=Routing)
class RoutingAspect extends ExtensionHeaderAspect {

}

@Aspect(className=Fragment)
class FragmentAspect extends ExtensionHeaderAspect {

}

@Aspect(className=EncapsulingSecurityPayload)
class EncapsulingSecurityPayloadAspect extends ExtensionHeaderAspect {

}

@Aspect(className=AuthentificationHeader)
class AuthentificationHeaderAspect extends ExtensionHeaderAspect {

}

@Aspect(className=DestinationOpts)
class DestinationOptsAspect extends ExtensionHeaderAspect {

}

@Aspect(className=MobilityHeader)
class MobilityHeaderAspect extends ExtensionHeaderAspect {

}

@Aspect(className=UnknownEH)
class UnknownEHAspect extends ExtensionHeaderAspect {

}

@Aspect(className=ExperimentationAndTesting)
class ExperimentationAndTestingAspect extends ExtensionHeaderAspect {

}

@Aspect(className=HostIdentityProtocol)
class HostIdentityProtocolAspect extends ExtensionHeaderAspect {

}

@Aspect(className=Shim6Protocol)
class Shim6ProtocolAspect extends ExtensionHeaderAspect {

}

@Aspect(className=Pad1)
class Pad1Aspect extends OptionHopByHopAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=PadN)
class PadNAspect extends OptionHopByHopAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=JumboPayload)
class JumboPayloadAspect extends OptionHopByHopAspect {

}

@Aspect(className=RPLOption)
class RPLOptionAspect extends OptionHopByHopAspect {

}

@Aspect(className=TunnelEncapsulationLimit)
class TunnelEncapsulationLimitAspect extends OptionDestinationAspect {

}

@Aspect(className=RouterAlert)
class RouterAlertAspect extends OptionHopByHopAspect {

}

@Aspect(className=QuickStart)
class QuickStartAspect extends OptionHopByHopAspect {

}

@Aspect(className=Calipso)
class CalipsoAspect extends OptionHopByHopAspect {

}

@Aspect(className=SmfDpd)
class SmfDpdAspect extends OptionHopByHopAspect {

}

@Aspect(className=HomeAdress)
class HomeAdressAspect extends OptionDestinationAspect {

}

@Aspect(className=Deprecated)
class DeprecatedAspect extends OptionHopByHopAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=EndPointIdentification)
class EndPointIdentificationAspect extends OptionHopByHopAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=ILNPNonce)
class ILNPNonceAspect extends OptionDestinationAspect {

}

@Aspect(className=LineIdOption)
class LineIdOptionAspect extends OptionHopByHopAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=MPLOption)
class MPLOptionAspect extends OptionHopByHopAspect {

}

@Aspect(className=RFC3692Experiment)
class RFC3692ExperimentAspect extends OptionHopByHopAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=IpAddSpec)
class IpAddSpecAspect {
	def Boolean eval(Policy root) {
		
	}
}

@Aspect(className=Port)
abstract class PortAspect {

}

@Aspect(className=Packet)
class PacketAspect {

}

@Aspect(className=Protocol)
abstract class ProtocolAspect {

}

@Aspect(className=RSVP)
class RSVPAspect extends ProtocolAspect {

}

@Aspect(className=MLD)
class MLDAspect extends ProtocolAspect {

}

@Aspect(className=OptionDestination)
abstract class OptionDestinationAspect {

}

@Aspect(className=IPv6PerformanceDiagnostic)
class IPv6PerformanceDiagnosticAspect extends OptionDestinationAspect {

}

@Aspect(className=TypeRouting)
abstract class TypeRoutingAspect {

}

@Aspect(className=SourceRoute)
class SourceRouteAspect extends TypeRoutingAspect {

}

@Aspect(className=Nimrod)
class NimrodAspect extends TypeRoutingAspect {

}

@Aspect(className=Type2)
class Type2Aspect extends TypeRoutingAspect {

}

@Aspect(className=RPLSource)
class RPLSourceAspect extends TypeRoutingAspect {

}

@Aspect(className=Segment)
class SegmentAspect extends TypeRoutingAspect {

}

@Aspect(className=Unassigned)
class UnassignedAspect extends TypeRoutingAspect {

}

@Aspect(className=RFC3692Experiment1)
class RFC3692Experiment1Aspect extends TypeRoutingAspect {

}

@Aspect(className=RFC3692Experiment2)
class RFC3692Experiment2Aspect extends TypeRoutingAspect {

}

@Aspect(className=Reserved)
class ReservedAspect extends TypeRoutingAspect {

}



