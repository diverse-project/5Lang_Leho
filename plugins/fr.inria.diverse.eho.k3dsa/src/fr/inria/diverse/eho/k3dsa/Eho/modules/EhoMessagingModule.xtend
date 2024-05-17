package fr.inria.diverse.eho.k3dsa.Eho.modules

import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystemManager

class EhoMessagingModule {
	var static MessagingSystem internalLogger  
	def private static MessagingSystem logger(){
		if (internalLogger === null) { 
			val MessagingSystemManager msManager = new MessagingSystemManager
			internalLogger = msManager.createBestPlatformMessagingSystem("Eho","Simple Eho interpreter")
			
		} 
		return internalLogger
	}
	
	def static error(String message) {
		EhoMessagingModule.logger.error(message, "Eho");
	}
	
	def static debug(String message) {
		EhoMessagingModule.logger.debug(message, "Eho");
	}
}