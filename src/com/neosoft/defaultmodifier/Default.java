package com.neosoft.defaultmodifier;

import com.neosoft.publicmodifier.Public;

public class Default {
	void m2() {
		System.out.println("Default Modifier");
	}
	public static void main(String[] args) {
		Public p=new Public();
		p.m3();
	}
}
