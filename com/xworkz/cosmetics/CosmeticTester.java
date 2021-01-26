package com.xworkz.cosmetics;

import com.xworkz.cosmetics.constants.Shades;
import com.xworkz.cosmetics.constants.Type;
import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dao.CosmeticDAOImpl;
import com.xworkz.cosmetics.dto.CosmeticDTO;

public class CosmeticTester {

	public static void main(String[] args) {
		
		CosmeticDTO dto=new CosmeticDTO("Lakme", Shades.PINK, Type.EYELINER, 250, 1);
		
		CosmeticDTO dto1=new CosmeticDTO("Maybelline", Shades.BLACK, Type.CONSEALER, 500, 1);
		
		CosmeticDTO dto2=new CosmeticDTO("Loreal", Shades.RED, Type.FOUNDATION, 500, 1);
		
		CosmeticDTO dto3=new CosmeticDTO("MAC", Shades.BLUE, Type.PRIMER, 500, 1);
		
		CosmeticDAO dao=new CosmeticDAOImpl();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		System.out.println("*********************");
		
		dao.findByBrand("Lakme");
		
		dao.updatePriceAndQuantityByBrand(350, 2, "Maybelline");
		System.out.println(dto1);
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&");
		
		dao.updatePriceByBrandAndType(900, "Maybelline", Type.CONSEALER);
		System.out.println(dto1);
		
		dao.updateTypeByBrand("MAYBE", Type.MASCARA);
		
		dao.totalSize();
		
		dao.deleteByBrand("Lakme");
		
		dao.totalSize();
		dao.deleteAll();
		dao.totalSize();
		
	}
}
