package com.xworkz.shop.configration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	
	public SpringWebInit() {
		System.out.println("Creating SpringWebInit......");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses...  .... in SpringWebInit");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses register SpringConfigration class with SpringWebInit ...  .... in SpringWebInit");
		return new Class[] {SpringConfigration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings for mapping url...  .... in SpringWebInit");
		return new String[] {"/"};
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling for creating static resources like html css image jsp  .... in SpringWebInit");
		configurer.enable();
	}
	
}
