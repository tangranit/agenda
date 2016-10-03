package br.com.csintegra.services;


import java.util.List;

import br.com.csintegra.models.Recurso;

public interface RecursoService extends GenericService<Recurso>{

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.tangramit.services.GenericService#findByName(java.lang.String)
	 */
	@Override
	Recurso findByName(String name);

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.tangramit.services.GenericService#save(java.lang.Object)
	 */
	@Override
	void save(Recurso entity);

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.tangramit.services.GenericService#update(java.lang.Object)
	 */
	@Override
	void update(Recurso entity);

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.tangramit.services.GenericService#deleteById(java.lang.Long)
	 */
	@Override
	void deleteById(Long id);

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.tangramit.services.GenericService#findAll()
	 */
	@Override
	List<Recurso> findAll();

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.tangramit.services.GenericService#deleteAll()
	 */
	@Override
	void deleteAll();

	
}
