package com.bluestar.WebReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class WebReaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebReaderApplication.class, args);
	}

}
