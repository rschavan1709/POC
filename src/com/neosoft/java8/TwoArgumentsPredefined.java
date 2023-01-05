package com.neosoft.java8;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

class Student1{
	int rollNo;
	String name;
	public Student1(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

}

public class TwoArgumentsPredefined {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bp=(a,b)->(a+b)%2==0;
		System.out.println(bp.test(12, 22));
		System.out.println(bp.test(34, 44));
		
		BiFunction<Integer, String, Student1> bif=(i,name)->new Student1(i, name);
		BiConsumer<Integer, String> bic=(i,name)->{System.out.println("Student roll no is: "+i);
		System.out.println("Student Name is: "+name);};
		ArrayList<Student1> al1=new ArrayList<>();
		al1.add(bif.apply(121, "Riddhi"));
		al1.add(bif.apply(122, "Siddhi"));
		for(Student1 s:al1) {
			bic.accept(s.rollNo, s.name);
		}
	}
}
