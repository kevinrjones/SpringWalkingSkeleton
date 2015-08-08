package com.pluralsight.config;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Singleton;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//@Singleton
//public class LoggerFactory {
//    static final Log log = LogFactory.getLog(LoggerFactory.class);
//  
//   @Produces Log createLogger(InjectionPoint injectionPoint) {
//	String name = injectionPoint.getMember().getDeclaringClass().getName(); 
//	log.debug("creating Log instance for injecting into " + name); 
//      	return LogFactory.getLog(name);
//    }	
//}
