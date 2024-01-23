package com.xworkz.saloon.dto;

import lombok.Data;

@Data
public class CakeDTO {
	
	private String name,email,flavour;
	private double price,weight;
	
	private boolean takeAway;
}
