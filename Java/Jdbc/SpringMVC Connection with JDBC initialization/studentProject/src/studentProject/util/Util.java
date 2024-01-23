package com.xworkz.studentProject.util;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class Util {
	
	public static String jdbcUrl ="jdbc:mysql://localhost:3306/mydb";
	public static String userName="root";
	public static String password="IRas@1234";
	
public <T> boolean validDTO(T t) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<T>> cv = validator.validate(t);
		System.out.println(cv.size());
		cv.forEach(v -> System.out.println(v.getPropertyPath() + " " + v.getMessage()));
		
		return cv.isEmpty();	
	}

}
