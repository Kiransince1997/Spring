package com.kiran.spring.ioc.SpringDependecyInj;

public class Student {
	int id;
	
	private Cheat cheat;

	public void cheating() {
		cheat.cheat();
		System.out.println("Hey my id is "+ id + " take and do whatever you want");
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

	
}
