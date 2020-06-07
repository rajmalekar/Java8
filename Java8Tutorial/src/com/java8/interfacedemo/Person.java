package com.java8.interfacedemo;

import java.util.Collections;
import java.util.List;

import com.java8.classes.Employee;

public interface Person {
	
	default public List<Employee> sortPerson(List<Employee> empList){
		System.out.println("sortPerson from Person Interface");
		Collections.sort(empList);
		return empList;
	}
	
	static void printPersonDetails(List<Employee> employees) {
		employees.stream().forEach((emp)->{
			System.out.println(emp.toString());
			});
	}
	
	public String greet();
}
