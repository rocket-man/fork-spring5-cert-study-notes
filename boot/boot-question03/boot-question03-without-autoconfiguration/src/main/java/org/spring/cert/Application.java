package org.spring.cert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

// use the following url localhost:8080/h2-console to connect to h2 db console
// check the url to connect to in the commons login of spring boot ie: url='jdbc:h2:mem:testdb
