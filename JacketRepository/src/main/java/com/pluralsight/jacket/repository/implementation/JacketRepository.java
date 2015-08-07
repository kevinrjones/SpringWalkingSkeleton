package com.pluralsight.jacket.repository.implementation;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.pluralsight.jacket.models.Entry;
import com.pluralsight.repository.BaseRepository;

@Named
public class JacketRepository implements com.pluralsight.jacket.repository.interfaces.JacketRepository {

    private BaseRepository<Entry> baseRepository;

    @Inject
    public JacketRepository(BaseRepository<Entry> baseRepository) {
    	this.baseRepository = baseRepository;
    	System.out.println("*********** JacketRepository - baseRepository: " + baseRepository);
    }
    

    @Override
    public List<Entry> Entities() {
    	baseRepository.Entities();
        return new ArrayList<Entry>();
    }

    @Override
    public Entry New() {
        return null;
    }

    @Override
    public void Add(Entry entity) {

    }

    @Override
    public void Create(Entry entity) {

    }

    @Override
    public void Delete(Entry entity) {

    }

    @Override
    public void Save() {

    }
}
