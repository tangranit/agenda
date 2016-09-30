package br.com.csintegra.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.csintegra.dao.CalendarioDAO;
import br.com.csintegra.models.EventosCalendario;


@Service("calendario")
@Transactional
public class CalendarioImpl extends AbstractServices<CalendarioDAO, EventosCalendario> implements CalendarioService {

	@Autowired
	CalendarioDAO dao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.csintegra.services.AbstractServices#save(java.lang.Object)
	 */
	@Override
	public void save(EventosCalendario entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.csintegra.services.AbstractServices#update(java.lang.Object)
	 */
	@Override
	public void update(EventosCalendario entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.csintegra.services.AbstractServices#deleteById(java.lang.Long)
	 */
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.csintegra.services.AbstractServices#findAll()
	 */
	@Override
	public List<EventosCalendario> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public EventosCalendario findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventosCalendario findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
