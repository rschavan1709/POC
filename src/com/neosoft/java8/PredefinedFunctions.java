package com.neosoft.java8;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Employee{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class PredefinedFunctions {
	public static void main(String[] args) {
		Predicate<Employee> p=e->e.getSalary()>13000;
		Function<Employee,Double> f=e2->e2.salary+2000;
		Consumer<String> c=s->System.out.println(s);
		//Consumer<Employee> c1=e3->System.out.println(e3);
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee(1121, "ABC", 14000));
		al.add(new Employee(1122, "XYZ", 10000));
		al.add(new Employee(1123, "PQR", 8000));
		al.add(new Employee(1124, "LMN", 15000));
		al.add(new Employee(1125, "DEF", 18000));
		for(Employee e1:al) {
			if(p.test(e1)) {
				//c1.accept(e1);
				c.accept("Employee Details: ");
				System.out.println("Employee id is: "+e1.id);
				System.out.println("Employee name is: "+e1.name);
				System.out.println("Employee salary is: "+f.apply(e1));
				System.out.println("----------");
			}
		}
		
		Supplier<String> s=()->{
			String otp="";
			for(int i=0;i<6;i++) {
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(s.get());
		
	}
}
