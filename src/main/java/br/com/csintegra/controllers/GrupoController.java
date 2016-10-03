package br.com.csintegra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.csintegra.models.Grupo;
import br.com.csintegra.services.GrupoService;

@RestController
@RequestMapping(value = "/grupo")
public class GrupoController {

	@Autowired
	GrupoService grupoDAO;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView doForm() {
		return new ModelAndView("grupo/form").addObject("grupo", new Grupo());
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView create(Grupo grupo) {
		grupoDAO.save(grupo);
		return new ModelAndView("redirect:/grupo");
	}

	@RequestMapping(value = "/editar/{id}", method = RequestMethod.GET)
	public ModelAndView edit(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("grupo/form");
		mv.addObject("grupo", grupoDAO.findById(id));
		return mv;
	}

	@RequestMapping(value = "/remover/{id}", method = RequestMethod.POST)
	public ModelAndView remove(@PathVariable Long id) {
		grupoDAO.deleteById(id);
		return new ModelAndView("redirect:/grupo");
	}

	@RequestMapping(value = "/pesquisar", method = RequestMethod.GET)
	public ModelAndView search() {
		ModelAndView mv = new ModelAndView("grupo/form");
		mv.addObject("grupo", grupoDAO.findAll());
		return mv;
	}
	
	
	@RequestMapping(value = "/pesquisar/${grupo}", method = RequestMethod.GET)
	public ModelAndView search(@PathVariable String g) {
		ModelAndView mv = new ModelAndView("grupo/form");
		// mv.addObject("grupo", grupoDAO.findByName("Grupo.ALL"));
		return mv;
	}
}
