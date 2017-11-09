package com.sapient.prob2;

public class Car extends Vehicle {

	String name;
	
	public Car(int maxSpeed, Engine engine, String name) {
		super(maxSpeed, engine);
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "Car [name=" + name + ", maxSpeed=" + maxSpeed + ", engine=" + engine + "]";
	}



	@Override
	public void start() {
		this.engine.startEngine();
		
		System.out.println("Staring up car....");
		System.out.println(this);
		//startEngine
	}
	

}
