package com.springbootstarter.commons;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Component
@EnableSwagger2
public class MySwaggerConfig {
	
	@Bean
	public Docket getDocket() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("initial-apis")
				.apiInfo(getApiInfo())
				.select().apis(RequestHandlerSelectors.basePackage("com.springbootstarter.topics"))
				.build();
	}
	
	public ApiInfo getApiInfo() {
		
		return new ApiInfoBuilder()
				.title("Topics - api's")
				.description("All the apis for topics").version("1.1").build();
		
	}

}
