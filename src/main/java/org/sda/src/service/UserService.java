package org.sda.src.service;

import java.util.Arrays;
import java.util.List;

import org.sda.src.model.Address;
import org.sda.src.model.User;

public class UserService {

	public User getUserById(int id) {
		Address address = new Address("Stejarului", "Floresti", "Romania", 1);
		Address address2 = new Address("Primaverii", "Cluj", "Romania", 2);

		User user = new User();
		user.setId(id);
		user.setFirstName("abc");
		user.setLastName("def");
		user.setPhoneNumber("7301");
		user.setAddreses(Arrays.asList(address, address2));
		return user;
	}

	public Address getAddressByIdFromList(List<Address> address, int id) {
		for (Address addr : address) {
			if (id == addr.getId())
				return addr;
		}
		return null;
	}
}
