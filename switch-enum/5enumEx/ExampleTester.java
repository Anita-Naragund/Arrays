public class ExampleTester
{
	public static void main(String[] names)
	{
		System.out.println("Invoked main method");
		String bikeName="Apache";
		Bike convertedBikeIs=Bike.valueOf(bikeName);
		System.out.println(convertedBikeIs);
		Bike[] allBikes=Bike.values();
		System.out.println(allBikes.length);
		
		for(int bikesInitial=0;bikesInitial<allBikes.length;bikesInitial++)
		{
			System.out.println("index" +bikesInitial);
			Bike bikeValue=allBikes[bikesInitial];
			System.out.println("sports enum values"+bikeValue);
		}
		
		String carName="Duster";
		Car convertedCarIs=Car.valueOf(carName);
		System.out.println(convertedCarIs);
		Car[] allCars=Car.values();
		System.out.println(allCars.length);
		
		String theaterName="PVR";
		Theater convertedTheaterIs=Theater.valueOf(theaterName);
		System.out.println(convertedTheaterIs);		
		Theater[] allTheaters=Theater.values();
		System.out.println(allTheaters.length);
		
		String bankName="SBI";
		Bank convertedBankIs=Bank.valueOf(bankName);
		System.out.println(convertedBankIs);		
		Bank[] allBanks=Bank.values();
		System.out.println(allBanks.length);
		
		String phoneName="OPPO";
		Phone convertedPhoneIs=Phone.valueOf(phoneName);
		System.out.println(convertedPhoneIs);		
		Phone[] allPhones=Phone.values();
		System.out.println(allPhones.length);
	}
}