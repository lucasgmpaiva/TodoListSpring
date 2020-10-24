package br.com.desafio.ToDoSpring.service;

import org.springframework.stereotype.Service;

import br.com.desafio.ToDoSpring.model.Task;
import br.com.desafio.ToDoSpring.repository.TaskRepository;

@Service
public class TaskService {
	
	private TaskRepository taskRepository;
	
	public void save(Task task) {
		taskRepository.save(task);
	}

}
