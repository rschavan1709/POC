package com.neosoft.abstractclass;

abstract class People{
	
	public People() {
		System.out.println("People object is created");
	}
	
	abstract void eats();
	
	void show() {
		System.out.println("Peoples");
	}
}

class Vegeterian extends People{

	@Override
	void eats() {
		System.out.println("People eats leafy vegetables,fruits,etc");
	}
	
}

class NonVegeterian extends People{

	@Override
	void eats() {
		System.out.println("People eats meat,fish,etc");
	}
	
}

public class AbstractClass1 {
	public static void main(String[] args) {
		People p;
		p=new Vegeterian();
		p.eats();
		p=new NonVegeterian();
		p.eats();
		p.show();
	}
}
