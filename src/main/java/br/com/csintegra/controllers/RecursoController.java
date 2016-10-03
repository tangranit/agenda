package br.com.csintegra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.csintegra.models.Grupo;
import br.com.csintegra.models.Recurso;
import br.com.csintegra.services.GrupoService;
import br.com.csintegra.services.RecursoService;

@RestController
@RequestMapping(value = "/recurso")
public class RecursoController {

	@Autowired
	RecursoService recursoService;

	@Autowired
	GrupoService grupoService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView doForm() {
		ModelAndView mv = new ModelAndView("recurso/form");
		mv.addObject("grupos", grupoService.findAll());
		mv.addObject("recurso", new Recurso());
		
		return mv;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView create(Recurso recurso) {
		
		Grupo grupo = grupoService.findById(recurso.getGrupo().getId());
		recurso.setGrupo(grupo);
		recursoService.save(recurso);
		return new ModelAndView("redirect:/recurso");

	}

}
