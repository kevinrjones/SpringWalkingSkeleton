package com.pluralsight.hibernate;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManagerFactory;

import org.apache.commons.logging.Log;

import com.pluralsight.repository.BaseRepository;

@Named
public class HibernateRepository<T> extends BaseRepository<T> {

	private Log log;
	
	private Class<T> keyClass;
	
	private EntityManagerFactory entityManagerFactory;

	@Inject
	public HibernateRepository(final EntityManagerFactory entityManagerFactory, Log log){
		this.entityManagerFactory = entityManagerFactory;
		this.log = log;
		
		log.debug("************** " + entityManagerFactory);
	}

	@Override
	public List<T> Entities(String query, Object[] params) {
    	System.out.println("*********** Hibernate Repository - Entities: " );
		log.debug("************** Entities");
		List<T> list = entityManagerFactory.createEntityManager().createQuery(query).getResultList();
		return list;
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
