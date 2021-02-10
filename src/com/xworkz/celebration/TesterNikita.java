package com.xworkz.celebration;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.celebration.dto.FreedomFighterDTO;
import com.xworkz.celebration.dto.FreedomFighterDTO.Gender;

public class TesterNikita {
	
	public static void main(String[] args) {
		
		FreedomFighterDTO dto1=new FreedomFighterDTO("Bhagat singh", "India", Gender.MALE);
		
		FreedomFighterDTO dto2=new FreedomFighterDTO("KRC", "India", Gender.FEMALE);
		
		FreedomFighterDTO dto3=new FreedomFighterDTO("OO", "India", Gender.FEMALE);
		
		FreedomFighterDTO dto4=new FreedomFighterDTO("SBC", "India", Gender.MALE);
		
		FreedomFighterDTO dto5=new FreedomFighterDTO("OO", "India", Gender.FEMALE);
		
		Set<FreedomFighterDTO> dtos=new HashSet<FreedomFighterDTO>();
		dtos.add(dto1);
		dtos.add(dto2);
		dtos.add(dto3);
		dtos.add(dto4);
		dtos.add(dto5);
		
		System.out.println(dtos.size());
		dtos.forEach(f->System.out.println(f.getName()));
	}

}
