package com.override;

public class Car extends Vehicle {

	@Override
	public void msg(String m) {
		System.out.println("Vehicle is Car" + m);
	}

}
