package com.xworkz.carshowroom;

import com.xworkz.carshowroom.car.CarShowRoom;

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoked main method");
		CarShowRoom showRoom = new CarShowRoom();
		showRoom.addManager("Raju",7896541231l);
		showRoom.displayManager();
		showRoom.addManager(null, 0);
		showRoom.displayManager();

	}

}
