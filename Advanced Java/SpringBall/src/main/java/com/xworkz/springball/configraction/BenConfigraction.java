package com.xworkz.springball.configraction;




import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan("com.xworkz.springball")
public class BenConfigraction {
	
	public BenConfigraction() {
	System.out.println("bean configraction is created...");
	}
	

}
