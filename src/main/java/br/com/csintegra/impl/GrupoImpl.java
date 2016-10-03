package br.com.csintegra.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.csintegra.dao.GrupoDAO;
import br.com.csintegra.models.Grupo;
import br.com.csintegra.services.GrupoService;

@Service("grupo")
@Transactional
public class GrupoImpl extends AbstractServices<GrupoDAO, Grupo> implements GrupoService{

	@Autowired
	GrupoDAO dao;

	/* (non-Javadoc)
	 * @see br.com.csintegra.services.GrupoService#findByName(java.lang.String)
	 */
	@Override
	public Grupo findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.services.GrupoService#deleteAll()
	 */
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.impl.AbstractServices#save(java.lang.Object)
	 */
	@Override
	public void save(Grupo entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.impl.AbstractServices#update(java.lang.Object)
	 */
	@Override
	public void update(Grupo entity) {
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
	public List<Grupo> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.impl.AbstractServices#findById(java.lang.Class, java.lang.Long)
	 */
	@Override
	public Grupo findById(Long id) {
		// TODO Auto-generated method stub
		return (Grupo) super.findById(id);
	}
	
}
