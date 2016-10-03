package br.com.csintegra.dao;

import java.util.List;

public interface GenericDAO<T> {

	void save(T entity);

	void merge(T entity);

	void remove(Long id);

	T listById(Long id);
    List<T> listAll();
}
