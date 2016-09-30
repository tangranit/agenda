package br.com.csintegra.services;

import java.util.List;

import br.com.csintegra.models.EventosInformacoes;

public interface InformacoesService extends GenericService<EventosInformacoes>{

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.tangramit.services.GenericService#findByName(java.lang.String)
	 */
	@Override
	EventosInformacoes findByName(String name);

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.tangramit.services.GenericService#save(java.lang.Object)
	 */
	@Override
	void save(EventosInformacoes entity);

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.tangramit.services.GenericService#update(java.lang.Object)
	 */
	@Override
	void update(EventosInformacoes entity);

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
	List<EventosInformacoes> findAll();

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.tangramit.services.GenericService#deleteAll()
	 */
	@Override
	void deleteAll();


	
}
