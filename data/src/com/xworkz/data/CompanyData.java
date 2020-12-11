package com.xworkz.data;

import com.xworkz.data.dto.CompanyDTO;

public class CompanyData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyDTO company=new CompanyDTO();
		System.out.println(company.getCompanyName());
		company.setCompanyName("HCL");
		System.out.println(company.getCompanyName());
		
		CompanyDTO company1=new CompanyDTO("HCL","Bengalore");
		System.out.println(company1.getCompanyName());
		System.out.println(company1.getLocation());
		
		CompanyDTO company2=new CompanyDTO("HCL","Bengalore",150000,"India","C Vijayakumar",1976);
		System.out.println(company2.getCompanyName());
		System.out.println(company2.getBranch());
		System.out.println(company2.getLocation());
		System.out.println(company2.getNameOfCEO());
		System.out.println(company2.getNoOfEmployees());
		System.out.println(company2.getStartedYear());
	}
}
