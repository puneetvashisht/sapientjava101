package com.cts.prob1;

public class Manager extends Employee {
	
	int employeesWorkingUnder;
	
	

	public Manager(int id, String name, double salary, int employeesWorkingUnder) {
		super(id, name, salary);
		this.employeesWorkingUnder = employeesWorkingUnder;
	}

	public Manager(int employeesWorkingUnder) {
		super();
		this.employeesWorkingUnder = employeesWorkingUnder;
	}

	public int getEmployeesWorkingUnder() {
		return employeesWorkingUnder;
	}

	public void setEmployeesWorkingUnder(int employeesWorkingUnder) {
		this.employeesWorkingUnder = employeesWorkingUnder;
	}

	@Override
	public String toString() {
		return "Manager [employeesWorkingUnder=" + employeesWorkingUnder + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getSalary()=" + getSalary() + ", getYearsOfExperience()=" + getYearsOfExperience()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

}
