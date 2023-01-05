package com.neosoft.overloading;

class Vehicle{
	
}

class Car extends Vehicle{
	
}

public class AutoPromotion5 {
	public void m1(Vehicle v) {
		System.out.println("Vehicle");
	}
	
	public void m1(Car c) {
		System.out.println("Car");
	}
	
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		AutoPromotion5 a5=new AutoPromotion5();
		a5.m1(v);
		Car c=new Car();
		a5.m1(c);
		Vehicle v1=new Car();
		a5.m1(v1);
		
	}
}
