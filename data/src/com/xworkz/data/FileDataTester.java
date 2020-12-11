package com.xworkz.data;

import java.util.Date;

import com.xworkz.data.dto.FileDTO;

public class FileDataTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileDTO dto = new FileDTO();
		System.out.println(dto.getName());
		System.out.println(dto.getCreatedDate());

		dto = new FileDTO("data", 158.2);
		System.out.println(dto.getName());
		System.out.println(dto.getSize());
		System.out.println(dto.getCreatedDate());

		Date currentDate = new Date();
		dto.setCreatedDate(currentDate);
		System.out.println(dto.getCreatedDate());

		dto.setLocation("C://images");
		dto.setType("jpg");

		Date date = new Date();
		FileDTO dto2 = new FileDTO("CleverIdiot", 145.00, "jpg", "C://images", date);
		System.out.println(dto2.getName());
		System.out.println(dto2.getSize());
		System.out.println(dto2.getLocation());
		System.out.println(dto2.getType());
		System.out.println(date);

	}

}
