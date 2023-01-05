package com.neosoft.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Student2{
	int rollNo;
	String name;
	int marks;
	
	public Student2(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student2 [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
}

public class Streams {
	public static void main(String[] args) {
		List<Student2> l=new ArrayList<>();
		l.add(new Student2(1211, "Riddhi", 160));
		l.add(new Student2(1212, "Siddhi", 120));
		l.add(new Student2(1213, "Kajal", 140));
		l.add(new Student2(1214, "Anchal", 150));
		l.add(new Student2(1215, "Manasi", 155));
		l.stream().forEach(s->System.out.println(s));
		
		Predicate<Student2> p=s->(s.marks)>150;
		System.out.println("--Filter and Map----");
		List<Student2> l1=l.stream()
				.filter(c->p.test(c))
				.collect(Collectors.toList());
		l1.stream().forEach(s->System.out.println(s));
		
		System.out.println("--Count--");
		long c=l.stream().filter(s->(s.getName().length()==6)).count();
		System.out.println(c);
		
		System.out.println("--Sorted--");
		List<String> l2=l.stream().map(s->s.name).sorted().collect(Collectors.toList());
		l2.stream().forEach(s->System.out.println(s));
		
		List<Student2> list=l.stream().filter(s->s.name.startsWith("S")).collect(Collectors.toList());
		System.out.println(list);
		
		System.out.println("--Sorted Comparator--");
		List<String> l3=l.stream().map(s->s.name)
				.sorted((S1,S2)->{return S2.compareTo(S1);})
				.collect(Collectors.toList());
		l3.stream().forEach(s->System.out.println(s));
		
		System.out.println("--MIN MAX--");
		Integer s1=l.stream().map(s->s.marks).min((S1,S2)->{return S1.compareTo(S2);})
		.get();
		System.out.println(s1);
		Integer s2=l.stream().map(s->s.marks).max((S1,S2)->{return S1.compareTo(S2);})
		.get();
		System.out.println(s2);
		
		System.out.println("iterate");
		List<Integer> i=Stream.iterate(1, e->e+1).filter(e->e%2==0).limit(4)
		.collect(Collectors.toList());
		i.stream().forEach(s->System.out.println(s));
		
		Object[] obj=i.toArray();
		for(Object o:obj) {
			System.out.println(o);
		}
		
		Integer i1= l.stream().collect(Collectors.summingInt(s->s.marks));
		System.out.println(i1);
		
		Set<Integer> set=l.stream().map(s->s.rollNo).collect(Collectors.toSet());
		set.stream().forEach(s->System.out.println(s));
		
		Map<Integer, String> m=l.stream().collect(Collectors.toMap(s->s.rollNo, s->s.name));
		for(Map.Entry<Integer, String> m1:m.entrySet()) {
			System.out.println("Student id is "+m1.getKey()+" Student name is "+m1.getValue());
		}
	}
}
