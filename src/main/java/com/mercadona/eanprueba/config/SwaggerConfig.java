package com.mercadona.eanprueba.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * Configuracion Swagger para la generacion de documentacion de la API REST
 * http://localhost:8081/swagger-ui/
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiDetails() {
        return new OpenAPI().info(new Info()
                .title("Mercadona API REST")
                .version("1.0")
                .description("Libreria Swagger de Api de Codigos EAN")
                .contact(new Contact().name("Facundo Rivero").email("frr.1991@gmail.com"))
                .license(new License().name("License")));
    }
}
