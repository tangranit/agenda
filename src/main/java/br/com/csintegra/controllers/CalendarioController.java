package br.com.csintegra.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.csintegra.models.EventosCalendario;
import br.com.csintegra.models.EventosInformacoes;
import br.com.csintegra.services.CalendarioService;
import br.com.csintegra.services.InformacoesService;

@RestController
@RequestMapping(value = "/calendario")
public class CalendarioController {

	@Autowired
	CalendarioService calendario;

	@Autowired
	InformacoesService informacoes;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView MontaAgenda() {

		ModelAndView mv = new ModelAndView("calendario/calendario");
		return mv;
	}

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/GetCalendario", method = RequestMethod.GET)
	public @ResponseBody List GetEventos() {
		return calendario.findAll();
	}

	@RequestMapping(value = "/novo", method = RequestMethod.GET)
	public ModelAndView doForm(EventosInformacoes eventosInformacoes) {
		eventosInformacoes = new EventosInformacoes();
		return new ModelAndView("calendario/form");
	}

	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public ModelAndView novo(EventosInformacoes novoEvento, UriComponentsBuilder ucBuilder) {
		EventosCalendario novaAgenda = new EventosCalendario();

		novaAgenda.setInf(novoEvento);
		novaAgenda.setTitle(novoEvento.getTitulo());
		novaAgenda.setStart(novoEvento.getInicio());
		novaAgenda.setEnd(novoEvento.getFim());
		novaAgenda
				.setUrl(ucBuilder.path("calendario/agenda/{id}").buildAndExpand(novaAgenda.getId()).toUri().toString());

		calendario.save(novaAgenda);

		return new ModelAndView("redirect:/calendario");
	}

	@RequestMapping(value = "/calendario/agenda/{id}", method = RequestMethod.POST)
	public ModelAndView visualiza(@PathVariable Long id) {
		ModelAndView view = new ModelAndView();
		view.addObject("informacao", informacoes.findById(id));
		return view;

	}

}
