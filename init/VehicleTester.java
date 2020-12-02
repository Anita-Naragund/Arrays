package com.xworkz.constructor.init;
import com.xworkz.constructor.init.vehicle.Vehicle1;

public class VehicleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoked main");
		Vehicle1 vehicle1=new Vehicle1("Yamaha","5Nov2019",4419);
		String companyName=vehicle1.getCompany();
		String date=vehicle1.getMfgDate();
		int no=vehicle1.getChasisNo();
		
		System.out.println(companyName);
		System.out.println(date);
		System.out.println(no);
		
		String color="Black";
		vehicle1.setColor(color);
		
		String owner="Vijay";
		vehicle1.setOwnerName(owner);

	}

}
