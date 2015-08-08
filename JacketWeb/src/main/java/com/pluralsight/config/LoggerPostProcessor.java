package com.pluralsight.config;

import java.lang.reflect.Field;

import javax.inject.Inject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

public class LoggerPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(final Object bean, String beanName) throws BeansException {
     ReflectionUtils.doWithFields(bean.getClass(), new ReflectionUtils.FieldCallback() {
         public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
             if (field.getAnnotation(Inject.class) != null && field.getType().equals(Log.class)) {
                 ReflectionUtils.makeAccessible(field);
                 field.set(bean, LogFactory.getLog(bean.getClass()));
             }
         }
       });

       return bean;
    }
    
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
         return bean;
    }
}