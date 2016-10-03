package br.com.csintegra.services;

import java.util.List;

import br.com.csintegra.models.Grupo;

public interface GrupoService extends GenericService<Grupo>{

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.tangramit.services.GenericService#findByName(java.lang.String)
	 */
	@Override
	Grupo findByName(String name);

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.tangramit.services.GenericService#save(java.lang.Object)
	 */
	@Override
	void save(Grupo entity);

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.tangramit.services.GenericService#update(java.lang.Object)
	 */
	@Override
	void update(Grupo entity);

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
	List<Grupo> findAll();

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.tangramit.services.GenericService#deleteAll()
	 */
	@Override
	void deleteAll();

	/* (non-Javadoc)
	 * @see br.com.csintegra.services.GenericService#findById(java.lang.Long)
	 */
	@Override
	Grupo findById(Long id);
	


}
