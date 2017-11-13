package com.sapient.collections;

public class ExceptionsDemo {

	public static void m3(int i) {
		if(i<0){
			throw new RuntimeException("input is incorrect");
		}
		System.out.println("Does something");
	}

	public static void m2() {
		m3(-2);
	}

	public static void m1() {
		try{
			m2();
		}
		catch(Exception e){
			e.printStackTrace();
			//Handling 
			//Sending Email... Reconnect
		}
		
	}

	public static void main(String[] args) {
		m1();
		System.out.println("Allz well!!");
	}	

}
