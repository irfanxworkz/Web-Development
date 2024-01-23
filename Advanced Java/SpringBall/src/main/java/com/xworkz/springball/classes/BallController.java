package com.xworkz.springball.classes;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.springball.dto.BallDTO;
import com.xworkz.springball.service.BallService;

@Controller
@RequestMapping("/")
public class BallController {
	
	@Autowired
	private BallService ballService;
 
	public BallController() {
        System.out.println("invoking in the BallController.. ");
	}
	
	@PostMapping("/mallu")
	public String yallu( @Valid BallDTO ballDTO,BindingResult error,Model model) { 
		
		System.out.println("request mapping is occurs.."+ballDTO);
		System.out.println(error.hasErrors());
		model.addAttribute("ballDTO", ballDTO);
		
		if(error.hasErrors()) {
			List<ObjectError> objectErrors=error.getAllErrors();
			objectErrors.forEach(y->System.err.println(y.getObjectName()+"message"+y.getDefaultMessage()));
			model.addAttribute("errormassage", objectErrors);
			model.addAttribute("text", "data is not valied..");
			return "aboutball.jsp";
		}else { 
			boolean saved= this.ballService.saveAndValidate(ballDTO);
			if(saved) {
				model.addAttribute("good", "data is saved..");
			}else {
				model.addAttribute("bad","data is node saved..");
			}
			return "success.jsp";
		}
		
		
		
	}
}
