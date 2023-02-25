package com.kiran.spring.ioc.SpringDependecyInj;

public class MathCheat  implements Cheat{
	
	public void cheat() {
		System.out.println("maths cheating");
	}
	
	public MathCheat() {
	System.out.println("MathCheat Constructor calling");
	}
}
