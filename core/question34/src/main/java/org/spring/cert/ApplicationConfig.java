package org.spring.cert;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@PropertySource("classpath:application.properties")
public class ApplicationConfig {
}
