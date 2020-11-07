public class CountryTester
{
	public static void main(String[] value)
	{
		System.out.println("Invoked main");
		
		byte number=Country.numberOfStates;
		System.out.println("number of states is :"+number);
		
		number=31;
		System.out.println("number of states is :"+number);
		
		String cName=Country.CountryName;
		System.out.println("number of states is :"+cName);
		
		cName="USA";
		System.out.println("number of states is :"+cName);
		
		String language=Country.nationalLanguage;
		System.out.println("number of states is :"+language);
		
		String currencyIs=Country.currency;
		System.out.println("number of states is :"+currencyIs);
		
		currencyIs="Dollars";
		System.out.println("number of states is :"+currencyIs);
		
		long countryPopulation=Country.population;
		System.out.println("number of states is :"+countryPopulation);
	}
}