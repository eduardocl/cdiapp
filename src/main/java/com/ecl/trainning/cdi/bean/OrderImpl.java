package com.ecl.trainning.cdi.bean;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;

import com.ecl.trainning.cdi.qualifier.MyOrder;


public class OrderImpl implements Order{

	private String number;
	private String shopName;
	
	public OrderImpl(String number, String shopName) {
		this.number = number;
		this.shopName = shopName;
	}
	
	@Override
	public String getNumber() {
		return number;
	}

	@Override
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String name) {
		this.shopName = name;
	}
	
	
	
}
