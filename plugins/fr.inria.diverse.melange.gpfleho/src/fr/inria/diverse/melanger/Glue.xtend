package fr.inria.diverse.melanger

import fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.FilterAspect
import fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.PolicyAspect
import fr.inria.diverse.gpfl.model.Gpfl.Filter
import fr.inria.diverse.gpfl.model.Gpfl.GpflFactory
import fr.inria.diverse.gpfl.model.Gpfl.Policy
import fr.inria.diverse.gpfl.model.Gpfl.Read
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Containment
import fr.inria.diverse.leho.k3dsa.Leho.aspects.ActionAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.AllowAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.AuthentificationHeaderAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.BandwidthAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.DestinationOptsAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.DiscardAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.DropAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.EncapsulingSecurityPayloadAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.ExperimentationAndTestingAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.ExtensionHeaderAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.FragmentAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.HopByHopOptsAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.HostIdentityProtocolAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.InboundAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.IpAddSpecAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.MobilityHeaderAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.OutboundAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.PacketSpecAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.PortAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.RuleAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.Shim6ProtocolAspect
import fr.inria.diverse.leho.k3dsa.Leho.aspects.UnknownEHAspect
import fr.inria.diverse.leho.model.Leho.Action
import fr.inria.diverse.leho.model.Leho.Allow
import fr.inria.diverse.leho.model.Leho.AuthentificationHeader
import fr.inria.diverse.leho.model.Leho.Bandwidth
import fr.inria.diverse.leho.model.Leho.Configuration
import fr.inria.diverse.leho.model.Leho.DestinationOpts
import fr.inria.diverse.leho.model.Leho.Discard
import fr.inria.diverse.leho.model.Leho.Drop
import fr.inria.diverse.leho.model.Leho.EncapsulingSecurityPayload
import fr.inria.diverse.leho.model.Leho.ExperimentationAndTesting
import fr.inria.diverse.leho.model.Leho.ExtensionHeader
import fr.inria.diverse.leho.model.Leho.Fragment
import fr.inria.diverse.leho.model.Leho.HopByHopOpts
import fr.inria.diverse.leho.model.Leho.HostIdentityProtocol
import fr.inria.diverse.leho.model.Leho.Inbound
import fr.inria.diverse.leho.model.Leho.IpAddSpec
import fr.inria.diverse.leho.model.Leho.MobilityHeader
import fr.inria.diverse.leho.model.Leho.Outbound
import fr.inria.diverse.leho.model.Leho.PacketSpec
import fr.inria.diverse.leho.model.Leho.Port
import fr.inria.diverse.leho.model.Leho.Reject
import fr.inria.diverse.leho.model.Leho.RouterAlert
import fr.inria.diverse.leho.model.Leho.Routing
import fr.inria.diverse.leho.model.Leho.Rule
import fr.inria.diverse.leho.model.Leho.Shim6Protocol
import fr.inria.diverse.leho.model.Leho.UnknownEH
import java.math.BigInteger
import java.net.InetAddress
import java.util.stream.IntStream

import static extension fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.AcceptAspect.*
import static extension fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.DropAspect.*
import static extension fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.FilterAspect.*
import static extension fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.ReadAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.ConfigurationAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.OptionDestinationAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.OptionHopByHopAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.ProtocolAspect.*
import static extension fr.inria.diverse.leho.k3dsa.Leho.aspects.TypeRoutingAspect.*
import static extension fr.inria.diverse.melanger.ActionGlue.*
import static extension fr.inria.diverse.melanger.ExtensionHeaderGlue.*
import static extension fr.inria.diverse.melanger.IpAddSpecGlue.*
import static extension fr.inria.diverse.melanger.PacketSpecGlue.*
import static extension fr.inria.diverse.melanger.PolicyGlue.*
import static extension fr.inria.diverse.melanger.PortGlue.*
import static extension fr.inria.diverse.melanger.RuleGlue.*
import fr.inria.diverse.leho.model.Leho.Day
import fr.inria.diverse.leho.model.Leho.Hour
import fr.inria.diverse.leho.model.Leho.Minute
import fr.inria.diverse.leho.model.Leho.Second
import fr.inria.diverse.leho.model.Leho.PacketUnit
import fr.inria.diverse.leho.model.Leho.OctetUnit
import fr.inria.diverse.leho.model.Leho.BitUnit

@Aspect(className=Policy)
class PolicyGlue extends PolicyAspect {
	def BigInteger read(int offset, int length) {
		var Read read = GpflFactory.eINSTANCE.createRead
		var offsetExpr = GpflFactory.eINSTANCE.createIntLiteral
		offsetExpr.value = offset
		read.offset = offsetExpr
		var lengthExpr = GpflFactory.eINSTANCE.createIntLiteral
		lengthExpr.value = offset
		read.length = lengthExpr
		return read.eval(_self) as BigInteger
	}
	
    @Containment
    public Configuration configuration
    
    override void run() {
    	_self.configuration.run()
    	for (packet : _self.packets) {
			_self.currentPacket = packet			
	 		_self.filter.run(_self)
		}
    }
}

@Aspect(className=Filter)
class FilterGlue extends FilterAspect {
	@Containment
	public Rule firstRule
	@Containment
	public Rule currentRule
	
	override void run(Policy root) {
		_self.currentRule = _self.firstRule
		while (_self.currentRule !== null && !PolicyAspect.endOfFilter) {
			_self.currentRule.run(root)
			_self.currentRule = _self.currentRule.next
		}
	}
}

// ------------------------------------------------------ //
// ------------------------ RULE ------------------------ //
// ------------------------------------------------------ //

@Aspect(className=Rule)
class RuleGlue extends RuleAspect {
	public static var nbPackets = 0
	public static var nbOctets = 0
	public static var nbBits = 0
	
	def void run(Policy root) {
		var from = _self.from === null ? true : _self.from.eval(root, true)
		var to = _self.to === null ? true : _self.to.eval(root, true)
		if (from && to && _self.packetspec.eval(root)) {
			_self.action.run(root)
		}
	}
}

@Aspect(className=IpAddSpec)
class IpAddSpecGlue extends IpAddSpecAspect {
	def Boolean eval(Policy root, Boolean type) {
		if((_self.port !== null && (Integer.parseInt(_self.port).equals(root.currentPacket.inPort.number) || _self.port.equals("any"))) || _self.port === null) {
			val compIp = new BigInteger(1, InetAddress.getByName(_self.adress).getAddress())
			if ((type && root.read(64, 128) >= compIp) || (!type && root.read(192, 128) <= compIp)) return true
		}
		return false
	}
}

@Aspect(className=PacketSpec)
class PacketSpecGlue extends PacketSpecAspect {
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

@Aspect(className=Port)
class PortGlue extends PortAspect {
	def Boolean eval(Policy root) {
		_self.eval
	}
}

@Aspect(className=Inbound)
class InboundGlue extends InboundAspect {
	def Boolean eval(Policy root) {
		if(root.currentPacket.inPort.interface.name.equals("inbound"))
			return true
		return false
	} 
}

@Aspect(className=Outbound)
class OutboundGlue extends OutboundAspect {
	def Boolean eval(Policy root) {
		if(root.currentPacket.inPort.interface.name.equals("outbound"))
			return true
		return false
	} 
}

// ------------------------ Extension Header ------------------------ //

@Aspect(className=ExtensionHeader)
abstract class ExtensionHeaderGlue extends ExtensionHeaderAspect {
	def Boolean eval(Policy root) {
		_self.eval
	}
}

@Aspect(className=HopByHopOpts)
class HopByHopOptsGlue extends HopByHopOptsAspect{
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
class FragmentGlue extends FragmentAspect {
	def Boolean eval(Policy root) {
		if(nextHeader == 44) {
			nextEhStart += nextEhStart+64
			return true
		}
		return false
	}
}

@Aspect(className=EncapsulingSecurityPayload)
class EncapsulingSecurityPayloadGlue extends EncapsulingSecurityPayloadAspect {
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
class AuthentificationHeaderGlue extends AuthentificationHeaderAspect {
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
class DestinationOptsGlue extends DestinationOptsAspect {
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
class MobilityHeaderGlue extends MobilityHeaderAspect {
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
class HostIdentityProtocolGlue extends HostIdentityProtocolAspect {
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
class Shim6ProtocolGlue extends Shim6ProtocolAspect {
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
class ExperimentationAndTestingGlue extends ExperimentationAndTestingAspect {
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
class UnknownEHGlue extends UnknownEHAspect {
	def Boolean eval(Policy root) {
		val int[] knownHeaders = #[0, 43, 44, 50, 51, 60, 135, 139, 140, 253, 254]
		return IntStream.of(knownHeaders).anyMatch[num | num == nextHeader]
	}
}

// -------------------------------------------------------- //
// ------------------------ ACTION ------------------------ //
// -------------------------------------------------------- //

@Aspect(className=Action)
abstract class ActionGlue extends ActionAspect {
	def void run(Policy root) {
		_self.run
	}
}

@Aspect(className=Drop)
class DropGlue extends DropAspect {
	 def void run(Policy root) {
	 	val drop = GpflFactory.eINSTANCE.createDrop
	 	drop.run(root)
	 }
}

@Aspect(className=Reject)
class RejectAspect {
	// TODO later: change to a real reject
	// (would take too much time with all the particular cases)
	def void run(Policy root) {
	 	val drop = GpflFactory.eINSTANCE.createDrop
	 	drop.run(root)
	 }
}

@Aspect(className=Discard)
class DiscardGlue extends DiscardAspect {
	def void run(Policy root) {
		discard.run(root)
	}
}

@Aspect(className=Allow)
class AllowGlue extends AllowAspect {
	def void run(Policy root) {
	 	val accept = GpflFactory.eINSTANCE.createAccept
	 	accept.run(root)
	 }
}

@Aspect(className=Bandwidth)
class BandwidthGlue extends BandwidthAspect {
	public static var nextAcceptTime = 0
	
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
