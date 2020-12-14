package com.xworkz.data.hospital;

import com.xworkz.data.dto.ICUAdmissionDTO;

public class ICU {
	private boolean ventilatorAvailable;
	private double price;
	private boolean tvAvailable;
	private ICUAdmissionDTO icuAdmission;

	public ICU(boolean ventilatorAvailable, double price, boolean tvAvailable) {
		super();
		this.ventilatorAvailable = ventilatorAvailable;
		this.price = price;
		this.tvAvailable = tvAvailable;
	}

	public void admission(String name, String reason, int age, String doctor) {
		if (name != null && reason != null && age > 0 && doctor != null)
		{
			System.out.println("Created appointment");
		this.icuAdmission = new ICUAdmissionDTO(name, reason, age, doctor);
		}else {
			System.out.println("Values may not be null");
		}
	}
	
	public void updateAdmission(String name)
	{
		System.out.println();
	}

	public ICUAdmissionDTO getIcuAdmission() {
		return icuAdmission;
	}

	public void setIcuAdmission(ICUAdmissionDTO icuAdmission) {
		this.icuAdmission = icuAdmission;
	}

}
