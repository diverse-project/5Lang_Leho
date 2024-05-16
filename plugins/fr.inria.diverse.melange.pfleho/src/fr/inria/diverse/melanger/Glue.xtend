package fr.inria.diverse.melanger

import fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.FilterAspect
import fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.PolicyAspect
import fr.inria.diverse.gpfl.model.gpfl.Filter
import fr.inria.diverse.gpfl.model.gpfl.GpflFactory
import fr.inria.diverse.gpfl.model.gpfl.Policy
import fr.inria.diverse.gpfl.model.gpfl.Read
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Containment
import fr.inria.diverse.leho.model.leho.Configuration
import fr.inria.diverse.leho.model.leho.Rule
import java.math.BigInteger

import static extension fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.FilterAspect.*
import static extension fr.inria.diverse.gpfl.k3dsa.Gpfl.aspects.ReadAspect.*
import static extension fr.inria.diverse.melanger.ConfigurationAspect.*
import static extension fr.inria.diverse.melanger.RuleAspect.*

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

