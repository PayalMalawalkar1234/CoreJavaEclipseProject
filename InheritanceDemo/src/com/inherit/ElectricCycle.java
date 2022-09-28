package com.inherit;

public class ElectricCycle extends Cycle {

	private String battery;

	public ElectricCycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectricCycle(String wheels, int seatLevel, double price, String brand, Object noOfGears, Object speed) {
		super(wheels, seatLevel, price, brand, noOfGears, speed);
		// TODO Auto-generated constructor stub
	}

	public ElectricCycle(String battery) {
		super();
		this.battery = battery;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

}
