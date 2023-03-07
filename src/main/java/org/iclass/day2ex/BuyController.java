package org.iclass.day2ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuyController {

	private BuyService service;
	
	//@Autowired
	public BuyController(BuyService service) {
		System.out.println("::: BuyController 생성자 :::");
		this.service=service;
	}
	
	public void buy() {
		System.out.println("-- BuyController buy() --");
		service.buy();
	}
}
