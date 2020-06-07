package com.java8.client;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import com.java8.classes.Employee;
import com.java8.interfacedemo.Person;
public class Java8InterfaceClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee emp1 = new Employee("Raj", "IDC");
		Employee emp2 = new Employee("Priya", "Designing");
		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		Person employee = new Employee();
		Person.printPersonDetails(employee.sortPerson(list));
		/**
		 * Functional Programming
		 */
		String fileName = "D:\\PGR Project\\data.txt";
		try {
			List<String> stringList = Files.lines(Paths.get(fileName))
					.filter(p->p.startsWith("E"))
					.limit(5)
					.collect(Collectors.toList());
			stringList.stream().forEach(e->System.out.println(e));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String str = new String("The goal is to learn functional programming");
		Function<String, Integer> function = new Function<String, Integer>() {
			@Override
			public Integer apply(String str) {
				return str.split(" ").length;
			}
		};
		System.out.println("String length = "+function.apply(str));
		/**
		 * Supplier and Function demo
		 */
		Supplier<Employee> empSupplier = Employee::new;
		Employee employee2 = empSupplier.get();
		Supplier<String>supplier = employee2::greet;
		System.out.println(supplier.get());
		
		Function<String, String>employeeFunction = employee2::greetFromEmployee;
		System.out.println(employeeFunction.apply("Raj"));
		
		Function<String, Integer> stringToInteger = new Function<String, Integer>(){
			@Override
			public Integer apply(String t) {
				return t.split(" ").length;
			}
		};
		
		Function<Integer, String> integerToString = new Function<Integer, String>() {
			@Override
			public String apply(Integer t) {
				switch (t) {
				case 1:
					return "one";
				case 2:
					return "two";
				case 3:
					return "three";
				default:
					return "unknown";
				}
			}
		};
		/**
		 * function chaining in java
		 */
		String s = stringToInteger.andThen(integerToString).apply("hello Java8");
		System.out.println(s);
	}
}
