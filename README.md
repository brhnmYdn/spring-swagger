

Swagger Maven => {
 <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
            <version>2.6.1</version>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>2.6.1</version>
            <scope>compile</scope>
        </dependency>
}


Swagger Config  => {
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
}