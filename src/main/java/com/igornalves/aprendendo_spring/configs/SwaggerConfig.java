package com.igornalves.aprendendo_spring.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI configOpenAPI() {

        Contact contatosAPI = new Contact();
        contatosAPI.setName("Igor Nascimento");
        contatosAPI.setEmail("Igornalves08@gmail.com");

        License licenseAPI = new License();
        licenseAPI.name("Copyright (c) 2026 Igor Nascimento");

        Info informacoesAPI = new Info()
                .title("Produto Aprendizado Spring Boot")
                .description("projeto com o intuito de aprender mais sobre a ferramenta spring boot e sua funcionalidas")
                .version("1.0")
                .contact(contatosAPI)
                .license(licenseAPI);


       return new OpenAPI().info(informacoesAPI);
    }
}
