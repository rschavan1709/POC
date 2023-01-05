package com.neosoft.overriding;

class Overriding{
	public void m1() {
		System.out.println("this is m1 method of parent");
	}
	
	public void m2() {
		System.out.println("this is m2 method of parent");
	}
}

public class OverridingSimple extends Overriding{
	public void m1() {
		System.out.println("this is overriding method m1");
	}
	
	public static void main(String[] args) {
		Overriding o=new Overriding();
		o.m1();
		OverridingSimple o1=new OverridingSimple();
		o1.m1();
		Overriding o3=new OverridingSimple();
		o3.m1();
	}
}
