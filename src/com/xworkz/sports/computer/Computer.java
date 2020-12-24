package com.xworkz.sports.computer;

public class Computer {
	private String companyName;
	private int RAM;
	private String core;

	/**
	 * In this method we are assigning the values of parameters
	 * 
	 * @param companyName
	 * @param core
	 */
	public void computer(String companyName, String core) {
		System.out.println("Invoked Computer");
		System.out.println("args 1 :" + companyName);
		System.out.println("args 2 :" + core);
		this.companyName = companyName;
		this.core = core;
	}

	/**
	 * Here we are doing validation If the companyName is not null then only it will
	 * display the details of computer
	 */
	public void displayDetails() {
		System.out.println("Invoked display");
		if (this.companyName != null) {
			System.out.println("Details of" + companyName + "is available");
		} else {
			System.out.println("Details of computer is not available");
		}
	}

	public void displayComputerDetails() {
		this.computer(companyName, core);
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}
}
