package org.spring.cert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Runner {
    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);
    }
}

// http://localhost:8080/actuator/metrics
// http://localhost:8080/actuator/metrics/http.server.requests
// http://localhost:8080/actuator/metrics/http.server.requests?tag=status:500&tag=method:GET
