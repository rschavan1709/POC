package com.neosoft.overriding;

class Parent2{
	public final void m1() {
		System.out.println("this is parent m1 method");
	}
	
	public void m2() {
		System.out.println("this is parent m2 method");
	}
}

public class OverridingFinal extends Parent2{
	
	/*
	 * public final void m1() { System.out.println("this is parent method"); }
	 */
	
	public final void m2() {
		System.out.println("this is child m2 method");
	}
	
}
