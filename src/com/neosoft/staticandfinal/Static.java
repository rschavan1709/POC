package com.neosoft.staticandfinal;

class Stat{
	public static int x=10;
	
	public static void m1() {
		System.out.println("m1");
	}
}

public class Static extends Stat{

	public static void main(String[] args) {
		Static s=new Static();
		System.out.println(s.x);
		s.m1();
		Stat.m1();
		System.out.println(Stat.x);
	}
}
