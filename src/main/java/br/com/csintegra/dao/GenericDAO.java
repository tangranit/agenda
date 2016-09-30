package br.com.csintegra.dao;

import java.util.List;

public interface GenericDAO<T> {
	
	void save(T entity);

	void remove(Long id);

	void merge(T entity);

	List<T> listAll();

	T listById(Long id);

}
