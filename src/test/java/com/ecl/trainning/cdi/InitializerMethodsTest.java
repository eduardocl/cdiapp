package com.ecl.trainning.cdi;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;

import com.ecl.trainning.cdi.bean.InitializedBean;

@RunWith(DemoiselleRunner.class)
public class InitializerMethodsTest {

	@Inject private InitializedBean bean;
	
	@Test
	public void testInitializedBean() {
		assertNotNull(bean.getOrder());
	}
	
}
