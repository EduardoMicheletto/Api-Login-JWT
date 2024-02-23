package com.api.apicontroleuso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class ApiControleUsoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiControleUsoApplication.class, args);
	}

}
