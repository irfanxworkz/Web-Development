package com.xworkz.person.configration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.xworkz.person.controller", "com.xworkz.person.service", "com.xworkz.person.repo"})
public class BeanConfigration {
	
	public BeanConfigration() {
		System.out.println("creating BeanConfigration...");
	}

}
