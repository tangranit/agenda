package br.com.csintegra.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.csintegra.dao.InformacoesDAO;
import br.com.csintegra.models.EventosInformacoes;

@Service("informacoes")
@Transactional
public class InformacoesImpl extends AbstractServices<InformacoesDAO, EventosInformacoes> implements InformacoesService{

	@Autowired
	InformacoesDAO dao;
	
	/* (non-Javadoc)
	 * @see br.com.csintegra.services.GenericService#findById(java.lang.Long)
	 */
	@Override
	public EventosInformacoes findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.services.InformacoesService#findByName(java.lang.String)
	 */
	@Override
	public EventosInformacoes findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.services.InformacoesService#deleteAll()
	 */
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.services.AbstractServices#save(java.lang.Object)
	 */
	@Override
	public void save(EventosInformacoes entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.services.AbstractServices#update(java.lang.Object)
	 */
	@Override
	public void update(EventosInformacoes entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.services.AbstractServices#deleteById(java.lang.Long)
	 */
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.services.AbstractServices#findAll()
	 */
	@Override
	public List<EventosInformacoes> findAll() {

		return super.findAll();
	}

	
}
