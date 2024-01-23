package com.xworkz.shop.component;

import org.springframework.stereotype.Component;

@Component
public class Ajama {

	private Scissor blade;
	
	public Ajama(Scissor blade) {
		this.blade=blade;
		System.out.println("Creating Ajama.....");
		System.out.println("ajma :"+this.blade);
	}
}
