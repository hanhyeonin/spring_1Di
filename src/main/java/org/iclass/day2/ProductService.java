package org.iclass.day2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
	
	private ProductDao dao;
	// private ProductDao dao = new ProductDao();		1) 필드주입

	//@Autowired	setter주입을 위해 주석처리	2) 생성자주입
	public ProductService(ProductDao dao) {
		System.out.println(":::: ProductService 생성자 - ProductDao bean 주입 ::::");
		this.dao = dao;
	}
	
	// setter 주입을 위해 기본생성자 정의
	public ProductService() {
		System.out.println(":::: ProductService 기본생성자 ::::");
	}
	
	@Autowired		// 3) setter 주입
	public void setDao(ProductDao dao) {
		System.out.println("---- ProductService setter메소드 ----");
		this.dao = dao;
	}
	
	public void product() {
		System.out.println("---- ProductService product() ----");
		dao.product();
	}
}
