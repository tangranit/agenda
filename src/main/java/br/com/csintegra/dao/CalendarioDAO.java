package br.com.csintegra.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.csintegra.models.EventosCalendario;

@Repository
public class CalendarioDAO extends AbstractDAO<EventosCalendario> implements GenericDAO<EventosCalendario> {

	@Override
	public List<EventosCalendario> listAll() {
		// TODO Auto-generated method stub
		return super.listAll("select ec from EventosCalendario ec", EventosCalendario.class);
	}

	@Override
	public void save(EventosCalendario entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	@Override
	public void merge(EventosCalendario entity) {
		// TODO Auto-generated method stub
		super.merge(entity);
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		super.remove(id);
	}

	@Override
	public EventosCalendario listById(Long id) {
		// TODO Auto-generated method stub
		return super.listById(id);
	}

}
