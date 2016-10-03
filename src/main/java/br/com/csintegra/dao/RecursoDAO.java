package br.com.csintegra.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import br.com.csintegra.models.Recurso;

@Repository
public class RecursoDAO extends AbstractDAO<Recurso> implements GenericDAO<Recurso>{

	/* (non-Javadoc)
	 * @see br.com.csintegra.dao.AbstractDAO#save(java.lang.Object)
	 */
	@Override
	public void save(Recurso entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.dao.AbstractDAO#merge(java.lang.Object)
	 */
	@Override
	public void merge(Recurso entity) {
		// TODO Auto-generated method stub
		super.merge(entity);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.dao.AbstractDAO#remove(java.lang.Long)
	 */
	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		super.remove(Recurso.class,id);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.dao.AbstractDAO#listAll(java.lang.String, java.lang.Class)
	 */
	@Override
	public List<Recurso> listAll(String criteria, Class<?> clazz) {
		// TODO Auto-generated method stub
		return super.listAll(criteria, clazz);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.dao.AbstractDAO#listById(java.lang.Long)
	 */
	@Override
	public Recurso listById(Long id) {
		// TODO Auto-generated method stub
		return super.listById(Recurso.class,id);
	}

	@Override
	public List<Recurso> listAll() {
		// TODO Auto-generated method stub
		return super.listAll("select r from Recurso r", Recurso.class);
	}


	
}
