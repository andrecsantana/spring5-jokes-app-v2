package guru.springframework.spring5jokesappv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5jokesappv2.service.JokesService;

@Controller
public class JokeController {

	private final JokesService jokesService;

	public JokeController(JokesService jokesService) {
		super();
		this.jokesService = jokesService;
	}

	@RequestMapping({"/",""})
	public String showJokes(Model model) {
		model.addAttribute("joke", jokesService.getJoke());
		return "index";

	}

}
