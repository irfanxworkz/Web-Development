package com.xworkz.springball.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BallDTO {
	@NotNull
	@Size(min = 4,max = 10, message = "please provide a valide brand")
	private String brand;
	
	@NotNull
	@Size(min = 4,max = 10, message = "please provide a valide name")
	private String name;
	
	@NotNull
	@Size(min = 4,max = 10, message = "please provide a valide color")
	private String color;
	
	
	@Min(50)
	@Max(150)
	private int price;
	

	@Min(5)
	@Max(8)
	private double diameter;

}
