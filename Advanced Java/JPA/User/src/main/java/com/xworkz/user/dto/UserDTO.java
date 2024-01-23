package com.xworkz.user.dto;

import java.util.List;

import lombok.Data;

@Data
public class UserDTO {
	
	//private List<UserDTO> userList;
	
	private int id;
	
	private String name;
	
	private String password;
	
	private String email;
	
	private String sex;
	
	private String country;
	

}
