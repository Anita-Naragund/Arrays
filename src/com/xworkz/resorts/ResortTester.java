package com.xworkz.resorts;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.resorts.dao.ResortDAO;
import com.xworkz.resorts.dao.ResortDAOImpl;
import com.xworkz.resorts.dto.ResortDTO;
import com.xworkz.resorts.service.ResortService;
import com.xworkz.resorts.service.ResortServiceImpl;

public class ResortTester {

		
		public static void main(String[] args) {
			List<ResortDTO> list = new LinkedList<ResortDTO>();
			
			ResortDAO dao=new ResortDAOImpl(list);
			ResortService resortService = new ResortServiceImpl(dao);
			
			
			ResortDTO dto=new ResortDTO("Ramanagar", "Shillandara", "Avn", 15);
			dto.setPricePerHead(1600);
			dto.setNoOfEmployees(15);
			dto.setOffers(false);
			dto.setPhoneNo(8745214521l);
			dto.setPoolExist(false);
	        dto.setRating(4);
			//dao.save(dto);
			
			resortService.validateAndSave(dto);
			
			ResortDTO dto2=new ResortDTO("Bengalore", "Prestige", "KiranRaj", 15);
			dto2.setPricePerHead(2000);
			dto2.setNoOfEmployees(12);
			dto2.setOffers(false);
			dto2.setPhoneNo(7896585412l);
			dto2.setPoolExist(false);
	        dto2.setRating(3);
	        System.out.println("*********************");
	        
	        resortService.validateAndSave(dto2);
	        
	        System.out.println("*********************");
	        
	        resortService.validateAndUpdateLocationByName("Hubli", "Prestige");
	        
	        System.out.println("*********************");
	        
	        resortService.validateAndUpdateLocationByNameandRating("Hydrabad", "Shillandara", 4);
	        
	        System.out.println("*********************");
	        
	        System.out.println(resortService.validateTotalResortSize());
	        
	        System.out.println("*********************");
	        
	        resortService.validatAndDeleteByNameAndLocation("Shillandara", "Hydrabad");
	        
	        System.out.println("*********************");
	        
	        System.out.println(resortService.validateTotalResortSize());
		

	}

}
