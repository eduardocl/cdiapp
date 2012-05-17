package com.ecl.trainning.cdi.bean;


public class FakeOrder implements Order{

	@Override
	public String getNumber() {
		return "00000";
	}

	@Override
	public String getShopName() {
		return "Fake Shop";
	}

}
