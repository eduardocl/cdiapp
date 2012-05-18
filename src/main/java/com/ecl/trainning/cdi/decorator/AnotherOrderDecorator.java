package com.ecl.trainning.cdi.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

import com.ecl.trainning.cdi.bean.Order;
import com.ecl.trainning.cdi.qualifier.MyOrder;


@Decorator
public abstract class AnotherOrderDecorator implements Order {

	@Inject
	@Delegate
	@MyOrder
	private Order order;

	public AnotherOrderDecorator() {
	}

	@Override
	public String getNumber() {
		return order.getNumber().concat(" from another decorator");
	}

	@Override
	public String getShopName() {
		return order.getShopName().concat(" from another decorator");
	}

}
