package com.xworkz.inheritance;

import com.xworkz.inheritance.dto.PolicaStationDTO;

public class StationTester {

	public static void main(String[] args) {

		Object dto = new PolicaStationDTO("RajajiNagar", 10, "Rajajinagar police station");

		System.out.println(dto);
		System.out.println(dto.toString());

		System.out.println(dto.hashCode());

		PolicaStationDTO dto1 = new PolicaStationDTO("RajajiNagar", 10, "Rajajinagar police station");
		System.out.println(dto1.hashCode());

		PolicaStationDTO dto2 = new PolicaStationDTO("UpparPet", 6, "Upparpet Police Station");

		PolicaStationDTO dto3 = new PolicaStationDTO("Kalisipalya", 8, "Kalasipalya Police Station");
		
		dto3=new PolicaStationDTO("UpparPet", 6, "Upparpet Police Station");
		dto1 = dto2;
		boolean equal = dto1.equals(dto3);
		if (equal) {
			System.out.println("dto is equal");
		} else {
			System.out.println("dto is not equal");
		}
		System.out.println(equal);
	}

}
