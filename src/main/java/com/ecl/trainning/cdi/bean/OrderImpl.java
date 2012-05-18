package com.ecl.trainning.cdi.bean;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;

import br.gov.frameworkdemoiselle.transaction.Transactional;

import com.ecl.trainning.cdi.interceptors.OrderTransation;
import com.ecl.trainning.cdi.qualifier.MyOrder;


public class OrderImpl implements Order{
	
	
	private Logger logger;
	
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

	@Inject
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	
	public void setShopName(String name) {
		this.shopName = name;
	}

	@OrderTransation
	@Override
	@Transactional
	public void pay() {
		System.out.println("Order#pay()");
	}
	
	@PostConstruct
	public void afterConstruct() {
		System.out.println("OrderImpl already instanciated.");
	}
	
	
}
