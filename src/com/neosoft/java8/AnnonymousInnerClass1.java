package com.neosoft.java8;

interface Interf3{
	public void m1();
	public void m2();
}

public class AnnonymousInnerClass1 {
	public static void main(String[] args) {
		Interf3 i=new Interf3() {
			
			@Override
			public void m2() {
				System.out.println("Hello");
			}
			
			@Override
			public void m1() {
				System.out.println("Hi");
			}
		};
		i.m1();
		i.m2();
	}
}
