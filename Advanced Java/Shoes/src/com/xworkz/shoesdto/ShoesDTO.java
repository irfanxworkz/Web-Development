package com.xworkz.shoesdto;

import com.xworkz.shoesconstant.Size;
import com.xworkz.shoesconstant.Type;

public class ShoesDTO {


	private String brand;
	private Type type;
	private Size size;
	private double cost;
	
	public ShoesDTO(Type type,Size size) {
		super();
		this.type = type;
		this.size=size;
	}
	
	
	
	@Override
	public String toString() {
		return "ShoesDTO [brand=" + brand + ", type=" + type + ", size=" + size + ", cost=" + cost + "]";
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}

