package com.xworkz.data;

import com.xworkz.data.dto.CountryDTO;

public class CountryDataTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] state = { "Karnataka", "AndraPradesh", "Tamilnadu", "Kerala", "West Bengal", "Maharastra", "Bihar",
				"Uttar Pradesh", "Punjab", "Jammu and Kashmir", "Rajastan", "Gujarath", "Odisha", "Haryana",
				"Telangana", "Assam", "Madhya Pradesh", "Goa", "Jharkhand", "Himachal Pradesh", "Uttarakhanda",
				"Manipur", "Nagaland", "Arunachal Pradesh", "Chhattisgarh", "Sikkim", "Tripura", "Megalaya",
				"Mizoram" };
		System.out.println(state.length);

		String[] language = { "Kannada", "Telugu", "Tamil", "English", "Hindi", "Assamese", "Konkani", "Gujarathi",
				"Malayalam", "Marati", "Mietie", "Mizo", "Odia", "Punjabi", "Bengali" };
		CountryDTO countryData = new CountryDTO();
		System.out.println(countryData.getCountryName());

		countryData.setCountryName("India");
		System.out.println(countryData.getCountryName());

		System.out.println(countryData.getStates());

		CountryDTO data = new CountryDTO("India", "Asia");
		System.out.println(data.getCountryName());
		System.out.println(data.getContinent());
		data.setCountryName("Shrilanka");
		System.out.println(data.getCountryName());

		CountryDTO data2 = new CountryDTO(state, language);
		System.out.println(data2.getStates());
		System.out.println(data2.getLanguages());
		String arrayAtIndex1 = state[1];
		System.out.println(arrayAtIndex1);

		CountryDTO data3 = new CountryDTO(1380004385l, "Narendra Modhi", "Ram Nath Kovind");
		System.out.println(data3.getPopulation());
		System.out.println(data3.getPrimeMinister());
		System.out.println(data3.getPresident());

		System.out.println("*************");

		CountryDTO data4 = new CountryDTO("India", "Asia", state, 1380004385l, "Narendra Modhi", "Ram Nath Kovind",
				language);
		System.out.println(data4.getCountryName());
		System.out.println(data4.getContinent());
		System.out.println(data4.getStates());
		System.out.println(data4.getPopulation());
		System.out.println(data4.getPresident());
		System.out.println(data4.getPrimeMinister());
		System.out.println(data4.getLanguages());
	}
}
