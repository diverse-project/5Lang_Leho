/*
 * generated by Xtext 2.27.0
 */
package fr.inria.diverse.leho.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.inria.diverse.leho.xtext.LehoRuntimeModule;
import fr.inria.diverse.leho.xtext.LehoStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class LehoIdeSetup extends LehoStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new LehoRuntimeModule(), new LehoIdeModule()));
	}
	
}