package com.neosoft.overloading;

public class AutoPromotion2 {
	public void m2(Object o) {
		System.out.println("Object ");
	}
	
	public void m2(String s) {
		System.out.println("String "+s);
	}
	
	/*
	 * public void m2(StringBuffer sb) { System.out.println("StringBuffer "+sb); }
	 */
	
	//In overloading Child will always get high priority then Parent
	public static void main(String[] args) {
		AutoPromotion2 a1=new AutoPromotion2();
		a1.m2("Riddhi");
		a1.m2(new StringBuffer("riddhi"));
		a1.m2(null);
		a1.m2(new Object());
	}
}
