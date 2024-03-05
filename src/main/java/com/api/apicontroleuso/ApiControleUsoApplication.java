package com.api.apicontroleuso;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API controle acesso", description = "Api utilizada para gerar token JWT."))
public class ApiControleUsoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiControleUsoApplication.class, args);
	}

}
