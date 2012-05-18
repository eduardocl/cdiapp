package com.ecl.trainning.cdi;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;

import com.ecl.trainning.cdi.bean.Order;
import com.ecl.trainning.cdi.qualifier.MyOrder;

@RunWith(DemoiselleRunner.class)
public class InterceptorTest {

	@Inject
	@MyOrder
	private Order order;
	
	@Test
	public void testPayment() {
		order.pay();
	}
	
}
