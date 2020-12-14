package com.xworkz.data;

import com.xworkz.data.dto.AppointmentDTO;
import com.xworkz.data.hospital.Hospital;

public class HospitalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoked main");
		Hospital hospital=new Hospital("Suguna","RajajiNagar");
		hospital.appointment("Anu", 7896541236l, "fever", 22, "Patil");
		
		AppointmentDTO aapointment=hospital.getAppointmentDTO();
		System.out.println(aapointment.getName());
		System.out.println(aapointment.getAge());
		System.out.println(aapointment.getDoctorName());
		System.out.println(aapointment.getMobile());
		

	}

}
