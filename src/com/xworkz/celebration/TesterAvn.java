package com.xworkz.celebration;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class TesterAvn {
	
	public static void main(String[] args) {
		Set<String> favoritePlaces=new HashSet<String>();
		
		favoritePlaces.add("Paris");
		favoritePlaces.add("Mauritius");
		favoritePlaces.add(null);
		favoritePlaces.add(null);
		favoritePlaces.add("Bali");
		
		System.out.println(favoritePlaces.size());
		favoritePlaces.forEach(a->System.out.println(a));
		
		System.out.println("*********************");
		
		favoritePlaces=new LinkedHashSet<String>();
		favoritePlaces.add("Mysore");
		favoritePlaces.add("Hampi");
		favoritePlaces.add("Badami");
		favoritePlaces.add("Bijapur");
		favoritePlaces.forEach(e->System.out.println(e));
	}

}
