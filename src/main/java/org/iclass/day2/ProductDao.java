package org.iclass.day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductDao {
	
	private int count;
	
	public ProductDao(@Value("10") int count) {
		System.out.println(":::: ProductDao 생성자 - int value 전달 ::::");
		this.count=count;
	}
	
	// 기본생성자 정의
	public ProductDao() {
		System.out.println(":::: ProductDao 기본생성자 ::::");
	}
	
	// 파라미터 타입이 bean(객체) 이 아니므로 자동주입 과정이 없습니다 @Value 이 의미가 없습니다.(커스텀 생성자와 비교하세요.)
	public void setCount(@Value("22") int count) {
		System.out.println("---- ProductDao setter메소드 ----");
		this.count = count;
	}

	public void product() {
		System.out.println("---- ProductDao product() ----");
		System.out.println("---- 수량 : " + count + " 생산합니다. ----");
	}
	
}
