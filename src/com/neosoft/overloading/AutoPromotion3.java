package com.neosoft.overloading;

public class AutoPromotion3 {
	public void m1(int i,float f) {
		System.out.println("Int-Float "+i+f);
	}
	
	public void m1(float f,int i) {
		System.out.println("Float-Int "+f+i);
	}
	
	public static void main(String[] args) {
		AutoPromotion3 a3=new AutoPromotion3();
		a3.m1(10, 10.2f);
		a3.m1(10.5f, 10);
		//a3.m1(10, 10);
		//a3.m1(10.5f, 10.5f);
	}
}
