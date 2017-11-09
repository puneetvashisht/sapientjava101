package com.sapient.prob2;

public abstract class Vehicle {
	
	
	
	int maxSpeed;
	Engine engine;
	public Vehicle(int maxSpeed, Engine engine) {
		super();
		this.maxSpeed = maxSpeed;
		this.engine = engine;
	}
	
	public abstract void start();
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Vehicle [maxSpeed=" + maxSpeed + ", engine=" + engine + "]";
	}
	
	
}
