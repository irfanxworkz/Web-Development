package com.xworkz.shop.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SpringController {
	
	public SpringController() {
		System.out.println("Creating SpringController...");
	}

	@RequestMapping("/click")
	public String onClick(Model model) {
		System.out.println("Running onClickMethod on SpringController");
		model.addAttribute("msg","correctly working onClick Method...");
		return "/Home.jsp";
	}
}
