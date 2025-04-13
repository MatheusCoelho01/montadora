package io.github.arquiteturaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ArquiteturaspringApplication {

	public static void main(String[] args) {

		SpringApplicationBuilder bilder = new SpringApplicationBuilder(ArquiteturaspringApplication.class);
		bilder.run(args);
	}

}
