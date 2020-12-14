package com.xworkz.data.hospital;

import com.xworkz.data.dto.AppointmentDTO;

public class Hospital {
	private String name;
	private String location;
	private int appointmentSlot = 4;
	private AppointmentDTO appointmentDTO;

	public Hospital(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public void appointment(String patientName, long mobileNo, String reason, int age, String doctorName) {
		System.out.println("Created appointment");
		this.appointmentDTO = new AppointmentDTO(name, mobileNo, reason, age, doctorName);

	}

	public AppointmentDTO getAppointmentDTO() {
		return appointmentDTO;
	}

	public void setAppointmentDTO(AppointmentDTO appointmentDTO) {
		this.appointmentDTO = appointmentDTO;
	}

}
