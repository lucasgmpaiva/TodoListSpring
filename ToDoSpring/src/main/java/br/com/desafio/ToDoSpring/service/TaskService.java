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
		if (isNameUnique(task) && !task.getName().isEmpty()) {
			taskRepository.save(task);
		} else {
			throw new RuntimeException("Erro ao cadastrar tarefa! Nome já existente");
		}
	}
	
	private boolean isNameUnique(Task task) {
		boolean unique = true;

		List<Task> tasks = findAll();

		for (Task taskIterator : tasks) {
			if (taskIterator.getName().toLowerCase().equals(task.getName().toLowerCase())) {
				unique = false;
			}
		}

		return unique;
	}
	
	public void edit(Task task) {
		List<Task> tasks = findAll();
		boolean alreadyPresent = tasks.stream().anyMatch(t -> t.getName().equals(task.getName()) && t.getId() == task.getId());
		if(alreadyPresent || isNameUnique(task)) {
			if(!task.getName().isEmpty())
				taskRepository.save(task);
		} else {
			throw new RuntimeException("Erro ao atualizar tarefa! Nome já existente.");
		}
	}
	
	public List<Task> findAll() {
		return taskRepository.findAll();
	}

	public void delete(Long id) {
		taskRepository.deleteById(id);
	}

}
