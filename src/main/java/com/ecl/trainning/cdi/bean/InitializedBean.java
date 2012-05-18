package com.ecl.trainning.cdi.bean;

import javax.inject.Inject;

import org.slf4j.Logger;

import com.ecl.trainning.cdi.qualifier.MyOrder;


public class InitializedBean {

	@Inject
	private Order order;

	@Inject 
	private Logger logger;
	
	public Order getOrder() {
		return order;
	}

	
	/**
	 * Initializer method, the container will inject the
	 * dependencie qualified as MyOrder.
	 * 
	 */
	@Inject
	public void setOrder(@MyOrder Order order) {
		logger.info("Order being inject in the initializer method of InitializedBean");
		this.order = order;
	}
	
	
	
}	

