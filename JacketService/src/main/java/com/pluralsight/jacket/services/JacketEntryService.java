package com.pluralsight.jacket.services;

import java.util.List;

import com.pluralsight.jacket.models.JacketEntry;

/**
 * Created by kevin on 03/07/2015.
 */
public interface JacketEntryService {

    List<JacketEntry> getAllEntries();
    void updateEntry(JacketEntry entry);
}
