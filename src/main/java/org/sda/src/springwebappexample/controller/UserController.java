package org.sda.src.springwebappexample.controller;

import org.sda.src.model.User;
import org.sda.src.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String getClient(Model model) {

		User user1 = new User();
		user1.setFirstName("aaa");
		user1.setLastName("bbb");
		user1.setPhoneNumber("112");

		User user2 = new User();
		user2.setFirstName("ccc");
		user2.setLastName("ddd");
		user2.setPhoneNumber("911");

		model.addAttribute("user1", user1);
		model.addAttribute("user2", user2);
		return "userPage";
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public String getUserById(@PathVariable(name = "id") int id, Model model) {

		System.out.println("The id we recived is : " + id);
		User user = new User();
		user.setId(1);
		user.setFirstName("aaa");
		user.setLastName("bbb");
		user.setPhoneNumber("112");

		model.addAttribute("user1", user);

		return "userPage";
	}

	@RequestMapping(value = "/users/{id}/addresses", method = RequestMethod.GET)
	public String getAddressesForUserId(Model model, @PathVariable(name = "id") int id) {
		model.addAttribute("addresses", userService.getUserById(id).getAddreses());
		return "addressPage";
	}
}
