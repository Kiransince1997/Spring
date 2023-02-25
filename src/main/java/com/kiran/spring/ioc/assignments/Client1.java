package com.kiran.spring.ioc.assignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean2.xml");
		Airtel airtel=context.getBean("airtel", Airtel.class);
		airtel.activateService();
	}
}