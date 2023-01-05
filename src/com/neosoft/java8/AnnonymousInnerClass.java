package com.neosoft.java8;

import java.util.Iterator;

public class AnnonymousInnerClass {
	public static void main(String[] args) {
		
		//Annonymous inner class for Runnable Interface
		Runnable r=new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("child thread"+i);
				}
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		for(int j=0;j<10;j++) {
			System.out.println("main thread"+j);
		}
		
		//Annonymous inner class for Thread class
		Thread t1=new Thread() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("child thread"+i);
				}
			}
		};
		
		t1.start();
		for(int j=0;j<10;j++) {
			System.out.println("main thread"+j);
		}
	}
}
