package com.neosoft.string;

public class StringBufferDemo1 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("PI value is ");
		sb.append(3.14);
		sb.append(" It is exactly ");
		sb.append(true);
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("Riddhi");
		sb1.setCharAt(0, 's');
		System.out.println(sb1);
		
		sb1.insert(6, "Chavan");
		System.out.println(sb1);
		
		sb1.delete(3, 6);
		System.out.println(sb1);
		
		System.out.println(sb1.deleteCharAt(5));
		
		System.out.println(sb.reverse());
		
		sb.setLength(8);
		System.out.println(sb);
		
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(1000);
		System.out.println(sb1.capacity());
		
		StringBuffer sb2=new StringBuffer(1000);
		System.out.println(sb2.capacity());
		sb2.append("abcd");
		sb2.trimToSize();
		System.out.println(sb2.capacity());
	}
}
