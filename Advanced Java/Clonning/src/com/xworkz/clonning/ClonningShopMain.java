package com.xworkz.clonning;

public class ClonningShopMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		ClonningShopDTO shopdto=new ClonningShopDTO("mor", "Kurubrahalli", "All", 20000);
		System.out.println("shopdto: "+shopdto);
		
		ClonningShopDTO shopdto1=shopdto.clone();
		System.out.println("shopdto1: "+shopdto1);
		
		shopdto.setAddress("Rajaji-nagar");
		ClonningShopDTO shopdto3=shopdto.clone();
		System.out.println(shopdto3);
		System.out.println(shopdto);
	}

}
