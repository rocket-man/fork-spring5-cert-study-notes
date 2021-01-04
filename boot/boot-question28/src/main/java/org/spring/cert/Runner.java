package org.spring.cert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Runner {
    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);
    }
}

// after staring up the server go to the following endpoint
// http://localhost:8080/actuator/

// the command below changes the logging level for the given package.
// curl -i -X POST -H 'Content-Type: application/json' -d '{"configuredLevel": "DEBUG"}' http://localhost:8080/actuator/loggers/org.spring.cert