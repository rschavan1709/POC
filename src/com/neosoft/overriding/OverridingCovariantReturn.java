package com.neosoft.overriding;

class Parent{
	public Object m1(String s) {
		System.out.println("String of parent is"+s);
		return s;
		
	}
}
public class OverridingCovariantReturn extends Parent{
	public String  m1(String s) {
		System.out.println("String of child is "+s);
		return s;
	}
	
	public static void main(String[] args) {
		OverridingCovariantReturn o=new OverridingCovariantReturn();
		o.m1("Riddhi");
	}
}
