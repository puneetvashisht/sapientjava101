package com.sapient.prob2;

public class TestSetup {

	public static void main(String[] args) {
		Engine carEngine = new Engine("Ford", "X1");
		Car car = new Car(300, carEngine, "Scorpio");
		car.start();
		
		
		SpecialEngine planeEngine = new SpecialEngine("Boeing", "788", true);
		Plane plane = new Plane(9000, planeEngine, "Airbus", 10000);
		plane.start();
	}

}
