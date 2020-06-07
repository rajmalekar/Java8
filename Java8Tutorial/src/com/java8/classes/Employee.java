package com.java8.classes;

import com.java8.interfacedemo.Person;

public class Employee implements Person, Comparable<Employee> {
	private String empName;
	private String empDept;
	public Employee() {
		super();
	}
	public Employee(String empName, String empDept) {
		super();
		this.empName = empName;
		this.empDept = empDept;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empDept=" + empDept + "]";
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	@Override
	public int compareTo(Employee emp) {
		return this.getEmpName().compareTo(emp.getEmpName());
	}
	@Override
	public String greet() {
		return "welcom Raj";
	}
	public String greetFromEmployee(String name) {
		return "Hello From Employee "+name;
	}
}
