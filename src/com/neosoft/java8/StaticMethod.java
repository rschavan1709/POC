package com.neosoft.java8;

interface P1{
	int x=10;
	static void m1() {
		System.out.println("static method");
	}
}

public class StaticMethod implements P1{
	public static void m1() {
		System.out.println("static method implementation class");
	}
	
	public static void main(String[] args) {
		StaticMethod s=new StaticMethod();
		//s.m1();
		//s.x;
		P1.m1();
		System.out.println(P1.x);
		
	}
}
