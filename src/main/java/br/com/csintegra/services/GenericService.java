package br.com.csintegra.services;

import java.util.List;




public interface GenericService<T> {

	T findByName(String name);

	void save(T entity);

	void update(T entity);

	void deleteById(Long id);

	List<T> findAll();

	void deleteAll();
	
	T findById(Long id);

}
