package com.xworkz.carshowroom.car;

import java.util.Arrays;

import com.xworkz.carshowroom.dto.CarDTO;
import com.xworkz.carshowroom.dto.ManagerDTO;

public class CarShowRoom {
	private String name;
	private long location;
	private ManagerDTO managerDTO;
	private CarDTO[] cars = new CarDTO[5];
	private int currentIndex = 0;

	public CarShowRoom() {
		super();
		System.out.println("Created default Constructor");
	}

	public CarShowRoom(String name, long location) {
		super();
		this.name = name;
		this.location = location;
	}

	public void addManager(String name, long contactNo) {
		if (name != null || contactNo > 0) {
			this.managerDTO = new ManagerDTO(name, contactNo);
			System.out.println("Manager added");
		} else {
			System.out.println("please provide proper details");
		}
	}

	public void displayManager() {
		if (this.managerDTO != null) {
			System.out.println("Name is" + this.managerDTO.getName());
			System.out.println("Contact number is " + this.managerDTO.getContactNo());
		} else {
			System.out.println("Value is Null");
		}
	}

	public void updateManager(long contactNo) {
		if (contactNo > 0) {
			this.managerDTO.setContactNo(contactNo);

		}
	}

	public void deleteManager() {
		this.managerDTO = null;
		System.out.println("Delete the values");
	}

	public void addCars(CarDTO dto) {
		if (dto != null && this.currentIndex < 5) {
			this.cars[currentIndex] = dto;
			currentIndex++;
			System.out.println("Add the cars");

		} else {

			System.out.println("Cannot add " + this.cars);
		}
	}
	}


