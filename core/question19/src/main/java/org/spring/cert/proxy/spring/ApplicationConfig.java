package org.spring.cert.proxy.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class ApplicationConfig {
    @Bean
    public SpringBean springBean(){
        System.out.println("Creating SpringBean in " + getClass().getSimpleName());
        return new SpringBean();
    }
}
