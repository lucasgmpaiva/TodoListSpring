package br.com.desafio.ToDoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ToDoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoSpringApplication.class, args);
	}

}
