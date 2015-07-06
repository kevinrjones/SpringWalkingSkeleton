package com.pluralsight.jacket.services.test;

import com.pluralsight.jacket.repository.interfaces.JacketRepository;
import com.pluralsight.jacket.services.JacketEntryServiceOnRepository;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kevin on 03/07/2015.
 */
public class JacketEntryServiceOnRepositoryTest {
    JacketRepository jacketRepository;
    JacketEntryServiceOnRepository jacketEntryServiceOnRepository;

    @Before
    public void before(){
        jacketRepository = null;
        //jacketEntryServiceOnRepository = new JacketEntryServiceOnRepository(jacketRepository);
    }

    @Test
    public void shouldReturnAllEntries() {
        
    }
}
