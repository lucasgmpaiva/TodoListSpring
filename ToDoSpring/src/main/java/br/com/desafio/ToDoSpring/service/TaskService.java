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
		if (isNameUnique(task)) {
			taskRepository.save(task);
		} else {
			System.out.println("Tarefa não cadastrada devido a nome repetido.");
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

	public List<Task> findAll() {
		return taskRepository.findAll();
	}

	public void delete(Long id) {
		taskRepository.deleteById(id);
		;
	}

}
