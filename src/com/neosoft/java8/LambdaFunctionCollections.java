package com.neosoft.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int rollNo;
	String name;
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}

public class LambdaFunctionCollections {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(11,"Riddhi"));
		al.add(new Student(12,"Siddhi"));
		al.add(new Student(13,"Kajal"));
		al.add(new Student(14,"Anchal"));
		System.out.println(al);
		Comparator<Student> c=(o1,o2)->{
			Student s1=(Student)o1;
			Student s2=(Student)o2;
			return s1.getName().compareTo(s2.getName());
		};
		Collections.sort(al,c);
		al.stream().forEach(i->System.out.println(i));
	}
}
