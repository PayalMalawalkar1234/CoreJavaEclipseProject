package com.inherit;

public class MountainCycle extends Cycle {

	private int noOfGears;
	private double speed;

	public MountainCycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MountainCycle(String wheels, int seatLevel, double price, String brand) {
		super();
		// TODO Auto-generated constructor stub

	}

	public MountainCycle(String wheels, int seatLevel, double price, String brand, int noOfGears, double speed) {
		super(wheels, seatLevel, price, brand, noOfGears, speed);

		this.noOfGears = noOfGears;
		this.speed = speed;

	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "MountainCycle [noOfGears=" + noOfGears + ", speed=" + speed + ", toString()=" + super.toString() + "]";
	}

}
