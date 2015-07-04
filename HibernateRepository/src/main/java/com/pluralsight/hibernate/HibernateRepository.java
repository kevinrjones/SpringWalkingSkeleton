package com.pluralsight.hibernate;

import com.pluralsight.repository.BaseRepository;
import org.hibernate.SessionFactory;

import java.util.List;

public class HibernateRepository<T> extends BaseRepository<T> {

    private SessionFactory factory;

    public HibernateRepository(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public List<T> Entities() {
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
