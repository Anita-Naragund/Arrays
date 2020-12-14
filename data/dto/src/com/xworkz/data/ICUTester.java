package com.xworkz.data;

import com.xworkz.data.dto.ICUAdmissionDTO;
import com.xworkz.data.hospital.ICU;

public class ICUTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoked main method");
		ICU icu = new ICU(true, 1000, false);
		icu.admission("Anu", "Fever", 22, "M B Patil");
		ICUAdmissionDTO admissionDTO = icu.getIcuAdmission();
		System.out.println(admissionDTO.getName());
		System.out.println(admissionDTO.getReason());
		System.out.println(admissionDTO.getAge());
		System.out.println(admissionDTO.getDoctor());
		
	}
}
