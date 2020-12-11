package com.xworkz.data;

import com.xworkz.data.dto.CustomerDTO;

public class CustomerDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerID(5896);
		System.out.println(customerDTO.getCustomerID());
		customerDTO.setCustomerName("Anita");
		System.out.println(customerDTO.getCustomerName());
		customerDTO.setMobileNo(7896542315l);
		System.out.println(customerDTO.getMobileNo());
		customerDTO.setEmail("anitavn022@gmail.com");
		System.out.println(customerDTO.getEmail());

	}
}
