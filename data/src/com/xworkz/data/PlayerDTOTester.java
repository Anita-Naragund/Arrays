package com.xworkz.data;

import com.xworkz.data.dto.PlayerDTO;

public class PlayerDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] awards = { "Padma shri", "ICC ODI Team of the year", "Sir Garfield sobers trophy",
				"Rajiv Ghandi Kel Rathna", "Arjun award for cricket", "Wisden Leading Cricketer in the world" };

		PlayerDTO playerDTO = new PlayerDTO();

		playerDTO.setName("Virat Kohli");
		System.out.println(playerDTO.getName());

		playerDTO.setCompany("Indian Cricket Team");
		System.out.println(playerDTO.getCompany());

		playerDTO.setAwards(awards);
		System.out.println(playerDTO.getAwards());

		String[] sports = new String[2];
		sports[0] = "Indian Cricket Team";
		playerDTO.setSports(sports);
		System.out.println(playerDTO.getSports());

	}

}
