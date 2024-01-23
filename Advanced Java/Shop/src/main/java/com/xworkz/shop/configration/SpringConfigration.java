package com.xworkz.shop.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.shop.component.Scissor;

@Configuration
@ComponentScan("com.xworkz.shop")
public class SpringConfigration {
	
	public SpringConfigration() {
		System.out.println("Creating SpringConfigration....");
	}

	@Bean
	public Scissor scissor() {
		System.out.println("Running scissor() in SpringConfig....");
		return new Scissor();
		
	}
	
	@Bean
	public Scissor blade() {
		System.out.println("Running blade() in SpringConfig....");
		return new Scissor();
		
	}
}
