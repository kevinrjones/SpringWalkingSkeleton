package com.pluralsight.jacket.repository.implementation;

import com.pluralsight.jacket.models.Entry;
import com.pluralsight.repository.BaseRepository;

import java.util.List;

public class JacketRepository implements com.pluralsight.jacket.repository.interfaces.JacketRepository {

    // injected?
    private BaseRepository<Entry> baseRepository;


    @Override
    public List<Entry> Entities() {
        return null;
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
