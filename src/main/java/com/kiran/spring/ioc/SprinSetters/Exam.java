package com.kiran.spring.ioc.SprinSetters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student bean = context.getBean("student", Student.class);
		bean.displayStudent();
		Student bean2=context.getBean("Chandru", Student.class);
		bean2.displayStudent();
		Student cons1=context.getBean("student1", Student.class);
		cons1.displayStudent();
	}
}
