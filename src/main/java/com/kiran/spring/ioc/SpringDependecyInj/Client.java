package com.kiran.spring.ioc.SpringDependecyInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student stu=context.getBean("stu", Student.class);
		stu.cheating();
		ScienceCheat anotherStudent=context.getBean("anStu", ScienceCheat.class);
		anotherStudent.cheat();
	}
}
