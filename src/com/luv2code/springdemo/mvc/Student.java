package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

// 1. student class 만들기
public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String[] operatingSystems; 
	
	private LinkedHashMap<String,String> countryOptions;
	
	private String favoriteLanguage;
	public Student() {
		countryOptions = new LinkedHashMap<>();
		// Key, Value pair
		countryOptions.put("BR","Brazil");
		countryOptions.put("FR","France");
		countryOptions.put("GE","German");
		countryOptions.put("IN","India");
		countryOptions.put("US","United States of America");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
}
