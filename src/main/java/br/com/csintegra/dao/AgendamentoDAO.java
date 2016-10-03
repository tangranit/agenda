package br.com.csintegra.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import br.com.csintegra.models.Agendamento;

@Repository
public class AgendamentoDAO extends AbstractDAO<Agendamento> implements  GenericDAO<Agendamento>{

	/* (non-Javadoc)
	 * @see br.com.csintegra.dao.AbstractDAO#save(java.lang.Object)
	 */
	@Override
	public void save(Agendamento entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.dao.AbstractDAO#merge(java.lang.Object)
	 */
	@Override
	public void merge(Agendamento entity) {
		// TODO Auto-generated method stub
		super.merge(entity);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.dao.AbstractDAO#remove(java.lang.Long)
	 */
	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		super.remove(Agendamento.class,id);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.dao.AbstractDAO#listAll(java.lang.String, java.lang.Class)
	 */
	@Override
	public List<Agendamento> listAll() {
		// TODO Auto-generated method stub
		return super.listAll("select ag from Agendamento", Agendamento.class);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.dao.AbstractDAO#listById(java.lang.Long)
	 */
	@Override
	public Agendamento listById(Long id) {
		// TODO Auto-generated method stub
		return super.listById(Agendamento.class,id);
	}

}
