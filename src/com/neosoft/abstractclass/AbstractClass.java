package com.neosoft.abstractclass;

abstract class Abstract{
	abstract void m1();
}

public class AbstractClass extends Abstract {

	@Override
	void m1() {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		Abstract a=new AbstractClass();
		a.m1();
	}
}
