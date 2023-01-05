package com.neosoft.java8;

interface L1{
	default void m1() {
		System.out.println("L1 method");
	}
}

interface L2{
	default void m1() {
		System.out.println("L2 method");
	}
}

public class DefaultMethod implements L1,L2{
	/*
	 * @Override public void m1() { System.out.println("default method override"); }
	 */
	public void m1() {
		L2.super.m1(); 
	}
	
	public static void main(String[] args) {
		DefaultMethod d=new DefaultMethod();
		d.m1();
	}
}
