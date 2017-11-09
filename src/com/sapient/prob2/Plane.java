package com.sapient.prob2;

public class Plane extends Vehicle {

	String name;
	int maxAltitude;
	
	public Plane(int maxSpeed, Engine engine, String name,int maxAltitude) {
		super(maxSpeed, engine);
		this.name = name;
		this.maxAltitude = maxAltitude;
	}


	@Override
	public String toString() {
		return "Plane [name=" + name + ", maxAltitude=" + maxAltitude + ", maxSpeed=" + maxSpeed + ", engine=" + engine
				+ "]";
	}



	@Override
	public void start() {
		this.engine.startEngine();
		
		System.out.println("Staring up plane....");
		System.out.println(this);
		//startEngine
	}
	

}
