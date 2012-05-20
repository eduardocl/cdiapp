package com.ecl.trainning.cdi.events;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.slf4j.Logger;


public class EventListener {
	
	@Inject Logger logger;
	
	public void onLoggedIn(@Observes LoginEvent event) {
		logger.info("Event LoggedIn received in EventListener#onLoggedIn");
	}
	
}
