package com.xworkz.data.dto;

public class CompanyDTO {
	private String companyName;
	private String location;
	private int noOfEmployees;
	private String branch;
	private String nameOfCEO;
	private int startedYear;
	
	public CompanyDTO()
	{
		System.out.println("Created CompanyDTO");
	}
	
	public CompanyDTO(String companyName,String location) {
		System.out.println("Another CompanyDTO");
		this.companyName=companyName;
		this.location=location;
	}
	
	public CompanyDTO(String companyName,String location,int noOfEmployees,String branch,String nameOfCEO,int startedYear)
	{
		this.companyName=companyName;
		this.location=location;
		this.noOfEmployees=noOfEmployees;
		this.branch=branch;
		this.nameOfCEO=nameOfCEO;
		this.startedYear=startedYear;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getLocation() {
		return location;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public String getBranch() {
		return branch;
	}

	public String getNameOfCEO() {
		return nameOfCEO;
	}

	public int getStartedYear() {
		return startedYear;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setNameOfCEO(String nameOfCEO) {
		this.nameOfCEO = nameOfCEO;
	}

	public void setStartedYear(int startedYear) {
		this.startedYear = startedYear;
	}
	
}
