package fr.inria.diverse.leho.k3dsa.Leho.modules

import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystemManager

class LehoMessagingSystem {
	var static MessagingSystem internalLogger  
	def static MessagingSystem logger(){
		if (internalLogger === null) { 
			val MessagingSystemManager msManager = new MessagingSystemManager
			internalLogger = msManager.createBestPlatformMessagingSystem("Gpfl","Simple Gpfl interpreter")
			
		} 
		return internalLogger
	}
	
	def static void debug(String message) {
		logger.debug(message, "Leho")
	}
	
	def static void error(String message) {
		logger.error(message, "Leho")
	}
}