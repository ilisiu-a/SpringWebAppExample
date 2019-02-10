package org.sda.src.model;

public class Address {

	private String street;
	private String city;
	private String country;
	private int id;

	public Address(String street, String city, String country, int id) {
		this.street = street;
		this.city = city;
		this.country = country;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
