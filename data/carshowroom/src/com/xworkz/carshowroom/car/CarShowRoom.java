package com.xworkz.carshowroom.car;

import com.xworkz.carshowroom.dto.ManagerDTO;

public class CarShowRoom {
	private String name;
	private long location;
	private ManagerDTO managerDTO;

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
			System.out.println("Manager added");
			this.managerDTO = new ManagerDTO(name, contactNo);
		} else {
			System.out.println("please provide proper details");
		}
	}

	public void displayManager() {
		if(this.managerDTO!=null)
		{
		System.out.println("Name is" +this.managerDTO.getName());
		System.out.println("Contact number is "+this.managerDTO.getContactNo());
		}else {
			System.out.println("Value is Null");
		}
	}
	
	public void deleteManager()
	{
		if(this.managerDTO==null) {
			System.out.println("Delete the values");
		}
		
	}
	
	public void updateManager(long contactNo) {
		if(this.managerDTO!=null) {
		}
		}
	}
}
