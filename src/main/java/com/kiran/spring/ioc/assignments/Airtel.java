package com.kiran.spring.ioc.assignments;

public class Airtel {
	private Service service;
	
	public void setService(Service service) {
		this.service = service;
	}
	
	public void activateService() {
		service.service();
		
	}
	
}
