package com.pluralsight.jacket.services;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.logging.Log;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.jacket.models.Entry;
import com.pluralsight.jacket.models.JacketEntry;
import com.pluralsight.repository.EntryRepository;

@Named
@Transactional(readOnly = true)
public class JacketEntryServiceOnRepository implements JacketEntryService {

	EntryRepository repository;
	Log log;
	
    @Inject
    public JacketEntryServiceOnRepository(EntryRepository repository, Log log) {
    	this.repository = repository;
    	this.log = log;
    }


    @Override
    public List<JacketEntry> getAllEntries() {
    	Iterable<Entry> entries = repository.findAll();
    	List<JacketEntry> serviceEntries = new LinkedList<JacketEntry>(); 
    	if(entries != null)
    	{
    		entries.forEach(e -> serviceEntries.add(new JacketEntry(e.getUrl())));
    	}
    	else
    	{
    		log.debug("*********** repository return null");
    	}
    	return serviceEntries;
    }


	@Override
	@Transactional(readOnly = false)
	public void updateEntry(JacketEntry e) {
		
	}
}

