package com.ecl.trainning.cdi.producer;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import org.slf4j.Logger;

import com.ecl.trainning.cdi.bean.Order;
import com.ecl.trainning.cdi.bean.OrderImpl;
import com.ecl.trainning.cdi.qualifier.FakeOrder;
import com.ecl.trainning.cdi.qualifier.MyOrder;


public class OrderProducer {
	
	@Inject
	private Logger logger;
	
	private Order order;
	
	public OrderProducer() {}
	
	/**
	 * Wee need a qualifier in order to do not cause ambiguous dependencie, since
	 * our bean Order and de producer method bellow resolve to the same type.
	 * 
	 * First, we create the qualifier {@link MyOrder} and annotate the producer method, not
	 * the bean.
	 * 
	 */
	@Produces
	@MyOrder
	public Order generateOrder() {
		logger.info("Producer method OrderProducer#generateOrder()");
		return new OrderImpl("1234","Fast Shop");
	}
	
	@Produces
	@FakeOrder
	public Order generateFakeOrder() {
		logger.info("Producer method OrderProducer#generateFakeOrder()");
		return new com.ecl.trainning.cdi.bean.FakeOrder();
	}
	
	
	@Inject 
	public void setOrder(@MyOrder Order order) {
		logger.info("executing initializer method");
		((OrderImpl)order).setShopName("Shopping Chao");
		this.order = order;
	}
	
	
	public Order getOrder() {
		return this.order;
	}
	
	
}
