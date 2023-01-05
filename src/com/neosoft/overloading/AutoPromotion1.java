package com.neosoft.overloading;

public class AutoPromotion1 {
	
	public void m1(long l) {
		System.out.println("Long "+l);
	}
	
	public void m1(double d) {
		System.out.println("Double "+d);
	}
	
	public static void main(String[] args) {
		AutoPromotion1 a=new AutoPromotion1();
		a.m1(10);
		a.m1(10.5f);
	}
}
