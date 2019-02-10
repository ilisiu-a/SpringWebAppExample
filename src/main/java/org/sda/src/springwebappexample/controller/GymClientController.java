package org.sda.src.springwebappexample.controller;

import org.sda.src.model.GymClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GymClientController {

	@RequestMapping(value = "/gymClient", method = RequestMethod.GET)
	public String getGymClient(Model model) {
		GymClient gymClient = new GymClient();
		gymClient.setAddress("Stejarului");
		gymClient.setFirstName("first");
		gymClient.setLastName("last");
		gymClient.setMobileNr("112");

		model.addAttribute("gymClient", gymClient);
		return "gymClientPage";
	}
}
