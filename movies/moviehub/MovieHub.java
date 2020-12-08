package com.xworkz.movies.moviehub;

import java.util.Arrays;

public class MovieHub {
	private String theaterName;
	private int totalTickets;
	private String[] movieNames;
	private double ticketPrice = 100;
	private int totalSnacks=1500;
	private int sancksPrice=50;
	private String[] snacksList= {"Samosa","Pop corn","Chips","Cool Drinks","Nachos","Fryms"};

	public MovieHub(String theaterName, int totalTickets, String[] movieNames) {
		System.out.println("Create and Initialize movieHub*********************");
		System.out.println("args 0 " + theaterName);
		System.out.println("args 1 " + totalTickets);
		System.out.println("args 2 " + Arrays.deepToString(movieNames));
		this.theaterName = theaterName;
		this.totalTickets = totalTickets;
		this.movieNames = movieNames;
		System.out.println("Created and Init movieHub**************************");
	}

	public double bookTicketsAndGetTotalPrice(String movieNames, int noOfTickets, String bookedBy) {
		double totalPrice = 0;
		System.out.println("Invoked bookTickets");
		System.out.println("args 0 " + movieNames);
		System.out.println("args 1 " + noOfTickets);
		System.out.println("args 2 " + bookedBy);
		for (int t = 0; t < this.movieNames.length; t++) {
			String movie = this.movieNames[t];
			System.out.println("Comparing " + movie + "with " + movieNames);
			if (movieNames.equals(movie)) {
				System.out.println("Movie is found ,can book ticket");
				System.out.println("total tickets");
				if (noOfTickets <= totalTickets) {
					System.out.println("Tickets are availabel you can book");
					this.totalTickets = this.totalTickets - noOfTickets;
					System.out.println("After booking total tickets available are " + totalTickets);
					totalPrice = ticketPrice * noOfTickets;
					System.out.println("Total price of tickets is " + totalPrice);
				} else {
					System.out.println("Istu tickets illa bere kade hogi");
				}
			} else {
				System.out.println("movie is not found");
			}
			break;

		}
		return totalPrice;
	}
	
	public double buySnacks(String nameOfSnacks,int quantity,boolean selfService,String seatNo)
	{
		double totalPrice=0;
		System.out.println("Invoked buySnacks");
		System.out.println("args 0 :"+nameOfSnacks);
		System.out.println("args 1 :"+quantity);
		System.out.println("args 2 :"+selfService);
		System.out.println("args 3 :"+seatNo);
		for(int s=0;s<this.snacksList.length;s++)
		{
			System.out.println("snacks "+snacksList[s]);
			String list=snacksList[s];
			if(list.equals(nameOfSnacks)) {
				System.out.println("Snacks is available");
				if(quantity<=this.totalSnacks)
				{
					System.out.println("Snacks quantity available");
					totalSnacks=totalSnacks-quantity;
					System.out.println("total snacks available :"+totalSnacks);
					totalPrice=quantity*sancksPrice;
					System.out.println("total price is :"+totalPrice);
				}else {
					System.out.println("snacks not available");
				}
				break;
			}
			else {
				System.out.println("Snacks quantity is not available");
			}
		}
		return totalPrice;
		
	}

	public String getTheaterName() {
		return theaterName;
	}

	public int getTotalTickets() {
		return totalTickets;
	}

	public String[] getMovieName() {
		return movieNames;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}
	public String[] getSnacksList() {
		return snacksList;
	}

}
