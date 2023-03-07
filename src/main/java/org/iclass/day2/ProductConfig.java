package org.iclass.day2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.iclass.day2")		// 해당패키지의 Component를 모두 bean으로 생성
public class ProductConfig {

}
/*
@Configuration 어노테이션 : 설정정보를 갖는 클래스
@ComponentScan(basePackages = "org.iclass.day2") : basePackages 로 지정된 패키지의 모든 클래스를 스캔한다
			@Component 를 찾아서 bean을 만들기 위한 스캔입니다. 배열형식으로 여러 패키지를 설정할 수 있습니다.
			bean (객체) 을 만들어서 스프링 컨테이너에 저장하고 관리합니다.
주의 : @ComponentScans 는 @ComponentScan의 배열
@Configuration
@ComponentScans({
	@ComponentScan(basePackages = "org.iclass.day2"),
	@ComponentScan(basePackageClasses = VehicleFactoryConfig.class)
})
class VehicleFactoryConfig{}
*/