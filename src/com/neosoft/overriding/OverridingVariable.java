package com.neosoft.overriding;

class Parent10{
	public int a=10;
	
}

public class OverridingVariable extends Parent10{
	public int a=20;
	
	public static void main(String[] args) {
		Parent10 p=new Parent10();
		System.out.println(p.a);
		OverridingVariable o=new OverridingVariable();
		System.out.println(o.a);
		Parent10 p1=new OverridingVariable();
		System.out.println(p1.a);
	}
}
