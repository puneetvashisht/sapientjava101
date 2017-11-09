package com.sapient.prob2;

public class SpecialEngine extends Engine {
	boolean booster;

	public SpecialEngine(String make, String model, boolean booster) {
		super(make, model);
		this.booster = booster;
	}

	@Override
	public String toString() {
		return "SpecialEngine [booster=" + booster + ", make=" + make + ", model=" + model + "]";
	}
	
	

}
