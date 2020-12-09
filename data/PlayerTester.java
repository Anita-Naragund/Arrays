package com.xworkz.data;

import java.util.Arrays;

import com.xworkz.data.dto.Player;

public class PlayerTester {
	public static void main(String[] args) {
		String[] awards = { "Padma shri", "ICC ODI Team of the year", "Sir Garfield sobers trophy",
				"Rajiv Ghandi Kel Rathna", "Arjun award for cricket", "Wisden Leading Cricketer in the world" };
		String[] sports= {"Cricket"};
		Player player=new Player();
		player.setName("Virat Kohli");
		System.out.println(player.getName());
		
		player.setCompany("Indian Cricket Team");
		System.out.println(player.getCompany());
	
		
		player.setAwards(awards);
		String convertedAwards=Arrays.toString(player.getAwards());
		System.out.println(convertedAwards);
		
		player.setSports(sports);
		String convertedSports=Arrays.toString(player.getSports());
		System.out.println(convertedSports);
		
	}

}
