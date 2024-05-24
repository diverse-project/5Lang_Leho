package fr.inria.diverse.eho.melanger

import fr.inria.diverse.eho.model.eho.Configuration
import fr.inria.diverse.eho.model.eho.Rule
import fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.FilterAspect
import fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.PolicyAspect
import fr.inria.diverse.gpfl.model.gpfl.Filter
import fr.inria.diverse.gpfl.model.gpfl.Policy
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.melange.annotation.Containment
import java.math.BigInteger

import static extension fr.inria.diverse.eho.k3dsa.Eho.aspects.ConfigurationAspect.*
import static extension fr.inria.diverse.eho.melanger.FilterGlue.*

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
