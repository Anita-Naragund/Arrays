package com.xworkz.sports;

import com.xworkz.sports.computer.Computer;

public class ComputerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer comp = new Computer();
		comp.computer("HP", "i3");
		comp.displayDetails();
		comp.computer(null, "i3");
		comp.displayDetails();

		comp.displayComputerDetails();

		comp.setRAM(1000);
		System.out.println(comp.getRAM());
	}
}
