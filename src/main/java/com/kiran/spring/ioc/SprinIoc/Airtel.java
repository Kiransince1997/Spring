package com.kiran.spring.ioc.SprinIoc;

public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.println("calling from airtel sim");
		
	}

	@Override
	public void data() {
	System.out.println("Data using from airtel sim");
		
	}

}
