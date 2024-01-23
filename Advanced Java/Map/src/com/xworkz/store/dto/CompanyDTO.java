package com.xworkz.store.dto;

import java.util.Objects;

public class CompanyDTO implements Comparable<CompanyDTO>{

	private String name, location, gstNo;
	
	public CompanyDTO(String name, String location, String gstNo) {
		super();
		this.name = name;
		this.location = location;
		this.gstNo = gstNo;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(gstNo, location, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompanyDTO other = (CompanyDTO) obj;
		return Objects.equals(gstNo, other.gstNo) && Objects.equals(location, other.location)
				&& Objects.equals(name, other.name);
	}

	

	@Override
	public String toString() {
		return "CompanyDTO [name=" + name + ", location=" + location + ", gstNo=" + gstNo + "]";
	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getGstNo() {
		return gstNo;
	}



	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}



	@Override
	public int compareTo(CompanyDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
