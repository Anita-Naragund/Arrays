package com.xworkz.cosmetics.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.cosmetics.constants.Type;
import com.xworkz.cosmetics.dto.CosmeticDTO;

public class CosmeticDAOImpl implements CosmeticDAO {
	List<CosmeticDTO> cosmeticDto = new ArrayList<CosmeticDTO>();

	@Override
	public boolean save(CosmeticDTO dto) {
		System.out.println("Invoked save");
		System.out.println("dto :" + dto);
		boolean saved = false;
		boolean contains = this.cosmeticDto.contains(dto);
		if (!contains) {
			saved = this.cosmeticDto.add(dto);
		}
		if (saved)
			System.out.println("Cosmetic is added");
		else
			System.out.println("Cosmetic is not added");
		return saved;

	}

	@Override
	public CosmeticDTO findByBrand(String brand) {
		System.out.println("Brand name :" + brand);
		for (CosmeticDTO cosmeticDTO : cosmeticDto) {
			String brandName = cosmeticDTO.getBrand();
			if (brandName.equals(brand)) {
				System.out.println("Cosmetic is found");
				return cosmeticDTO;
			}
		}
		return null;
	}

	
	@Override
	public CosmeticDTO findByBrandAndTyp(String brand, Type type) {
		for (CosmeticDTO cosmeticDTO2 : cosmeticDto) {
			String brandName = cosmeticDTO2.getBrand();
			Type typeOfBrand=cosmeticDTO2.getType();
			if (brandName.equals(brand) && typeOfBrand.equals(type)) {
				System.out.println("Cosmetic is found");
				return cosmeticDTO2;
			}

		}
		return null;
	}
	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		System.out.println("Invoked updatePriceAndQuantityByBrand");
		System.out.println("price is :" + price);
		System.out.println("quantity is :" + quantity);
		System.out.println("brand is :" + brand);
		CosmeticDTO cosmeticDTO = this.findByBrand(brand);
		if (cosmeticDTO != null) {
			System.out.println("can found,you can update the cosmetic");
			cosmeticDTO.setBrand(brand);
			cosmeticDTO.setPrice(price);
			cosmeticDTO.setQuantity(quantity);
		} else {
			System.out.println("Cannot found the brand");
		}
		return false;
	}

	@Override
	public boolean updatePriceByBrandAndType(double price, String brand, Type type) {
		System.out.println("Invoked updatePriceByBrandAndType");
		System.out.println("Price is :" + price);
		System.out.println("brand is :" + brand);
		System.out.println("type is :" + type);
		CosmeticDTO dto = this. findByBrandAndTyp(brand, type);
		if (dto != null) {
			System.out.println("brand sikkide nivu update madabahudu");
			dto.setPrice(price);
			dto.setType(type);
			dto.setBrand(brand);
		} else {
			System.out.println("Ee brand illi sigalla");
		}
		return false;
	}

	@Override
	public boolean updateTypeByBrand(String brand, Type type) {
		System.out.println("Invoked updateTypeByBrand");
		System.out.println("brand is :" + brand);
		System.out.println("type is :" + type);
		CosmeticDTO dto = this.findByBrand(brand);
		if (dto != null) {
			System.out.println("brand name is found, update the type");
			dto.setType(type);
		} else {
			System.out.println("This brand is not found here :" + brand);
		}
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		CosmeticDTO dtoOfCosmetic=this.findByBrand(brand);
		if(dtoOfCosmetic!=null) {
			boolean removed=cosmeticDto.remove(dtoOfCosmetic);
			System.out.println(removed);
		}
		return false;
	}

	@Override
	public void deleteAll() {
		boolean delete=cosmeticDto.removeAll(cosmeticDto);
		System.out.println(delete);

	}

	@Override
	public List<CosmeticDTO> getAll() {
		//CosmeticDAO dao=new CosmeticDAOImpl();
		//cosmeticDto=dao.getAll();
		//System.out.println(cosmeticDto);
		return null;
	}

	@Override
	public int totalSize() {
		int sizeOfDTO=cosmeticDto.size();
		System.out.println(sizeOfDTO);
		return 0;
	}

}
