package br.com.csintegra.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public abstract class AbstractDAO<T> {

	@PersistenceContext
	EntityManager em;

	public void save(T entity) {
		em.persist(entity);
		em.refresh(entity);
	}

	public void merge(T entity) {
		em.merge(entity);
		em.refresh(entity);
	}

	public void remove(Class<?> clazz,Long id) {
		T entity = listById(clazz,id);
		em.remove(entity);
	}

	@SuppressWarnings("unchecked")
	public List<T> listAll(String criteria, Class<?> clazz) {
		Query query = em.createQuery(criteria, clazz);
		return (List<T>) query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public T listById(Class<?> clazz,Long id) {
		return (T) em.find(clazz, id);
	}

}
