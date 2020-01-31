package com.rohit.saga.order.service.swagger;

import io.swagger.annotations.Contact;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apiDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.progressivecoder.ordermanagement"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo(){
        return new ApiInfo(
                "Saga Pattern Implementation using Axon and Spring Boot",
                "App to demonstrate Saga Pattern using Axon and Spring Boot",
                "1.0.0",
                "Terms of Service",
                new Contact("Saurabh Dashora", "progressivecoder.com", "coder.progressive@gmail.com"),
                "",
                "",
                Collections.emptyList());
    }

}