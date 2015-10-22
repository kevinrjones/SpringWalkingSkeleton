package com.pluralsight.jacket.repository.implementation;

import javax.inject.Inject;
import javax.inject.Named;

import com.pluralsight.jacket.models.Entry;
import com.pluralsight.repository.BaseRepository;

@Named
public class EntryRepository extends JacketRepository<Entry> {

    @Inject
	public EntryRepository(BaseRepository<Entry> baseRepository) {
		super(baseRepository);
    	System.out.println("*********** EntryRepository");
	}

}
