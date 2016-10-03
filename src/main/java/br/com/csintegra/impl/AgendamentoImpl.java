package br.com.csintegra.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.csintegra.dao.AgendamentoDAO;
import br.com.csintegra.models.Agendamento;
import br.com.csintegra.services.AgendamentoService;

@Service("agendamento")
@Transactional
public class AgendamentoImpl extends AbstractServices<AgendamentoDAO, Agendamento> implements AgendamentoService{

	@Autowired
	AgendamentoDAO dao;

	/* (non-Javadoc)
	 * @see br.com.csintegra.services.GenericService#findByName(java.lang.String)
	 */
	@Override
	public Agendamento findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.services.GenericService#findById(java.lang.Long)
	 */

	/* (non-Javadoc)
	 * @see br.com.csintegra.services.GenericService#deleteAll()
	 */
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.impl.AbstractServices#save(java.lang.Object)
	 */
	@Override
	public void save(Agendamento entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.impl.AbstractServices#update(java.lang.Object)
	 */
	@Override
	public void update(Agendamento entity) {
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
	public List<Agendamento> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Agendamento findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

}
