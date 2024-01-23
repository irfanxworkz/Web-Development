package com.xworkz.saloon.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.saloon.dto.BookingDTO;
import com.xworkz.saloon.dto.CakeDTO;
import com.xworkz.saloon.dto.SaloonDTO;

@Component
@RequestMapping("/")
public class SaloonController {

	public SaloonController() {
		System.out.println("Craeting Saloon...");
	}
	
	@PostMapping("/click")
	public String onClick(Model model) {
		System.out.println("Running onClick method in SaloonController...");
		model.addAttribute("msg","running onClick menthos");
		return "NextPage";
		
	}
	
	@PostMapping("/save")
	public String onSave(Model model , SaloonDTO saloonDTO) {
		System.out.println("Running onSakmksdmve method in SaloonController...");
		model.addAttribute("savedata","saved successfully");
		model.addAttribute("saloonDto", saloonDTO);
		System.out.println("saloonDTO : "+saloonDTO);
		return "ResultPage";
	}
	
	@PostMapping("/ticket")
	public String ticketBooking(Model model, BookingDTO bookingDTO) {
		System.out.println("Running onClick method in SaloonController...");
		model.addAttribute("msg1","running onClick menthos");
		model.addAttribute("bookingdto",bookingDTO);
		return "BookingSuccess";
		
	}
	
	public String order(CakeDTO cakeDTO, Model model) {
		
		System.out.println("Running order()....");
		model.addAttribute("msg2","Order Placed....");
		model.addAttribute("CakeDto" );
		return "OrderSuccess";
		
	}
}
