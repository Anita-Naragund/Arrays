package com.xworkz.resorts.dao;

import java.util.List;

import com.xworkz.resorts.dto.ResortDTO;

public interface ResortDAO {
	
boolean save(ResortDTO dto);
	
	boolean updateLocationByName(String location, String name);

	boolean updateLocationByNameandRating(String location, String name, float rating);

	boolean deleteByNameAndLocation(String name, String location);

	boolean addMultipleResorts(List<ResortDTO> dtos);

	int totalResortSize();

	List<ResortDTO> getAll();

}
