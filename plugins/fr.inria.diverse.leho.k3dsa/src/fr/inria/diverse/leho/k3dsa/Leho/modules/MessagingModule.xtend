package fr.inria.diverse.leho.k3dsa.Leho.modules

import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystemManager

class MessagingModule {
	var static MessagingSystem internalLogger  
	def private static MessagingSystem logger(){
		if (internalLogger === null) { 
			val MessagingSystemManager msManager = new MessagingSystemManager
			internalLogger = msManager.createBestPlatformMessagingSystem("Leho","Simple Leho interpreter")
			
		} 
		return internalLogger
	}
	
	def static error(String message) {
		MessagingModule.logger.error(message, "Leho");
	}
	
	def static debug(String message) {
		MessagingModule.logger.debug(message, "Leho");
	}
}