package com.kiran.spring.ioc.SpringDependecyInj;

public class ScienceCheat implements Cheat {

	private Cheat cheat;

	public void cheat() {
		System.out.println("another Student Started Cheating ");
	}

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
}
