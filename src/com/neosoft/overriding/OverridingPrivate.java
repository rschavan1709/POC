package com.neosoft.overriding;

class Parent1{
	private void m1() {
		System.out.println("this is m1 method of parent");
	}
	
}
public class OverridingPrivate extends Parent1{
	private void m1() {
		System.out.println("this is m1 method of child");
	}
	
	public static void main(String[] args) {
		Parent1 p=new Parent1();
		//p.m1();
	}
}
