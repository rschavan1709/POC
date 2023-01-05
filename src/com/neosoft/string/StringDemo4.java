package com.neosoft.string;

public class StringDemo4 {
	public static void main(String[] args) {
		String s1="Riddhi";
		String s2=s1.toString();
		String s3=s1.toLowerCase();
		String s4=s1.toUpperCase();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
		String s="Radha";
		String s5="";
		for(int i=s.length()-1;i>=0;i--) {
			Character c= s.charAt(i);
			s5=s5+c;
		}
		System.out.println(s5);
		
		String str="lokesh";
		for(char c:str.toCharArray())
		{
		if(str.indexOf(c)==str.lastIndexOf(c)){
		System.out.println("non repeted character:"+c);
		}
	}
	}
}
