package com.xworkz.carshowroom;

import com.xworkz.carshowroom.car.CarShowRoom;
import com.xworkz.carshowroom.carENUM.CarVarient;
import com.xworkz.carshowroom.dto.CarDTO;

public class TempTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarShowRoom cars = new CarShowRoom();
		CarDTO dto=new CarDTO();
		cars.addCars(dto);
		dto.setModel("Tesla");
		dto.setPrice(20000000.00d);
		dto.setVarient(CarVarient.TOP);
		System.out.println(dto.getModel());
		System.out.println(dto.getPrice());
		System.out.println(dto.getVarient());
		
		CarDTO dto1=new CarDTO("Maruti 800",300000d,CarVarient.BASE);
		System.out.println(dto1.getModel());
		System.out.println(dto1.getPrice());
		System.out.println(dto1.getVarient());
		
		CarDTO dto2=new CarDTO("Duster",3500000d,CarVarient.MIDDLE);
		System.out.println(dto2.getModel());
		System.out.println(dto2.getPrice());
		System.out.println(dto2.getVarient());
		
		CarDTO dto3=new CarDTO("Jeep",2500000d,CarVarient.BASE);
		System.out.println(dto3.getModel());
		System.out.println(dto3.getPrice());
		System.out.println(dto3.getVarient());
		
		CarDTO dto4=new CarDTO("Swift",600000d,CarVarient.TOP);
		System.out.println(dto4.getModel());
		System.out.println(dto4.getPrice());
		System.out.println(dto4.getVarient());
		
		CarDTO dto5=new CarDTO("BMW",30000000d,CarVarient.BASE);
		System.out.println(dto5.getModel());
		System.out.println(dto5.getPrice());
		System.out.println(dto5.getVarient());
		
		CarDTO dto6=new CarDTO("BMW",30000000d,CarVarient.BASE);
		System.out.println(dto6.getModel());
		System.out.println(dto6.getPrice());
		System.out.println(dto6.getVarient());
	
	}

}
