package com.neosoft.java8;

interface Interf{
	public void m1();
}

interface Interf1{
	public void square(int i);
}

public class LambdaFunction {
	public static void main(String[] args) {
		Interf i1=()->System.out.println("Hello....");
		i1.m1();
		Interf1 i2=i->System.out.println("The square is: "+(i*i));
		i2.square(4);
}
}

