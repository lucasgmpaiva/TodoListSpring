package br.com.desafio.ToDoSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio.ToDoSpring.model.Task;
import br.com.desafio.ToDoSpring.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	public void save(Task task) {
		taskRepository.save(task);
	}
	
	public List<Task> findAll() {
		return taskRepository.findAll();
	}

}
