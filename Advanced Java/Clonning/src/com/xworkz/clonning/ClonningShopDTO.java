package com.xworkz.clonning;

import java.io.Serializable;

public class ClonningShopDTO implements Serializable,Cloneable{

	private String name;
	
	private String Address;
	
	private String Type;
	
	private int incomePerDay;

	
	
	public ClonningShopDTO(String name, String address, String type, int incomePerDay) {
		this.name = name;
		Address = address;
		Type = type;
		this.incomePerDay = incomePerDay;
	}
	
	@Override
	public ClonningShopDTO clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (ClonningShopDTO) super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public int getIncomePerDay() {
		return incomePerDay;
	}

	public void setIncomePerDay(int incomePerDay) {
		this.incomePerDay = incomePerDay;
	}

	@Override
	public String toString() {
		return "ClonningShopDTO [name=" + name + ", Address=" + Address + ", Type=" + Type + ", incomePerDay="
				+ incomePerDay + "]";
	}
	
	
	
}
