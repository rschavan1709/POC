package com.neosoft.interfaces;

interface Interf{
	int x=10;
	void m1();
	void m2();
}
 abstract class Interface1 implements Interf{
	@Override
	public void m1() {
		System.out.println("m1 method");
	}

}

public class Interface extends Interface1{
	
	@Override
	public void m2() {
		System.out.println("m2 method");
	}
	
	public void m3() {
		
	}
	
	public static void main(String[] args) {
		Interface i=new Interface();
		i.m1();
		i.m2();
		System.out.println(i.x);
		System.out.println(Interf.x);
	}
}
