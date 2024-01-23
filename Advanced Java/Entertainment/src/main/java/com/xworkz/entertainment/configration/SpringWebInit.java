package com.xworkz.entertainment.configration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public SpringWebInit() {
		System.out.println("Creating SpringWebInit...");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Runnin getRootConfigClasses() method in SpringWebInit...");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Runnin getServletConfigClasses() method in SpringWebInit...");
		return new Class[] {BeanConfigration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Runnin getServletMappings() method in SpringWebInit...");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Runnin configureDefaultServletHandling() method in SpringWebInit...");
		configurer.enable();
	}

}
