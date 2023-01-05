package com.neosoft.string;

public class StringDemo {
	public static void main(String[] args) {
		String s=new String("Riddhi");
		s.concat("Chavan");
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer("Riddhi ");
		sb.append("Chavan");
		System.out.println(sb);
		
		String s1=new String("Riddhi");
		String s2=new String("Riddhi");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		StringBuffer sb1=new StringBuffer("Riddhi");
		StringBuffer sb2=new StringBuffer("Riddhi");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
	}
}
