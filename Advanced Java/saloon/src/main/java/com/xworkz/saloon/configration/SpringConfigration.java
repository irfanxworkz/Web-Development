package com.xworkz.saloon.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfigration {

	public SpringConfigration() {
		System.out.println("Creating SpringConfigration...");
	}
	
	@Bean
	public ViewResolver viewResolver() {
		ViewResolver resolver=new InternalResourceViewResolver("/",".jsp");
		return resolver;
		
	}
}
