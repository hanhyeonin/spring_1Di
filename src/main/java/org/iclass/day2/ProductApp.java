package org.iclass.day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductApp {

	public static void main(String[] args) {
		
		ApplicationContext context
			= new AnnotationConfigApplicationContext(ProductConfig.class);
		
//		ProductDao dao = context.getBean(ProductDao.class);
//		dao.product();				
//		// setter 주입으로 사용할 경우 count 값을 못가져온다.
//		
//		ProductService service = context.getBean(ProductService.class);
//		service.product();
//		
//		ProductController controller = context.getBean(ProductController.class);
//		controller.product();
		
		
	}
}
