package com.xworkz.phonebook.dto;

public class PhoneBookDTO implements Cloneable{
	private String name;
	private String pincode;
	private long phoneNo;

	public PhoneBookDTO() {
		System.out.println("Created PhoneBookDTO");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "PhoneBookDTO [name=" + name + ", pincode=" + pincode + ", phoneNo=" + phoneNo + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Hashcode method");
		return 20;
	}
	
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(this==obj) {
				return true;
			}else {
				if(obj instanceof PhoneBookDTO) {
					return true;
				}
				return false;
			}
		}
		return false;
	}
	
@Override
public PhoneBookDTO clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	System.out.println("invoked clone");
	return (PhoneBookDTO)super.clone();
}

}
