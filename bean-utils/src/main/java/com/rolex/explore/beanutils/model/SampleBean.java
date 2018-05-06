package com.rolex.explore.beanutils.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleBean {
	
	private String name;
	
	private int age;
	
	private Address currentAddress = new Address();
	
	private Address[] previousAddresses = {new Address(),new Address(),new Address(),new Address(),new Address()};
	
	private Map<String, String> vehicleLicenseModel = new HashMap<String, String>();
	
	private Map<Integer, List<Place>> yearlyPlacesVisited = new HashMap<Integer, List<Place>>();
	
	private List<Place> placesVisited = new ArrayList<Place>();

	public SampleBean() {
		super();
	}

	public SampleBean(String name, int age, Address currentAddress, Address[] previousAddresses,
			Map<String, String> vehicleLicenseModel, Map<Integer, List<Place>> yearlyPlacesVisited, List<Place> placesVisited) {
		super();
		this.name = name;
		this.age = age;
		this.currentAddress = currentAddress;
		this.previousAddresses = previousAddresses;
		this.vehicleLicenseModel = vehicleLicenseModel;
		this.yearlyPlacesVisited = yearlyPlacesVisited;
		this.placesVisited = placesVisited;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}

	public Address[] getPreviousAddresses() {
		return previousAddresses;
	}

	public void setPreviousAddresses(Address[] previousAddresses) {
		this.previousAddresses = previousAddresses;
	}

	public Map<String, String> getVehicleLicenseModel() {
		return vehicleLicenseModel;
	}

	public void setVehicleLicenseModel(Map<String, String> vehicleLicenseModel) {
		this.vehicleLicenseModel = vehicleLicenseModel;
	}

	public Map<Integer, List<Place>> getYearlyPlacesVisited() {
		return yearlyPlacesVisited;
	}

	public void setYearlyPlacesVisited(Map<Integer, List<Place>> yearlyPlacesVisited) {
		this.yearlyPlacesVisited = yearlyPlacesVisited;
	}

	public List<Place> getPlacesVisited() {
		return placesVisited;
	}

	public void setPlacesVisited(List<Place> placesVisited) {
		this.placesVisited = placesVisited;
	}

	@Override
	public String toString() {
		return "SampleBean [name=" + name + ", age=" + age + ", currentAddress=" + currentAddress
				+ ", previousAddresses=" + Arrays.toString(previousAddresses) + ", vehicleLicenseModel="
				+ vehicleLicenseModel + ", yearlyPlacesVisited=" + yearlyPlacesVisited + ", placesVisited="
				+ placesVisited + "]";
	}

}
