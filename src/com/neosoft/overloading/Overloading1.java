package com.neosoft.overloading;

public class Overloading1 {
	public void m1() {
		System.out.println("no-argument");
	}
	
	public void m1(int i) {
		System.out.println("int-argument "+i);
	}
	
	public void m1(double d) {
		System.out.println("double-argument "+d);
	}
	
	public static void main(String[] args) {
		Overloading1 o=new Overloading1();
		o.m1();
		o.m1(20);
		o.m1(10.5);
	}
}
