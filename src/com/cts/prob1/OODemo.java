package com.cts.prob1;

class Vehicle{
	int maxSpeed;
	public void start(){
		System.out.println("Vehicle start");
	}
}
class Plane extends Vehicle{
	int maxAlt;
//	@Override
	public void start(){
		System.out.println("Vehicle start");
	}
}

public class OODemo {

	public static void main(String[] args) {
		Vehicle plane = new Vehicle();
		plane.start();
		
		
		
		if(plane instanceof Plane){
			Plane p  = (Plane) plane;
			p.start();
		}
		
		

	}

}
