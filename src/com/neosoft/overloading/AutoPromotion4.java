package com.neosoft.overloading;

public class AutoPromotion4 {
	public void m1(int i) {
		System.out.println("int-method");
	}
	
	public void m1(int...i) {
		System.out.println("var-arg method");
	}
	
	public static void main(String[] args) {
		AutoPromotion4 a4=new AutoPromotion4();
		a4.m1(10);
		a4.m1(10,10);
		a4.m1();
	}
	
}
