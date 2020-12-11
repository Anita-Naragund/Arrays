package com.xworkz.data;

import com.xworkz.data.dto.MobileDTO;

public class MobileDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileDTO dto = new MobileDTO();
		System.out.println(dto.getCompanyName());
		System.out.println(dto.getColor());

		MobileDTO dto2 = new MobileDTO("OPPO", "BLUE", "V7.1", "Android", 22000, 8, 32);
		System.out.println(dto2.getCompanyName());
		System.out.println(dto2.getColor());
		System.out.println(dto2.getVersion());
		System.out.println(dto2.getOS());
		System.out.println(dto2.getPrice());
		System.out.println(dto2.getRAM());
		System.out.println(dto2.getROM());

	}

}
