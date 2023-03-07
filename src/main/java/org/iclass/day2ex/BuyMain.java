package org.iclass.day2ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BuyMain {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(BuyConfig.class);
		
		BuyController controller = context.getBean(BuyController.class);
		controller.buy();
	}
}
