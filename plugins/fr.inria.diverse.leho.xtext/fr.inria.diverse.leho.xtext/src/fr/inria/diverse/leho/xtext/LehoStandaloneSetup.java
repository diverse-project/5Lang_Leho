/*
 * generated by Xtext 2.27.0
 */
package fr.inria.diverse.leho.xtext;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class LehoStandaloneSetup extends LehoStandaloneSetupGenerated {

	public static void doSetup() {
		new LehoStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
