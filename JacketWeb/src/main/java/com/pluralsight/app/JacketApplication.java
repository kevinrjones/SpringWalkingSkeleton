package com.pluralsight.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.pluralsight")
public class JacketApplication {

    public static void main(String[] args) {
        SpringApplication.run(JacketApplication.class, args);
    }
}
