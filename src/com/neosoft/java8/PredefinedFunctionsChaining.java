package com.neosoft.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredefinedFunctionsChaining {
	public static void main(String[] args) {
		//predicate joining
		Predicate<String> p=s->s.length()>5;
		Predicate<String> p1=s->s.equals("Riddhi");
		System.out.println(p.and(p1).test("RIDDHI"));
		System.out.println(p.negate().test("riddhi"));
		
		//function chaining
		Function<Integer,Integer> f=i->i+2;
		Function<Integer, Integer> f1=i->i*2;
		System.out.println(f.andThen(f1).apply(2));
		System.out.println(f.compose(f1).apply(2));
		
		Consumer<String> c=s->System.out.println("FIRST CONSUMER "+s);
		Consumer<String> c1=s->System.out.println("SECOND CONSUMER "+s);
		Consumer<String> cc=c.andThen(c1);
		cc.accept("Riddhi");
	}
}
