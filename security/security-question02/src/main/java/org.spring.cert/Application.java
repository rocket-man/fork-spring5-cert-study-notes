package org.spring.cert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    // Spring Security Code Places to analyze: add breakpoints in the classes below
    // DelegatingFilterProxy.doFilter
    // FilterChainProxy.doFilterInternal
    // ProviderManager.authenticate
    // AffirmativeBased.decide
    // RoleVoter.vote
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
