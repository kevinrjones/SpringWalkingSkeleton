package com.pluralsight.jacket.services;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.pluralsight.jacket.models.Entry;
import com.pluralsight.jacket.models.JacketEntry;
import com.pluralsight.jacket.repository.implementation.EntryRepository;
import com.pluralsight.jacket.repository.interfaces.JacketRepository;

@Named
public class JacketEntryServiceOnRepository implements JacketEntryService {
    private EntryRepository entryRepository;

    @Inject
    public JacketEntryServiceOnRepository(EntryRepository jacketRepository) {
        this.entryRepository = jacketRepository;
    	System.out.println("*********** jacketRepository: " + jacketRepository);
    }


    @Override
    public List<JacketEntry> getAllEntries() {
        List<Entry> entries = entryRepository.Entities("select e from Entries e", null);
        List<JacketEntry> jacketEntries = new ArrayList<>();
        entries.forEach(e -> jacketEntries.add(new JacketEntry(e.getUrl(), e.getArchived(), e.getFavourite())));
        return jacketEntries;
    }
}

