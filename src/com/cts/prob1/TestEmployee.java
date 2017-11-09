package com.cts.prob1;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
	
	public static void printEmployee(Employee emp){
		System.out.println(emp);
	}
	
	public static void main(String[] args) {
		
		Manager manager = new Manager(12, "Ravi", 34533.4,10);
		System.out.println(manager);
		printEmployee(manager);
//		Employee emp = new Employee(12, "Ravi", 34533.4);
//		Employee emp2 = new Employee(122, "Priya", 34353.4);
//		System.out.println(emp.toString());
//		System.out.println(emp2);
//		
		List<Employee> employees = new ArrayList<>();
//		employees.add(emp);
//		employees.add(emp2);
//		System.out.println(employees);
	}

}
