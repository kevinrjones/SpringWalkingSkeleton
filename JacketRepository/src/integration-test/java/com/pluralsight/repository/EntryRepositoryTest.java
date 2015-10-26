package com.pluralsight.repository;


import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pluralsight.jacket.models.Entry;

public class EntryRepositoryTest extends AbstractTest {

		@Autowired EntryRepository repository;

		/**
		 * @since Step 2.1
		 */
		@Test
		public void findEntryById() {

			Entry entry = repository.findOne(1L);
			
			assertThat(entry, is(notNullValue()));

		}
}
