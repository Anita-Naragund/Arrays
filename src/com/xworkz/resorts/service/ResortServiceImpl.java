package com.xworkz.resorts.service;

import com.xworkz.resorts.dao.ResortDAO;

import com.xworkz.resorts.dto.ResortDTO;

public class ResortServiceImpl implements ResortService {

	private ResortDAO resortDao;
	String specialChar = "^[<>'\"/;`%]*$";
	String phone = "(0/91)?[7-9][0-9]{9}";

	public ResortServiceImpl(ResortDAO resortDAO) {
		System.out.println("invoked ResortServiceImpl");
		this.resortDao = resortDAO;
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		boolean validData = false;
		if (dto != null) {
			System.out.println("dto is not null,can save fields");
			String location = dto.getLocation();
			CharSequence specialChar = "@#$%^&!*";
			if (location != null && location.length() >= 3 && location.length() <= 15 && !location.isEmpty()
					&& !location.contains(" ") && !location.contains(specialChar)) {
				System.out.println("location is valid");
				validData = true;
			} else {
				System.out.println("location is not valid");
				validData = false;
			}
			if (validData) {
				String name = dto.getName();
				if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty()
						&& !name.contains(" ")) {
					System.out.println("name is valid");
					validData = true;
				} else {
					System.out.println("name is invalid");
					validData = false;
				}
			}
			if (validData) {
				double pricePerHead = dto.getPricePerHead();
				if (pricePerHead >= 999 && pricePerHead <= 2500) {
					System.out.println("pricePerHead is valid");
					validData = true;
				} else {
					System.out.println("pricePerHead is invalid");
					validData = false;
				}
			}
			if (validData) {
				float rating = dto.getRating();
				if (rating >= 0 && rating <= 5) {
					System.out.println("rating is valid");
					validData = true;
				} else {
					System.out.println("rating is invalid");
					validData = false;
				}
			}
			if (validData) {
				long phoneNumber = dto.getPhoneNo();
				if (phoneNumber > 7000000000l && phoneNumber <= 10000000000l) {
					System.out.println("phone number is valid");
					validData = true;
				} else {
					System.out.println("phone number is invalid");
					validData = false;
				}
			}
			if (validData) {
				String managerName = dto.getManagerName();
				if (managerName != null && managerName.length() >= 3 && managerName.length() <= 12
						&& !managerName.isEmpty() && !managerName.contains(" ")) {
					System.out.println("manager name is valid");
					validData = true;
				} else {
					System.out.println("manager name is invalid");
					validData = false;
				}
			}
			if (validData) {
				int numberOfEmployee = dto.getNoOfEmployees();
				if (numberOfEmployee >= 5 && numberOfEmployee <= 25) {
					System.out.println("number of employee is valid");
					validData = true;
				} else {
					System.out.println("number of employee is invalid");
					validData = false;
				}
			}
			if (validData) {
				boolean poolExist = dto.isPoolExist();
				if (poolExist == false) {
					System.out.println("pool is not exist");
					validData = true;
				} else {
					System.out.println("pool is exist");
					validData = false;
				}
			}
			if (validData) {
				System.out.println("All data is valid,you can add the fields");
				this.resortDao.save(dto);
			}
		} else {
			System.out.println("dto is null,you can not save fields");
		}
		return false;
	}

	@Override
	public boolean validateAndUpdateLocationByName(String location, String name) {
		System.out.println("invoked validateAndUpdateLocationByName");
		if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty() && !name.contains(" ")
				&& location != null && location.length() >= 3 && location.length() <= 15 && !location.isEmpty()
				&& !location.contains(" ") && !location.contains(specialChar)) {
			this.resortDao.updateLocationByName(location, name);
			return true;
		} else {
			System.out.println("name and location are not valid");
		}

		return false;
	}

	@Override
	public boolean validateAndUpdateLocationByNameandRating(String location, String name, float rating) {
		System.out.println("invoked validateAndUpdateLocationByNameandRating");
		if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty() && !name.contains(" ")
				&& location != null && location.length() >= 3 && location.length() <= 15 && !location.isEmpty()
				&& !location.contains(" ") && !location.contains(specialChar) && rating >= 0 && rating <= 5) {
			this.resortDao.updateLocationByNameandRating(location, name, rating);
			return true;
		}
		return false;
	}

	@Override
	public boolean validatAndDeleteByNameAndLocation(String name, String location) {
		System.out.println("invoked validatAndDeleteByNameAndLocation");
		if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty() && !name.contains(" ")
				&& location != null && location.length() >= 3 && location.length() <= 15 && !location.isEmpty()
				&& !location.contains(" ") && !location.contains(specialChar)) {
			this.resortDao.deleteByNameAndLocation(name, location);
			return true;
		} else {
			System.out.println("name and location are not valid");
		}
		return false;
	}

	@Override
	public int validateTotalResortSize() {
		return this.resortDao.totalResortSize();
	}

}
