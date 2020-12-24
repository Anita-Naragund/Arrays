package com.xworkz.sports.computer;

public class Laptop extends Computer {
	private String OS;
	private int charge;

	public boolean charging(int charge) {
		System.out.println("Invoked charging");
		if (charge < 9) {
			System.out.println("please conntect the charger");
		} else if (charge > 100) {
			System.out.println("Charge is full");
		}
		return true;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

}
