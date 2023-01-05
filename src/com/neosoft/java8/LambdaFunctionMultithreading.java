package com.neosoft.java8;

public class LambdaFunctionMultithreading {
	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0;i<10;i++) {
				System.out.println("child thread"+i);
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int j=0;j<10;j++) {
			System.out.println("main thread"+j);
		}
	}
}
