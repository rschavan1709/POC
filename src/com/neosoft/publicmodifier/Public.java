package com.neosoft.publicmodifier;

import com.neosoft.defaultmodifier.Default;

public class Public {
	public void m3() {
		System.out.println("Public Modifiers");
	}
	public static void main(String[] args) {
	Default d=new Default();
	//Method is default so it can be access only within package 
	//d.m2();
}
}
