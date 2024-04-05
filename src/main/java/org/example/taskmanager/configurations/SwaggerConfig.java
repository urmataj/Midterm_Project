package org.example.taskmanager.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * Configures Swagger for API documentation.
     *
     * @return A Docket instance for Swagger configuration.
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                // Selects the controllers to include in the Swagger documentation
                .apis(RequestHandlerSelectors.basePackage("org.example.taskmanager.controllers"))
                // Selects the paths to include in the Swagger documentation
                .paths(PathSelectors.any())
                .build();
    }//
}
