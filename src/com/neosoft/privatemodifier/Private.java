package com.neosoft.privatemodifier;

import com.neosoft.protectedmodifier.Protected;

class A1 {
	private int a=10;
	private void m1() {
		System.out.println("Private Modifiers");
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	//if you make any class contructor private,you cannot create the instance of that class from outside the class
	
	/*
	 * private A1(){
	 * 
	 * }
	 */
	//A1 class cannot be private or protected except nested class.
}
public class Private extends Protected{
	public static void main(String[] args) {
		A1 obj=new A1();
		//We cannot access private members outside the class,only we can access within the class
		//obj.a;
		//obj.m1();
		System.out.println(obj.getA());
		obj.setA(20);
		System.out.println(obj.getA());
		
		Private p=new Private();
		p.m4();
	}
}