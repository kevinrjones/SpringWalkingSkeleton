package com.pluralsight.jacket.services.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.junit.Before;
import org.junit.Test;

import com.pluralsight.jacket.models.Entry;
import com.pluralsight.jacket.models.JacketEntry;
import com.pluralsight.jacket.services.JacketEntryServiceOnRepository;
import com.pluralsight.repository.EntryRepository;

/**
 * Created by Kevin on 03/07/2015.
 */
public class JacketEntryServiceOnRepositoryTest {
    JacketEntryServiceOnRepository jacketEntryServiceOnRepository;
    EntryRepository repository;
    Log log;
    
    @Before
    public void before(){
        repository = mock(EntryRepository.class);
        log = mock(Log.class);
    }

    @Test
    public void shouldReturnAllEntries() {    

        when(repository.findAll()).thenReturn(Arrays.asList(new Entry()));
        
        JacketEntryServiceOnRepository service = new JacketEntryServiceOnRepository(repository, log);
        List<JacketEntry> entries = service.getAllEntries();

        assertThat(entries.size()).isEqualTo(1);
    }
}
