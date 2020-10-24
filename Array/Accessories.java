public class Accessories
{
	public static void main(String[] accessories){
		System.out.println("Invoked main method");
		
		String country="India";
		countryName("USA");
		countryName(null);
		countryName(country);
	}
	public static void countryName(String name)
	{
		System.out.println("country name :"+name);
	}
}
