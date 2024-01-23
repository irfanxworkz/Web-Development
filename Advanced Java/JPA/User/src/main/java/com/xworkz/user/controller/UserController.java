package com.xworkz.user.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.user.dto.UserDTO;
import com.xworkz.user.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService userService;

	public UserController() {
		System.out.println("Creating UserController...");
	}

	@PostMapping("/saveUser")
	public String userSave(@Valid UserDTO userDTO, BindingResult bindingResult, Model model) {
		System.out.println("Running userSave method in UserController...");
		System.out.println("UserDto is : " + userDTO);
		UserDTO userDTO2 = this.userService.saveUse(userDTO);
		if (userDTO2 != null) {
			model.addAttribute("userSaveMsg", "Successfully saved...");
			model.addAttribute("userdata", userDTO2);
			return "ViewUser";
		} else {
			model.addAttribute("userSaveMsg1", "User Data not saved...");
			return "ViewUser";
		}

	}

	
	
	/*
	 * public String showForm(Model model) { List<UserDTO> userList =
	 * createSampleUserList(); UserDTO userDTO = new UserDTO();
	 * userDTO.setUserList(userList); model.addAttribute("userDTO", userDTO); return
	 * "AddUser";
	 * 
	 * }
	 * 
	 * private List<UserDTO> createSampleUserList() { List<UserDTO> userList = new
	 * ArrayList<>(); for (int i = 1; i <= 10; i++) { UserDTO userDTO = new
	 * UserDTO(); userDTO.setId(i); userDTO.setName("User" + i);
	 * userDTO.setPassword("password" + i); userDTO.setEmail("user" + i +
	 * "@example.com"); userDTO.setSex(i % 2 == 0 ? "Male" : "Female");
	 * userDTO.setCountry("Country" + i); userList.add(userDTO); } return userList;
	 * }
	 */
	 
	 
}
