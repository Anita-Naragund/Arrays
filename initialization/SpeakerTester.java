package com.xworkz.initialization;

import com.xworkz.initialization.electronics.Speaker;

public class SpeakerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoked main method");
		Speaker speaker=new Speaker(10,"Red");
		System.out.println(speaker.getCompanyName());
		
		speaker.onOrOff();
		System.out.println(speaker.isConnected());
		
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		
		
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		
	}

}
