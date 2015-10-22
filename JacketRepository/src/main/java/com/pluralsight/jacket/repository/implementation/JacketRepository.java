package com.pluralsight.jacket.repository.implementation;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.pluralsight.jacket.models.Entry;
import com.pluralsight.repository.BaseRepository;
import com.pluralsight.repository.IRepository;

public class JacketRepository<T> implements IRepository<T> {

    private BaseRepository<Entry> baseRepository;

    public JacketRepository(BaseRepository<Entry> baseRepository) {
    	this.baseRepository = baseRepository;
    	System.out.println("*********** JacketRepository - baseRepository: " + baseRepository);
    }
    

    @Override
    public List<T> Entities(String query, Object[] params) {
    	System.out.println("*********** JacketRepository - Entities: " );
    	List<T> entities =  (List<T>) baseRepository.Entities("select e from " + Entry.class.getName() + " e", params);

    	System.out.println("*********** JacketRepository - Entities: " + entities.size() );
    	return entities;
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
