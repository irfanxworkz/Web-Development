package com.xworkz.shop.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Saloon {

	@Autowired
	private Ajama ajama;
	
	public Saloon() {
		System.out.println("Creating Saloon...");
		System.out.println("ajama : "+ajama);
	}
}
