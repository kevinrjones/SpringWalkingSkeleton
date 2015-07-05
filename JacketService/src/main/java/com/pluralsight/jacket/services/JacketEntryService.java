package com.pluralsight.jacket.services;

import com.pluralsight.jacket.models.JacketEntry;

import java.util.List;

/**
 * Created by kevin on 03/07/2015.
 */
public interface JacketEntryService {

    List<JacketEntry> getAllEntries();
}
