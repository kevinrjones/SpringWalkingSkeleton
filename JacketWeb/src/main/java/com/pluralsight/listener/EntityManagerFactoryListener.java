package com.pluralsight.listener;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class EntityManagerFactoryListener  implements ServletContextListener {

    private static EntityManagerFactory entityManagerFactory;

    @Override
    public void contextInitialized(ServletContextEvent event) {
        entityManagerFactory = Persistence.createEntityManagerFactory("jacket");
    	System.out.println("*********** EntityManagerFactoryListener - contextInitialized: " + entityManagerFactory); 
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        entityManagerFactory.close();
    }

    @Produces
    public EntityManager createEntityManager() {
    	System.out.println("*********** EntityManagerFactoryListener - createEntityManager: "); 
        if (entityManagerFactory == null) {
            throw new IllegalStateException("Context is not initialized yet.");
        }

        return entityManagerFactory.createEntityManager();
    }

}