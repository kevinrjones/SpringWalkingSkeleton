package com.pluralsight.repository;

import javax.inject.Named;

import org.springframework.data.repository.CrudRepository;

import com.pluralsight.jacket.models.Entry;

@Named
public interface EntryRepository extends CrudRepository<Entry, Long> {
	
}
