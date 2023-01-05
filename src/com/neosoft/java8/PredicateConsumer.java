package com.neosoft.java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateConsumer {
	public static void main(String[] args) {
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(4));
		
		Function<Integer,Integer> f=i->i*i;
		System.out.println(f.apply(4));
		
		Predicate<String> p1=s->s.length()>5;
		System.out.println(p1.test("Riddhi"));	
		
		Function<Integer,Integer> f1=i->i*i*i;
		System.out.println(f1.apply(2));
	}
}
