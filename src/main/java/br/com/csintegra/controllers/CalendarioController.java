package br.com.csintegra.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(value = "/calendario")
public class CalendarioController {
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView doForm() {
		return new ModelAndView("calendario/form");
	}

}
