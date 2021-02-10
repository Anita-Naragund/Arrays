package com.xworkz.celebration;

import java.util.HashSet;
import java.util.Set;

public class TesterTrupti {
	
	public static void main(String[] args) {
		
		Set<String> favoritePlace=new HashSet<String>();
		favoritePlace.add("Paris");
		favoritePlace.add("Mauritius");
		favoritePlace.add(null);
		favoritePlace.add(null);
		favoritePlace.add("Bali");
		favoritePlace.add("Munnar");
		favoritePlace.add("La");
		favoritePlace.add("Aus");
		favoritePlace.add("Paris");
		favoritePlace.add("Tirupati");
		favoritePlace.add("Malasyia");
		favoritePlace.add("Shivamogga");
		favoritePlace.add("Goa");
		favoritePlace.add("Malasyia");
		
		System.out.println(favoritePlace.size());
		
		favoritePlace.forEach(a->System.out.println(a));
	}

}
