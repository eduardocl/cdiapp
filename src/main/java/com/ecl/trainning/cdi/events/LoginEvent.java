package com.ecl.trainning.cdi.events;

import com.ecl.trainning.cdi.bean.User;


public class LoginEvent {

	private User user;
	
	public LoginEvent(User user) {
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
