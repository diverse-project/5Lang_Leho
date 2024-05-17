package fr.inria.diverse.melanger

import fr.inria.diverse.eho.k3dsa.Eho.aspects.AcceptAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.ActionAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.AuthentificationHeaderAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.BandwidthAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.DestinationOptsAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.DiscardAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.DropAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.EncapsulingSecurityPayloadAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.ExperimentationAndTestingAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.ExtensionHeaderAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.FragmentAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.HopByHopOptsAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.HostIdentityProtocolAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.InboundAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.IpAddSpecAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.MobilityHeaderAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.OutboundAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.PacketSpecAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.RejectAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.RoutingAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.RuleAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.TypeInterfaceAspect
import fr.inria.diverse.eho.k3dsa.Eho.aspects.UnknownEHAspect
import fr.inria.diverse.eho.model.eho.Accept
import fr.inria.diverse.eho.model.eho.Action
import fr.inria.diverse.eho.model.eho.AuthentificationHeader
import fr.inria.diverse.eho.model.eho.Bandwidth
import fr.inria.diverse.eho.model.eho.BitUnit
import fr.inria.diverse.eho.model.eho.Configuration
import fr.inria.diverse.eho.model.eho.Day
import fr.inria.diverse.eho.model.eho.DestinationOpts
import fr.inria.diverse.eho.model.eho.Discard
import fr.inria.diverse.eho.model.eho.Drop
import fr.inria.diverse.eho.model.eho.EhoFactory
import fr.inria.diverse.eho.model.eho.EncapsulingSecurityPayload
import fr.inria.diverse.eho.model.eho.ExperimentationAndTesting
import fr.inria.diverse.eho.model.eho.ExtensionHeader
import fr.inria.diverse.eho.model.eho.Fragment
import fr.inria.diverse.eho.model.eho.HopByHopOpts
import fr.inria.diverse.eho.model.eho.HostIdentityProtocol
import fr.inria.diverse.eho.model.eho.Hour
import fr.inria.diverse.eho.model.eho.Inbound
import fr.inria.diverse.eho.model.eho.IpAddSpec
import fr.inria.diverse.eho.model.eho.Minute
import fr.inria.diverse.eho.model.eho.MobilityHeader
import fr.inria.diverse.eho.model.eho.OctetUnit
import fr.inria.diverse.eho.model.eho.Outbound
import fr.inria.diverse.eho.model.eho.PacketSpec
import fr.inria.diverse.eho.model.eho.PacketUnit
import fr.inria.diverse.eho.model.eho.Reject
import fr.inria.diverse.eho.model.eho.RouterAlert
import fr.inria.diverse.eho.model.eho.Routing
import fr.inria.diverse.eho.model.eho.Rule
import fr.inria.diverse.eho.model.eho.Second
import fr.inria.diverse.eho.model.eho.TypeInterface
import fr.inria.diverse.eho.model.eho.UnknownEH
import fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.FilterAspect
import fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.PolicyAspect
import fr.inria.diverse.gpfl.model.gpfl.Filter
import fr.inria.diverse.gpfl.model.gpfl.GpflFactory
import fr.inria.diverse.gpfl.model.gpfl.Policy
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.melange.annotation.Containment
import java.math.BigInteger
import java.net.InetAddress
import java.util.stream.IntStream

import static extension fr.inria.diverse.eho.k3dsa.Eho.aspects.ConfigurationAspect.*
import static extension fr.inria.diverse.eho.k3dsa.Eho.aspects.ProtocolAspect.*
import static extension fr.inria.diverse.eho.k3dsa.Eho.aspects.TypeRoutingAspect.*
import static extension fr.inria.diverse.eho.k3dsa.Eho.aspects.OptionHopByHopAspect.*
import static extension fr.inria.diverse.eho.k3dsa.Eho.aspects.OptionDestinationAspect.*
import static extension fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.CmdAspect.*
import static extension fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.DropAspect.*
import static extension fr.inria.diverse.melanger.ActionGlue.*
import static extension fr.inria.diverse.melanger.FilterGlue.*
import static extension fr.inria.diverse.melanger.IpAddSpecGlue.*
import static extension fr.inria.diverse.melanger.PacketSpecGlue.*
import static extension fr.inria.diverse.melanger.PolicyGlue.*
import static extension fr.inria.diverse.melanger.RuleGlue.*
import static extension fr.inria.diverse.melanger.ExtensionHeaderGlue.*
import static extension fr.inria.diverse.melanger.TypeInterfaceGlue.*

@Aspect(className=Policy)
class PolicyGlue extends PolicyAspect {
	def BigInteger read(int offset, int length) {
		new BigInteger(_self.currentPacket.content.toString.substring(offset, offset + length), 2)
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

@Aspect(className=TypeInterface)
class TypeInterfaceGlue extends TypeInterfaceAspect {
	def Boolean eval(Policy root) {
		return _self.eval
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
		return _self.eval
	}
}

@Aspect(className=HopByHopOpts)
class HopByHopOptsGlue extends HopByHopOptsAspect {
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
class RoutingGlue extends RoutingAspect {
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

@Aspect(className=Accept)
class AcceptGlue extends AcceptAspect {
	def void run(Policy root) {
	 	val accept = GpflFactory.eINSTANCE.createAccept
	 	accept.run(root)
	 }
}

@Aspect(className=Drop)
class DropGlue extends DropAspect  {
	// TODO: voir si la reuse se fait pas toute seul sur ses classes en double 
	 def void run(Policy root) {
	 	val drop = GpflFactory.eINSTANCE.createDrop
	 	drop.run(root)
	 }
}

@Aspect(className=Reject)
class RejectGlue extends RejectAspect {
	// TODO later: change to a real reject
	// (would take too much time with all the particular cases)
	def void run(Policy root) {
	 	val drop = EhoFactory.eINSTANCE.createDrop
	 	drop.run(root)
	}
}

@Aspect(className=Discard)
class DiscardGlue extends DiscardAspect {
	def void run(Policy root) {
		discard.run(root)
	}
}

@Aspect(className=Bandwidth)
class BandwidthGlue extends BandwidthAspect {
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
