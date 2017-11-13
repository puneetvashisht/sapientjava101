package com.cts.prob1;

import com.sapient.collections.UserNotFoundException;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private int yearsOfExperience;
	
//	public double incrementSalary(double incrementAmount){
//		this.salary +=incrementAmount;
//		return this.salary;
//	}
	public Employee(){
		
	}
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
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", yearsOfExperience="
				+ yearsOfExperience + "]";
	}
	public double incrementSalary(double incrementAmount) throws NegativeSalaryException {
		if(incrementAmount<0){
			throw new NegativeSalaryException("Negative Salary!!");
		}
		this.salary +=incrementAmount;
		return this.salary;
	}
	
	
	
}
