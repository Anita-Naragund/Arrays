package com.xworkz.beach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.xworkz.beach.dto.BeachDTO;
import com.xworkz.beach.sort.BeachNoOfResortsComparator;

public class BeachTester {

	public static void main(String[] args) {
		
		BeachDTO beachDTO=new BeachDTO("om", 45, 8);
		
		BeachDTO beachDTO2=new BeachDTO("Juhu", 32, 5);
		
		BeachDTO beachDTO3=new BeachDTO("Marine", 52, 2);
		
		BeachDTO beachDTO4=new BeachDTO("Malpe", 6, 1);
		
		List<BeachDTO> beachDTOs=new ArrayList<BeachDTO>();
		beachDTOs.add(beachDTO);
		beachDTOs.add(beachDTO2);
		beachDTOs.add(beachDTO3);
		beachDTOs.add(beachDTO4);
		
		for (BeachDTO dto : beachDTOs) {
			System.out.println(dto);
		}
		
		BeachNoOfResortsComparator comparator=new BeachNoOfResortsComparator();
		Collections.sort(beachDTOs,comparator);
		
		System.out.println("After sorting");
		for (BeachDTO beachDTO5 : beachDTOs) {
			System.out.println(beachDTO5);
		}
	}
}
