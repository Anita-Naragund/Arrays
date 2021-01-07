package com.xworkz.phonebook;

import com.xworkz.phonebook.dto.PhoneBookDTO;

public class PhoneBookTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		PhoneBookDTO bookDTO=new PhoneBookDTO();
		bookDTO.setName("Anita");
		bookDTO.setPhoneNo(5114751817l);
		bookDTO.setPincode("582205");
		
		PhoneBookDTO bookDTO2=bookDTO.clone();
		System.out.println(bookDTO2.getName()+"  "+bookDTO2.getPhoneNo()+"  "+bookDTO2.getPincode());
		
		

	}

}
