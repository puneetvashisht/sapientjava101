package com.sapient.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {
	
	static List<Employee> employees = new ArrayList<>();
	
	public static boolean findEmployee(Employee o) throws UserNotFoundException{
		boolean result = employees.contains(o);
		if(!result){
			throw new UserNotFoundException("Employee Not Found!!");
		}
		return true;
	}
	
	

	public static void main(String[] args) {
		
		
		Employee emp = new Employee(12, "Ravi", 34533.4);
		Employee emp2 = new Employee(122, "Priya", 24353.4);
		Employee emp3 = new Employee(12, "Amit", 64533.4);
		Employee emp4 = new Employee(122, "Sania", 54353.4);	
		
		employees.add(emp);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		System.out.println(employees);
		
		boolean result;
		try {
			result = findEmployee(new Employee(122, "Priya", 24353.4));
			System.out.println(result);
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		Collections.sort(employees);
//		
//		System.out.println(employees);
//		
//		Collections.sort(employees, new SalaryComparator());
//		
//		System.out.println(employees);
		
		
		
		
		
		
	}

}
