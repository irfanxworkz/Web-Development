package com.xworkz.entertainment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SongController {

	public SongController() {
		System.out.println("Creating SongController...");
	}
}
