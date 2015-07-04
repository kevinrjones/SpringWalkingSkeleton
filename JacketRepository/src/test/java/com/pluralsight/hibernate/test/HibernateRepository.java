package com.pluralsight.hibernate.test;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Assert;
import org.junit.Test;

public class HibernateRepository {

    @Test
    public void shouldCreateASession(){
        try {
            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            sessionFactory.close();
        } catch(HibernateException e){
            Assert.fail();
        }
    }
}
