package com.ecl.trainning.cdi.events;

import javax.enterprise.event.Observes;


public class EventListener {
	
	public void onLoggedIn(@Observes LoginEvent event) {
		System.out.println("Login event fired: " + event.getUser().getName());
	}
	
}
