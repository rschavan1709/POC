package com.neosoft.string;

public class StringDemo1 {
	public static void main(String[] args) {
	String s1=new String("Spring");
	s1.concat("Fall");
	String s2=s1.concat("Winter");
	s2.concat("Summer");
	System.out.println(s1);
	System.out.println(s2);
	
	char[] ch= {'j','a','v','a'};
	String s=new String(ch);
	System.out.println(s);
	
	byte[] b= {100,101,102,103};
	String s3=new String(b);
	System.out.println(s3);
	}
}
