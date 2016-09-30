package br.com.csintegra.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.csintegra.models.Grupo;

@Repository
public class GrupoDAO extends AbstractDAO<Grupo> implements GenericDAO<Grupo> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.csintegra.dao.GenericDAO#listAll()
	 */
	@Override
	public List<Grupo> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.csintegra.dao.AbstractDAO#save(java.lang.Object)
	 */
	@Override
	public void save(Grupo entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.csintegra.dao.AbstractDAO#merge(java.lang.Object)
	 */
	@Override
	public void merge(Grupo entity) {
		// TODO Auto-generated method stub
		super.merge(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.csintegra.dao.AbstractDAO#remove(java.lang.Long)
	 */
	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		super.remove(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.csintegra.dao.AbstractDAO#listAll(java.lang.String,
	 * java.lang.Class)
	 */
	@Override
	public List<Grupo> listAll(String criteria, Class<?> clazz) {
		// TODO Auto-generated method stub
		return super.listAll("select g from Grupo", Grupo.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.csintegra.dao.AbstractDAO#listById(java.lang.Long)
	 */
	@Override
	public Grupo listById(Long id) {
		// TODO Auto-generated method stub
		return super.listById(id);
	}

}
