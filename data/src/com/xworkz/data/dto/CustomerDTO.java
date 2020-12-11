package com.xworkz.data.dto;

public class CustomerDTO {
	private int customerID;
	private String customerName;
	private long mobileNo;
	private String email;

	public CustomerDTO() {
		System.out.println("Created DTO");
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public String getEmail() {
		return email;
	}
}