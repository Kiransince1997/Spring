package com.kiran.spring.ioc.SprinSetters;

public class Student {
	private int id;
	private String studentName;
	
	
	public Student() {
		super();
	}
	public Student(int id) {
		super();
		this.id = id;
	}
	public Student(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void displayStudent() {
		System.out.println("Student name is :"+ studentName +" and id is :"+id);
		
	}
	
}
