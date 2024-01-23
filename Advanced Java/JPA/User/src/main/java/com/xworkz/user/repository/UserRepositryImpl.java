package com.xworkz.user.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.user.dto.UserDTO;

@Repository
public class UserRepositryImpl implements UserRepositry {
	
	@Override
	public UserDTO saveUse(UserDTO userDTO) {
		System.out.println("Running saveUser in UserRepositryImpl...");
		if (userDTO !=null) {
			System.out.println("userDto in service: "+userDTO);
			return userDTO;
		} else {
			System.out.println("userDto is null..");
			return userDTO;
		}
	}

}
