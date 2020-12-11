package com.xworkz.data.dto;

public class CountryDTO {
	private String countryName;
	private String continent;
	private String[] states;
	private long population;
	private String primeMinister;
	private String president;
	private String[] languages;

	public CountryDTO() {
		System.out.println("CountryDTO is created");
	}

	public CountryDTO(String countryName, String continent) {
		System.out.println("New constuctor");
		this.countryName = countryName;
		this.continent = continent;
	}

	public CountryDTO(String[] states, String[] languages) {
		this.languages = languages;
		this.states = states;
	}

	public CountryDTO(long population, String primeMinister, String president) {
		this.population = population;
		this.president = president;
		this.primeMinister = primeMinister;
	}

	public CountryDTO(String countryName, String continent, String[] states, long population, String primeMinister,
			String president, String[] languages) {
		this.countryName = countryName;
		this.continent = continent;
		this.states = states;
		this.population = population;
		this.president = president;
		this.primeMinister = primeMinister;
		this.languages = languages;
	}

	public String getCountryName() {
		return countryName;
	}

	public String getContinent() {
		return continent;
	}

	public String[] getStates() {
		return states;
	}

	public long getPopulation() {
		return population;
	}

	public String getPrimeMinister() {
		return primeMinister;
	}

	public String getPresident() {
		return president;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public void setStates(String[] states) {
		this.states = states;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public void setPrimeMinister(String primeMinister) {
		this.primeMinister = primeMinister;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

}
