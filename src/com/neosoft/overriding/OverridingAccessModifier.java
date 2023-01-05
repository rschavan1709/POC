package com.neosoft.overriding;

class Parent5{
	public void m1() {
		System.out.println("Parent");
	}
}

public class OverridingAccessModifier extends Parent5 {
	public void m1() {
		System.out.println("Child");
	}
}

/*
 * protected class Child extends OverridingAccessModifier{
 * 
 * }
 */