package br.com.desafio.ToDoSpring.service;

import br.com.desafio.ToDoSpring.model.Task;
import br.com.desafio.ToDoSpring.repository.TaskRepository;

public class TaskService {
	
	private TaskRepository taskRepository;
	
	public void save(Task task) {
		taskRepository.save(task);
	}

}
