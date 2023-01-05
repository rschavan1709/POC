package com.neosoft.interfaces;

interface I1{
	int x=10;
	void m1();
	void m2();
	//void m3();
}

interface I2{
	int x=20;
	void m1();
	void m2(int i);
	//int m3();
}

public class InterfaceNamingConflict implements I2,I1{

	@Override
	public void m1() {
		System.out.println("m1 method");
	}

	@Override
	public void m2(int i) {
		System.out.println("m2 method with int input "+i);
	}

	@Override
	public void m2() {
		System.out.println("m2 method");
	}
	
	public static void main(String[] args) {
		InterfaceNamingConflict i=new InterfaceNamingConflict();
		i.m1();
		i.m2();
		i.m2(10);
		System.out.println(I1.x);
		System.out.println(I2.x);
	}

}
