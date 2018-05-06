package com.rolex.explore.beanutils.model;

import java.util.Arrays;

public class Place {
	
	private String city;
	
	private String state;
	
	private String country;
	
	private TourismAward[] tourismAwards = {new TourismAward(),new TourismAward(),new TourismAward()};

	public Place() {
		super();
	}
	
	public Place(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}

	public Place(String city, String state, String country, TourismAward[] tourismAwards) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.tourismAwards = tourismAwards;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public TourismAward[] getTourismAwards() {
		return tourismAwards;
	}

	public void setTourismAwards(TourismAward[] tourismAwards) {
		this.tourismAwards = tourismAwards;
	}

	@Override
	public String toString() {
		return "Place [city=" + city + ", state=" + state + ", country=" + country + ", tourismAwards="
				+ Arrays.toString(tourismAwards) + "]";
	}

}
