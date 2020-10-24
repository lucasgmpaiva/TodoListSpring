package br.com.desafio.ToDoSpring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.desafio.ToDoSpring.model.Task;
import br.com.desafio.ToDoSpring.repository.TaskRepository;
import br.com.desafio.ToDoSpring.service.TaskService;

@Controller
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("tasks", taskService.findAll());
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
