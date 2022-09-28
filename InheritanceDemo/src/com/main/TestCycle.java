package com.main;

import com.inherit.ElectricCycle;
import com.inherit.MountainCycle;
import com.inherit.MountainRacingCycle;

public class TestCycle {
	public static void main(String... args) {
		MountainCycle cycle1 = new MountainCycle();
		System.out.println(cycle1);

		MountainCycle cycle2 = new MountainCycle("MRF", 3, 24000.00, "Heroes");
		System.out.println(cycle2);
		System.out.println();

		MountainRacingCycle cycle3 = new MountainRacingCycle("MAXXIS", 3, 56000.00, "AVON", 6, 40, true, "LED", "NOS");
		System.out.println(cycle3);
		System.out.println();

		ElectricCycle ecycle1 = new ElectricCycle("Rim wheels", 2, 25000.50, "Avon", "Lithium", cycle1);
		System.out.println(ecycle1);
	}

}
