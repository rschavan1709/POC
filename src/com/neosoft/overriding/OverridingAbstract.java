package com.neosoft.overriding;

abstract class Parent3{
	public abstract void m1();
	
}

public class OverridingAbstract extends Parent3{

	@Override
	public void m1() {
		System.out.println("this is child method");
	}

}
