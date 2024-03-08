package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/cms")
public class HomeController {

	@GetMapping(value = "/home")
	public String getHomePage(Model model) {
		String message="welcome to Spring boot Web App";
		model.addAttribute("message", message);
		return "home";
	}

	@GetMapping(value = "/about-us")
	public String getAboutUsPage() {
		return "about";
	}

	@GetMapping(value = "/contact")
	public String getContactPage() {
		return "contact";
	}

}
