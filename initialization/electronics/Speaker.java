package com.xworkz.initialization.electronics;

public class Speaker {
	private int batteryBackUpInHours;
	private String companyName="JBL";
	private String color;
	private boolean connected;
	private int minVolumeLevel=0;
	private int maxVolumeLevel=4;
	private int currentVolumeLevel=0;
	
	public Speaker(int batteryBackUpInHours,String color)
	{
		System.out.println("Created Speaker");
		this.batteryBackUpInHours=batteryBackUpInHours;
		this.color=color;
		System.out.println("args 0 :"+batteryBackUpInHours);
		System.out.println("args 1 :"+color);
	}
	
	public void onOrOff()
	{
		System.out.println("Speaker is :");
		if(this.connected==false)
		{
			this.connected=true;
			System.out.println("Speaker is on");
			return;
		}
		else if(this.connected==true) {
			this.connected=false;
			System.out.println("Speaker is Off");
		}
	}
	public void increaseVolume() {

		if(this.connected==true)
		{
			if (this.currentVolumeLevel < this.maxVolumeLevel) {
				this.currentVolumeLevel = this.currentVolumeLevel + 1;
				System.out.println("current volume is :" + this.currentVolumeLevel);
			} else {
				System.out.println("max volume reached");
			}	
		}
		else {
		System.out.println("JBL speaker is off");
		}		
	}
	
	
	public void decreaseVolume() {
		if(this.connected==true)
		{
			if(this.currentVolumeLevel>this.minVolumeLevel)
			{
				this.currentVolumeLevel=this.currentVolumeLevel-1;
				System.out.println("current volume is :"+this.currentVolumeLevel);
			}else {
				System.out.println("min volume is reached");
			}
		}
		else {
			System.out.println("JBL speaker is off");
		}
	}
	public int getBatteryBackUpInHours() {
		return batteryBackUpInHours;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getColor() {
		return color;
	}

	public boolean isConnected() {
		return connected;
	}

	public int getCurrentVolumeLevel() {
		return currentVolumeLevel;
	}
	
	

}
