package com.xworkz.data.dto;

public class ICUAdmissionDTO {
	private String name;
	private String reason;
	private int age;
	private String doctor;

	public ICUAdmissionDTO(String name, String reason, int age, String doctor) {
		super();
		this.name = name;
		this.reason = reason;
		this.age = age;
		this.doctor = doctor;
	}

	public String getName() {
		return name;
	}

	public String getReason() {
		return reason;
	}

	public int getAge() {
		return age;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
}
