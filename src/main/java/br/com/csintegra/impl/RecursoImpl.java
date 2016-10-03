package br.com.csintegra.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.csintegra.dao.RecursoDAO;
import br.com.csintegra.models.Recurso;
import br.com.csintegra.services.RecursoService;

@Service("recurso")
@Transactional
public class RecursoImpl extends AbstractServices<RecursoDAO, Recurso> implements RecursoService{

	@Autowired
	RecursoDAO dao;

	/* (non-Javadoc)
	 * @see br.com.csintegra.services.GenericService#findById(java.lang.Long)
	 */

	@Override
	public Recurso findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.services.RecursoService#deleteAll()
	 */
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.impl.AbstractServices#save(java.lang.Object)
	 */
	@Override
	public void save(Recurso entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.impl.AbstractServices#update(java.lang.Object)
	 */
	@Override
	public void update(Recurso entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.impl.AbstractServices#deleteById(java.lang.Long)
	 */
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.impl.AbstractServices#findAll()
	 */
	@Override
	public List<Recurso> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.impl.AbstractServices#findById(java.lang.Class, java.lang.Long)
	 */
	@Override
	public Recurso findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}
	
	
}
