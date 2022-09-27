package com.demo;

public class EnumSwitch {
	enum Directions {
		NORTH, SOUTH, EAST, WEST
	};

	public static void main(String[] args) {

		Directions dir = Directions.EAST;

		switch (dir) {

		case NORTH -> System.out.println("North Direction");
		case SOUTH -> System.out.println("South Direction");
		case EAST -> System.out.println("East Direction");
		case WEST -> System.out.println("West Direction");
		default -> System.out.println("No Direction");
		}
	}
}