package com.xworkz.movies;

import java.util.Arrays;

import com.xworkz.movies.moviehub.MovieHub;

public class TheaterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoke main method");
		String[] movieNames = { "PK", "KGF", "Shivam", "Zodiac", "Avengures", "Jentelman", "Chennie express",
				"Departed", "Inception", "Interstella" };
		MovieHub movieHub=new MovieHub("Navaranga",500,movieNames);
		System.out.println(movieHub.getTheaterName());
		System.out.println(movieHub.getTotalTickets());
		String convertedMovieName=Arrays.toString(movieHub.getMovieName());
		System.out.println(convertedMovieName);
		System.out.println(movieHub.bookTicketsAndGetTotalPrice("PK", 5, "Anita"));
	}

}
