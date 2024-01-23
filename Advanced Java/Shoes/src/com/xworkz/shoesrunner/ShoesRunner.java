package com.xworkz.shoesrunner;

import com.xworkz.shoesconstant.Size;
import com.xworkz.shoesconstant.Type;
import com.xworkz.shoesdto.ShoesDTO;

public class ShoesRunner {

	public static void main(String[] args) {
		
		ShoesDTO shoesdto=new ShoesDTO(Type.SPORT,Size.SIZE2);

		shoesdto.setBrand("Addidas");
		shoesdto.setCost(5000);
		System.out.println(shoesdto);
		System.out.println("size for medium : "+Size.SIZE2.getSize());
		
	}

}
