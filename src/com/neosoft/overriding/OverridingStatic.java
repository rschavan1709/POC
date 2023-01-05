package com.neosoft.overriding;

class Parent8{
	public static void m1() {
		System.out.println("Parent Static Method");
	}
}

public class OverridingStatic extends Parent8{
	public static void m1() {
		System.out.println("Child Static Method");
	}
	
	public static void main(String[] args) {
		Parent8 p=new Parent8();
		p.m1();
		OverridingStatic os=new OverridingStatic();
		os.m1();
		Parent8 p1=new OverridingStatic();
		p1.m1();
		
	}
}
