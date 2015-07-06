package com.pluralsight.jacket.services;

import com.pluralsight.jacket.models.Entry;
import com.pluralsight.jacket.models.JacketEntry;
import com.pluralsight.jacket.repository.interfaces.JacketRepository;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.logging.Log;

public class JacketEntryServiceOnRepository implements JacketEntryService {
    private JacketRepository jacketRepository;

    @Inject
    public JacketEntryServiceOnRepository(JacketRepository jacketRepository, Log logger) {
        this.jacketRepository = jacketRepository;
    }


    @Override
    public List<JacketEntry> getAllEntries() {
        List<Entry> entries = jacketRepository.Entities();
        List<JacketEntry> jacketEntries = new ArrayList<>();
        entries.forEach(e -> jacketEntries.add(new JacketEntry(e.getUrl(), e.isArchived(), e.isFavourite())));
        return jacketEntries;
    }
}

