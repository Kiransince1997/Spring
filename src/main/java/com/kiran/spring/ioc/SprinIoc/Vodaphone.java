package com.kiran.spring.ioc.SprinIoc;

public class Vodaphone implements Sim {
	@Override
	public void calling() {
		System.out.println("calling from VodaPhone sim");
		
	}

	@Override
	public void data() {
	System.out.println("Data using from Vodaphone sim");
		
	}
}
