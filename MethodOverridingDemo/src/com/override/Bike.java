package com.override;

public class Bike extends Vehicle {
	@Override
	public void msg(String m) {
		System.out.println("Vehicle: Bike" + m);
	}

}
