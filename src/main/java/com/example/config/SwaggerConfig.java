package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example"))
                .paths(PathSelectors.regex("/api.*"))
                .build()
                .apiInfo(info());
    }

    private ApiInfo info() {

        return new ApiInfo(
                "User API",
                "User Api Description",
                "v1",
                "apiserviceurl",
                new Contact("Burhan MEYDAN", "https://github.com/brhnmYdn", "brhnmydn@gmail.com"),
                "MIT License",
                "https://opensource.org/licenses/MIT"
        );
    }
}
