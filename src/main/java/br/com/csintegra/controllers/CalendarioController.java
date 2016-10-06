package br.com.csintegra.controllers;

import java.text.ParseException;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.csintegra.logics.DataCalendario;


@RestController
@RequestMapping(value = "/calendario")
public class CalendarioController {
	
	@Autowired
	DataCalendario data; 
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView doForm() {
		return new ModelAndView("calendario/form");
	}

	
	@RequestMapping(value="/dias/{year}/{month}",method = RequestMethod.GET)
	public String days(@PathVariable Integer year,@PathVariable Integer month) throws ParseException {
		DataCalendario calendario = new DataCalendario();
		Calendar c = Calendar.getInstance();
		c.set(year, month, 1);
		calendario.setMes(c);
		return calendario.toString();
	}
	

	
}
