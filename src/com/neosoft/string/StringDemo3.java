package com.neosoft.string;

public class StringDemo3 {
	public static void main(String[] args) {
		String s="Riddhi";
		System.out.println(s.isEmpty());
		
		System.out.println(s.length());
		
		String s1="ababab";
		System.out.println(s1.replace('a', 'b'));
		
		String s2="abcdefg";
		System.out.println(s2.substring(3));
		
		System.out.println(s2.substring(3, 6));
		
		System.out.println(s.indexOf('d'));
		System.out.println(s.indexOf('z'));
		
		s1="babbab";
		System.out.println(s1.indexOf('a'));
		
		System.out.println(s1.lastIndexOf('a'));
		
		String s3="Siddhi";
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		
		System.out.println(s3.charAt(3));
		
		System.out.println(s3.equals("SIDDHI"));
		System.out.println(s3.equalsIgnoreCase("SIDDHI"));
		System.out.println(s3.equals("  SIDDHI   "));
		
		String s4="   Riddhi    ";
		System.out.println(s4.trim().toLowerCase());
		
		String s5="riddhi";
		System.out.println(s5.equals(s4.trim().toLowerCase()));
	}
}
