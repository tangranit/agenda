package br.com.csintegra.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.csintegra.models.EventosInformacoes;

@Repository
public class InformacoesDAO extends AbstractDAO<EventosInformacoes> implements GenericDAO<EventosInformacoes> {

	@Override
	public List<EventosInformacoes> listAll() {
		// TODO Auto-generated method stub
		return super.listAll("select ei from EventosInformacoes ei", EventosInformacoes.class);

	}

	@Override
	public void save(EventosInformacoes entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	@Override
	public void merge(EventosInformacoes entity) {
		// TODO Auto-generated method stub
		super.merge(entity);
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		super.remove(id);
	}

	@Override
	public EventosInformacoes listById(Long id) {
		// TODO Auto-generated method stub
		return super.listById(id);
	}

}
