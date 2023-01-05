package com.neosoft.overriding;

class Parent4{
	public void m1() {
		System.out.println("Parent Method");
	}
}

abstract class child extends Parent4{
	public abstract void m1();
}
public class OverridingAbstract1 {

}
