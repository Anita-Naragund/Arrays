package com.xworkz.data.dto;

import java.util.Date;

public class FileDTO {
	private String name;
	private double size;
	private String type;
	private String location;
	private Date createdDate;

	public FileDTO() {
		System.out.println("Created FileDTO");
	}

	public FileDTO(String name, double size) {
		System.out.println("Dublicate FileDTO");
		this.name = name;
		this.size = size;
	}

	public FileDTO(String name, double size, String type, String location, Date createdDate) {
		System.out.println("***********");
		this.name = name;
		this.size = size;
		this.type = type;
		this.location = location;
		this.createdDate = createdDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getName() {
		return name;
	}

	public double getSize() {
		return size;
	}

	public String getType() {
		return type;
	}

	public String getLocation() {
		return location;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

}
