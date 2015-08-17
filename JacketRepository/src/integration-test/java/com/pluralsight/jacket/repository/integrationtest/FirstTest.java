/**
 * 
 */
package com.pluralsight.jacket.repository.integrationtest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.pluralsight.jacket.models.User;

/**
 * @author kevin
 *
 */
public class FirstTest {

	EntityManagerFactory factory;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		factory = Persistence.createEntityManagerFactory("jacketTest");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		User user = new User();
		user.setEMail("email");
		user.setName("Name");
		user.setPassword("Password");
		
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist( user );

		User userFound = entityManager.find(User.class, 0);
		Assert.assertNotNull(userFound);
		Assert.assertEquals(userFound.getName(), "Name");

		entityManager.getTransaction().rollback();
		entityManager.close();
	}

}
