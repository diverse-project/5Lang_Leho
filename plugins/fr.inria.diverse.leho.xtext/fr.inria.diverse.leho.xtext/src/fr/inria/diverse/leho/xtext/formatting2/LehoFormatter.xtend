/*
 * generated by Xtext 2.27.0
 */
package fr.inria.diverse.leho.xtext.formatting2

import com.google.inject.Inject
import fr.inria.diverse.leho.model.Leho.Filter
import fr.inria.diverse.leho.model.Leho.Policy
import fr.inria.diverse.leho.xtext.services.LehoGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class LehoFormatter extends AbstractFormatter2 {
	
	@Inject extension LehoGrammarAccess

	def dispatch void format(Policy policy, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		policy.configuration.format
		policy.filter.format
	}

	def dispatch void format(Filter filter, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		filter.firstRule.format
	}
	
	// TODO: implement for Rule, Bandwidth, PacketSpec
}
