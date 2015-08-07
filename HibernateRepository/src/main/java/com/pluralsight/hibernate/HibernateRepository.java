package com.pluralsight.hibernate;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManagerFactory;

import com.pluralsight.repository.BaseRepository;

@Named
public class HibernateRepository<T> extends BaseRepository<T> {


	private EntityManagerFactory entityManager;


	@Inject
	public void setEntityManagerFactory(final EntityManagerFactory entityManager) {
		this.entityManager = entityManager;
    	System.out.println("*********** HibernateRepository: entityManagerFactory: " + entityManager); 
	}

	@Override
	public List<T> Entities() {
		System.out.println("*********** HibernateRepository: entityManagerFactory: " + entityManager);
		return null;
	}

	@Override
	public T New() {
		return null;
	}

	@Override
	public void Add(T entity) {

	}

	@Override
	public void Create(T entity) {

	}

	@Override
	public void Delete(T entity) {

	}

	@Override
	public void Save() {

	}
}
