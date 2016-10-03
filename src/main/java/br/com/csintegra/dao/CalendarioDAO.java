package br.com.csintegra.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.csintegra.models.Agendamento;
import br.com.csintegra.models.EventosCalendario;

@Repository
public class CalendarioDAO extends AbstractDAO<EventosCalendario> implements GenericDAO<EventosCalendario> {

	/* (non-Javadoc)
	 * @see br.com.csintegra.dao.AbstractDAO#save(java.lang.Object)
	 */
	@Override
	public void save(EventosCalendario entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.dao.AbstractDAO#merge(java.lang.Object)
	 */
	@Override
	public void merge(EventosCalendario entity) {
		// TODO Auto-generated method stub
		super.merge(entity);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.dao.AbstractDAO#remove(java.lang.Long)
	 */
	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		super.remove(EventosCalendario.class,id);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.dao.AbstractDAO#listAll(java.lang.String, java.lang.Class)
	 */
	@Override
	public List<EventosCalendario> listAll(String criteria, Class<?> clazz) {
		// TODO Auto-generated method stub
		return super.listAll(criteria, clazz);
	}

	/* (non-Javadoc)
	 * @see br.com.csintegra.dao.AbstractDAO#listById(java.lang.Long)
	 */
	@Override
	public EventosCalendario listById(Long id) {
		// TODO Auto-generated method stub
		return super.listById(Agendamento.class,id);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public List<EventosCalendario> listAll() {
		// TODO Auto-generated method stub
		return super.listAll("select c from Calendario", EventosCalendario.class);
	}
}
