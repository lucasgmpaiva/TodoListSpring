package br.com.desafio.ToDoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafio.ToDoSpring.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
