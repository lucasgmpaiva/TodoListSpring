package br.com.desafio.ToDoSpring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.desafio.ToDoSpring.repository.TaskRepository;

@Controller
@RequestMapping("/")
public class TaskController {
	
	private TaskRepository taskRepository;
	
	@Autowired
	public TaskController(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

}
