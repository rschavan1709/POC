package com.neosoft.string;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer();
		System.out.println(s.capacity());
		s.append("abcdefghijklmnop");
		System.out.println(s.capacity());
		s.append("q");
		System.out.println(s.capacity());
		s.append("abcdefghijklmnop");
		s.append("q");
		System.out.println(s.capacity());
		s.append("r");
		System.out.println(s.capacity());
		
		StringBuffer sb=new StringBuffer(1000);
		System.out.println(sb.capacity());
		
		StringBuffer sb1=new StringBuffer("Riddhi");
		System.out.println(sb1.capacity());
	}
}
