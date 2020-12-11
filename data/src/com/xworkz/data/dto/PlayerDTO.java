package com.xworkz.data.dto;

public class PlayerDTO {
	private String name;
	private String company;
	private String[] sports;
	private String[] awards;
	
	public PlayerDTO()
	{
		System.out.println("Created PlayerDTO");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setSports(String[] sports) {
		this.sports = sports;
	}

	public void setAwards(String[] awards) {
		this.awards = awards;
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public String[] getSports() {
		return sports;
	}

	public String[] getAwards() {
		return awards;
	}

}
