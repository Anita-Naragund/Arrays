package com.xworkz.shop.temp;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.shop.dto.MovieDTO;

public class TempTester {

	public static void main(String[] args) {
		MovieDTO dto1 =new MovieDTO("KGF2", 5, 3,"Action");
		MovieDTO dto2=new MovieDTO("om", 2.2, 5, "Drama");
		MovieDTO dto3=new MovieDTO("om1", 5.4, 5, "Drama");
		
		List<MovieDTO> movieDTOs=new ArrayList();
		movieDTOs.add(dto1);
		movieDTOs.add(dto2);
		movieDTOs.add(dto3);
		ListIterator<MovieDTO> iterator=movieDTOs.listIterator(2);
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		movieDTOs.set(1,dto3);
		System.out.println(movieDTOs);
		
		System.out.println(movieDTOs.indexOf(dto3));
		



	}

}
