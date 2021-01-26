package com.xworkz.cosmetics.dao;

import java.util.List;

import com.xworkz.cosmetics.constants.Type;
import com.xworkz.cosmetics.dto.CosmeticDTO;

public interface CosmeticDAO {

	boolean save(CosmeticDTO dto);
	
	CosmeticDTO findByBrand(String brand);
	
	CosmeticDTO findByBrandAndTyp(String brand,Type type);
	
	boolean updatePriceAndQuantityByBrand(double price,int quantity,String brand);
	
	boolean updatePriceByBrandAndType(double price,String brand,Type type);
	
	boolean updateTypeByBrand(String brand,Type type);
	
	boolean deleteByBrand(String brand);
	
	void deleteAll();
	
	List<CosmeticDTO> getAll();
	
	int totalSize();
}
