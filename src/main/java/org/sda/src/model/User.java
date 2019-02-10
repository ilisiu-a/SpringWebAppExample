package org.sda.src.model;

import java.util.List;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private List<Address> addreses;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Address> getAddreses() {
		return addreses;
	}

	public void setAddreses(List<Address> addreses) {
		this.addreses = addreses;
	}

}
