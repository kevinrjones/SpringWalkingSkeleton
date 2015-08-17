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

	private EntityManagerFactory entityMarnagerFactory;

	@Inject
	public HibernateRepository(final EntityManagerFactory entityMarnagerFactory, Log log){
		this.entityMarnagerFactory = entityMarnagerFactory;
		this.log = log;
	}

	@Override
	public List<T> Entities() {
		log.debug("************** Entities");
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
