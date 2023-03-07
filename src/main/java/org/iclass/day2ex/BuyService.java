package org.iclass.day2ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuyService {

	private BuyDao dao;
	
	//@Autowired
	public BuyService(BuyDao dao) {
		System.out.println("::: BuyService 생성자 :::");
		this.dao=dao;
	}
	
	public void buy() {
		System.out.println("-- BuyService buy() --");
		dao.buy();
	}
}
