package com.ecl.trainning.cdi.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.slf4j.Logger;

import com.ecl.trainning.cdi.bean.Order;
import com.ecl.trainning.cdi.qualifier.MyOrder;


@Decorator
public abstract class OrderDecorator implements Order {

	@Inject
	private Logger logger;
		
	@Inject
	@Delegate
	@MyOrder
	private Order order;

	public OrderDecorator() {
		System.out.println("OrderDecorator");
	}

	@Override
	public String getNumber() {
		logger.info("calling getNumber from decorator");
		return order.getNumber();
	}

	@Override
	public String getShopName() {
		// TODO Auto-generated method stub
		return order.getShopName() + " Decorated by OrderDecorator";
	}

}
