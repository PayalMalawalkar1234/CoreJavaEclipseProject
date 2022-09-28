package com.inherit;

public class MountainRacingCycle {
	private static Object wheels;
	private static Object seatLevel;
	private static Object price;
	private static Object brand;
	private static Object noOfGears;
	private static Object speed;
	private boolean GPS;
	private String light;
	private String speedBooster;

	public MountainRacingCycle(String string, int i, double d, String string2, int j, int k, boolean b, String string3,
			String string4) {
		super();
		System.out.println("---Default Constructor of MountainRacer Cycle------");
		// TODO Auto-generated constructor stub
	}

	public MountainRacingCycle(boolean gPS, String light, String speedBooster) {
		super();
		System.out.println("---Parametrised Constructor of MountainRacer Cycle------");
		GPS = gPS;
		this.light = light;
		this.speedBooster = speedBooster;
	}

	public static Object getWheels() {
		return wheels;
	}

	public static void setWheels(Object wheels) {
		MountainRacingCycle.wheels = wheels;
	}

	public static Object getSeatLevel() {
		return seatLevel;
	}

	public static void setSeatLevel(Object seatLevel) {
		MountainRacingCycle.seatLevel = seatLevel;
	}

	public static Object getPrice() {
		return price;
	}

	public static void setPrice(Object price) {
		MountainRacingCycle.price = price;
	}

	public static Object getBrand() {
		return brand;
	}

	public static void setBrand(Object brand) {
		MountainRacingCycle.brand = brand;
	}

	public static Object getNoOfGears() {
		return noOfGears;
	}

	public static void setNoOfGears(Object noOfGears) {
		MountainRacingCycle.noOfGears = noOfGears;
	}

	public static Object getSpeed() {
		return speed;
	}

	public static void setSpeed(Object speed) {
		MountainRacingCycle.speed = speed;
	}

	public boolean isGPS() {
		return GPS;
	}

	public void setGPS(boolean gPS) {
		GPS = gPS;
	}

	public String getLight() {
		return light;
	}

	public void setLight(String light) {
		this.light = light;
	}

	public String getSpeedBooster() {
		return speedBooster;
	}

	public void setSpeedBooster(String speedBooster) {
		this.speedBooster = speedBooster;
	}

	@Override
	public String toString() {
		return "MountainRacingCycle [GPS=" + GPS + ", light=" + light + ", speedBooster=" + speedBooster + "]";
	}

}
