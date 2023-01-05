package com.neosoft.staticandfinal;

class Student{
	public int rollNo;
	public String name;
	public static String collName="LTCOE";
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ",collName="+collName+"]";
	}
	
}

public class Static1 {
	public static void main(String[] args) {
		Student s=new Student(121,"Riddhi");
		Student s1=new Student(121,"Riddhi");
		System.out.println(s);
		System.out.println(s1);
	}
	
}
