package com.xworkz.cofeeday.applicances;

public class Power {
	private int voltage = 0;

	public Power() {
	}

	public boolean generatePower() {
		this.voltage = 200;
		return true;
	}
}
