package br.com.desafio.ToDoSpring.control;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@ControllerAdvice
public class ExceptionHandlerController {
	
	@ExceptionHandler(RuntimeException.class)
	public String handleException(RuntimeException e, RedirectAttributes redirAttrs) {
		redirAttrs.addFlashAttribute("error", e.getMessage());
		return "redirect:/";
	}

}
