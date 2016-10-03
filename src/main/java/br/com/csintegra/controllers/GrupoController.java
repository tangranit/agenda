package br.com.csintegra.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.csintegra.models.Grupo;
import br.com.csintegra.services.GrupoService;
import br.com.csintegra.validations.GrupoValidation;

@RestController
@RequestMapping(value = "/grupo")
public class GrupoController {

	@Autowired
	GrupoService grupoDAO;

	@InitBinder
	protected void InitBinder(WebDataBinder binder) {
		binder.setValidator(new GrupoValidation());
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView doForm() {
		return new ModelAndView("grupo/form").addObject("grupo", new Grupo());
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Grupo> create(@Valid Grupo grupo, BindingResult bindingResult){
		if (bindingResult.hasErrors()) {
			return new ResponseEntity<Grupo>(grupo, HttpStatus.METHOD_NOT_ALLOWED);
		}
		grupoDAO.save(grupo);
		return new ResponseEntity<Grupo>(grupo, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/editar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Void> edit(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("grupo/form");
		HttpHeaders headers = new HttpHeaders();
		if (grupoDAO.findById(id) == null) {
			return new ResponseEntity<Void>(headers, HttpStatus.METHOD_NOT_ALLOWED);
		}
		mv.addObject("grupo", grupoDAO.findById(id));
		return new ResponseEntity<Void>(headers, HttpStatus.OK);
	}

	@RequestMapping(value = "/remover/{id}", method = RequestMethod.POST)
	public ResponseEntity<Void> remove(@PathVariable Long id) {
		HttpHeaders headers = new HttpHeaders();
		grupoDAO.deleteById(id);
		return new ResponseEntity<Void>(headers, HttpStatus.OK);
	}

	@RequestMapping(value = "/pesquisar", method = RequestMethod.GET)
	public List<Grupo> search() {
		return grupoDAO.findAll();
	}

	@RequestMapping(value = "/pesquisar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Grupo> search(@PathVariable Long id) {
		Grupo grupo = null;
		if (grupoDAO.findById(id) == null) {
			return new ResponseEntity<Grupo>(grupo, HttpStatus.METHOD_NOT_ALLOWED);
		}
		grupo = grupoDAO.findById(id);
		return new ResponseEntity<Grupo>(grupo, HttpStatus.OK);
	}
}
