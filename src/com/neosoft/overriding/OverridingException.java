package com.neosoft.overriding;

import java.io.IOException;

class Parent6{
	public void m1() throws IOException {
		System.out.println("Parent");
	}
}

public class OverridingException extends Parent6 {
	public void m1() throws IOException,NullPointerException {
		System.out.println("Child");
	}
}
