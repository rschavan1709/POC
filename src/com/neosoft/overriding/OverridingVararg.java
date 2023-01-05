package com.neosoft.overriding;

class Parent9{
	public void m1(int...i) {
		System.out.println("Var-arg method");
	}
}

public class OverridingVararg extends Parent9 {
	public void m1(int i) {
		System.out.println("Normal method");
	}
	
	public static void main(String[] args) {
		Parent9 p=new Parent9();
		p.m1(10);
		OverridingVararg ov=new OverridingVararg();
		ov.m1(10);
		Parent9 p1=new OverridingVararg();
		p.m1(10);
		// if we replace child class method with var arg then it will become overriding
	}
}
