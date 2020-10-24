package br.com.desafio.ToDoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"br.com.desafio.ToDoSpring.model"})
@EnableJpaRepositories(basePackages = {"br.com.desafio.ToDoSpring.repository"})
@ComponentScan(basePackages = {"br.com.desafio.ToDoSpring.control"})
public class ToDoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoSpringApplication.class, args);
	}

}
