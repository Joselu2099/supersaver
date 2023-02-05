package com.joselu_dani.supersaver;

import com.joselu_dani.supersaver.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(SecurityConfig.class)
@SpringBootApplication
public class SupersaverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupersaverApplication.class, args);
	}

}
