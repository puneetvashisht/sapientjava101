package com.cts.prob1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmployeeStuff {

	@Test
	public void testEmployeeIncrement() {
		Employee emp = new Employee(12, "Ravi", 34533.4);
		double newSalary = emp.incrementSalary(5000);
		
		assertEquals(39533.4, newSalary,.1);
		
//		fail("Not yet implemented");
	}

}
