package com.ecl.trainning.cdi.controller;

import javax.enterprise.event.Event;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

import com.ecl.trainning.cdi.bean.User;
import com.ecl.trainning.cdi.events.LoginEvent;

public class LoginController {

	@Inject @Any Event<LoginEvent> loggedEvent;
	
	public void logIn(User user) {
		loggedEvent.fire(new LoginEvent(user));
	}
	
}
