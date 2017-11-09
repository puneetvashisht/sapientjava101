package com.sapient.prob2;

public class Engine {
	String make;
	String model;
	public Engine(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Engine [make=" + make + ", model=" + model + "]";
	}
	
	public void startEngine(){
		System.out.println("Staring up engine first....");
		System.out.println(this);
	}
	
	
}
