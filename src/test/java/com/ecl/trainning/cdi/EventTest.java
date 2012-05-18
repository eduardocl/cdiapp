package com.ecl.trainning.cdi;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;

import com.ecl.trainning.cdi.bean.User;
import com.ecl.trainning.cdi.controller.LoginController;

@RunWith(DemoiselleRunner.class)
public class EventTest {

	@Inject LoginController controller;
	
	@Test
	public void testEvent() {
		controller.logIn(new User("eduardocl", false));
	}
	
	
	
}
