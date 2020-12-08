package com.xworkz.movies;

import com.xworkz.movies.moviehub.MovieHub;

public class SnacksTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] movieNames = { "PK", "KGF", "Shivam", "Zodiac", "Avengures", "Jentelman", "Chennie express",
				"Departed", "Inception", "Interstella" };
		
		MovieHub movieHub=new MovieHub("PVR",6,movieNames);
				double price=movieHub.buySnacks("Chips",5,true,null);
				System.out.println("cost of snacks "+price);
				String[] snacks=movieHub.getSnacksList();
				for(int s=0;s<snacks.length;s++) {
					System.out.println(snacks[s]);
				}
	}

}
