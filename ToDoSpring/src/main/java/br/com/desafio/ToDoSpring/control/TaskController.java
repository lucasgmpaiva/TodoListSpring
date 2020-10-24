package br.com.desafio.ToDoSpring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.desafio.ToDoSpring.model.Task;
import br.com.desafio.ToDoSpring.repository.TaskRepository;
import br.com.desafio.ToDoSpring.service.TaskService;

@Controller
public class TaskController {
	
	private TaskService taskService;
	
	@Autowired
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/newtask", method=RequestMethod.GET)
	public String newTask() {
		return "new-task";
	}
	
	@RequestMapping(value="/newtask", method=RequestMethod.POST)
	public String newTaskSave(Task task) {
		taskService.save(task);
		return "redirect:/newtask";
	}
	
}
