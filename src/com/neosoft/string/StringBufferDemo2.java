package com.neosoft.string;

public class StringBufferDemo2 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("Riddhi").append("Chavan").reverse().insert(1, 1709).delete(3, 7);
		System.out.println(sb);
	}
}
