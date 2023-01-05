package com.neosoft.protectedmodifier;

public class Protected {
	protected void m4() {
		System.out.println("Protected Modifiers");
	}
	public static void main(String[] args) {
		Protected p1=new Protected();
		p1.m4();
	}
}
