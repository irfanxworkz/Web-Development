package com.xworkz.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.user.dto.UserDTO;
import com.xworkz.user.repository.UserRepositry;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepositry userRepositry;
	
	@Override
	public UserDTO saveUse(UserDTO userDTO) {
		System.out.println("Running saveUser in UserServiceImpl...");
		UserDTO dto= this.userRepositry.saveUse(userDTO);
		if (dto !=null) {
			System.out.println("User dto in repositry : "+dto);
			return dto;
		}else {
			System.out.println("User dto is null");
			return null;
		}
		
	}

}
