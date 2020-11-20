package com.xworkz.concepts;

import com.xworkz.concepts.obj.Vehicle;

public class ObjectTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.out.println("Invoked main method");
		
		Vehicle.yom="2020";
		Vehicle vehicle=new Vehicle();
		vehicle.displayInfo();
		vehicle.color="Black";
		vehicle.model="Saleno";
		vehicle.owner="Anita";
		vehicle.displayInfo();
		
		System.out.println("*********************");
		
		vehicle.color="Blue";
		vehicle.model="Rolls Royce";
		vehicle.owner="Avn";
		vehicle.displayInfo();

	}

}
