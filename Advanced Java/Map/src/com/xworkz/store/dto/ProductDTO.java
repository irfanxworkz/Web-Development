package com.xworkz.store.dto;

import java.time.LocalDate;
import java.util.Objects;

public class ProductDTO implements Comparable<ProductDTO>{

	private String name;
	private double price;
	private int id, quantity;
	private LocalDate mfgDate;

	
	
	public ProductDTO(String name, double price, int id, int quantity, LocalDate mfgDate) {
		super();
		this.name = name;
		this.price = price;
		this.id = id;
		this.quantity = quantity;
		this.mfgDate = mfgDate;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(id, mfgDate, name, price, quantity);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		return id == other.id && Objects.equals(mfgDate, other.mfgDate) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity;
	}

	
		
	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", price=" + price + ", id=" + id + ", quantity=" + quantity + ", mfgDate="
				+ mfgDate + "]";
	}

	


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public LocalDate getMfgDate() {
		return mfgDate;
	}



	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}



	@Override
	public int compareTo(ProductDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
