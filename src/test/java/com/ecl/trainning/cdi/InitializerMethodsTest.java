package com.ecl.trainning.cdi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;

import com.ecl.trainning.cdi.bean.Order;
import com.ecl.trainning.cdi.producer.OrderProducer;

@RunWith(DemoiselleRunner.class)
public class InitializerMethodsTest {

	@Inject 
	private OrderProducer producer;
	
	@Test
	public void testInitializerMethod() {
	   Order order = producer.getOrder();
	   assertNotNull(order);
	   assertEquals("Shopping Chao", order.getShopName());
	}
	
}
