package com.xworkz.data.dto;

public class AppointmentDTO {
	private String name;
	private long mobile;
	private String reason;
	private int age;
	private String doctorName;
	

	public AppointmentDTO(String name, long mobile, String reason, int age, String doctorName) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.reason = reason;
		this.age = age;
		this.doctorName = doctorName;
	}


	public String getName() {
		return name;
	}


	public long getMobile() {
		return mobile;
	}


	public String getReason() {
		return reason;
	}


	public int getAge() {
		return age;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	

}
