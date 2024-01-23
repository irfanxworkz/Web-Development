package com.xworkz.user.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.user")
@EnableWebMvc
public class SpringBeanConfigration {

	public SpringBeanConfigration() {
		System.out.println("Creating SpringBeanConfigration...");
	}
	
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("running viewResolver...");
		ViewResolver resolver=new InternalResourceViewResolver("/",".jsp");
		return resolver;
	}
}
