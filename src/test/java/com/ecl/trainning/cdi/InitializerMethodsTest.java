package com.ecl.trainning.cdi;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;

import com.ecl.trainning.cdi.bean.Order;
import com.ecl.trainning.cdi.producer.OrderProducer;


public class InitializerMethodsTest {

	@Inject OrderProducer producer;
	
	@Test
	public void testInitializerMethod() {
	   //I don't no why but producer is null!	
	   Order order = producer.getOrder();
	   assertEquals("Shopping Chao", order.getShopName());
	}
	
	
}
