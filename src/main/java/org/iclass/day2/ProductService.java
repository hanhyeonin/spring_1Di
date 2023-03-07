package org.iclass.day2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
	
	private ProductDao dao;

	@Autowired		// 생성자 주입
	public ProductService(ProductDao dao) {
		System.out.println(":::: ProductService 생성자 - ProductDao bean 주입 ::::");
		this.dao = dao;
	}
	
	public void product() {
		System.out.println("---- ProductService product() ----");
		dao.product();
	}
}
