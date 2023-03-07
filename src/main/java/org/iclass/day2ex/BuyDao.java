package org.iclass.day2ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BuyDao {


	private String dbFactory;
	
	public BuyDao(@Value("mybatis") String dbFactory) {
		System.out.println("::: BuyDao 생성자 :::");
		this.dbFactory=dbFactory;
	}
	
	public void buy() {
		System.out.println("-- BuyDao buy() --");
		System.out.println(dbFactory + "를 이용하여 db에 연결합니다.");
	}
}
