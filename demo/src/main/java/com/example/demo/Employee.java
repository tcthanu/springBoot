package com.example.demo;

public class Employee {
	private int id;
	private String name;
	private String dept;
	private double salary;

	Employee(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public double getSalary() {
		return salary;
	}
}
