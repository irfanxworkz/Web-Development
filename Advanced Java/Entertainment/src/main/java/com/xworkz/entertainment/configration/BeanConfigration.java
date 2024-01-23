package com.xworkz.entertainment.configration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.entertainment")
public class BeanConfigration {

	public BeanConfigration() {
		System.out.println("Creating BeanConfigration...");
	}
}
