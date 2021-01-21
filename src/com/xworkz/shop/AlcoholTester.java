package com.xworkz.shop;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.shop.dto.AlcoholDTO;

public class AlcoholTester {

	public static void main(String[] args) {
		
		AlcoholDTO alcoholDTO1=new AlcoholDTO("Magic moment","NA",8);
		
		AlcoholDTO alcoholDTO2=new AlcoholDTO("IB","Imperial",42);
		
		AlcoholDTO alcoholDTO3=new AlcoholDTO("Amstel","King Fisher",38);
		
		AlcoholDTO alcoholDTO4=new AlcoholDTO("Old Monk","NA",42);
		
		List<AlcoholDTO> alcoholDTOs=new ArrayList<AlcoholDTO>();
		alcoholDTOs.add(alcoholDTO1);
		alcoholDTOs.add(1, alcoholDTO2);
		alcoholDTOs.add(alcoholDTO3);
		alcoholDTOs.add(alcoholDTO4);
		
		alcoholDTOs.remove(1);
		//alcoholDTOs.remove(alcoholDTO3);
		
		AlcoholDTO alcoholDTO5=new AlcoholDTO("Bud Wiser","King Fisher",8);
		
		alcoholDTOs.add(3, alcoholDTO5);
		int lastIndex=alcoholDTOs.lastIndexOf(alcoholDTO4);
		System.out.println("last index is :"+lastIndex);
		for (AlcoholDTO alcoholDTO : alcoholDTOs) {
			System.out.println(alcoholDTO);
			
		}
		}

}
