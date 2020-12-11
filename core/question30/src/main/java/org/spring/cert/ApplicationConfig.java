package org.spring.cert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@ComponentScan
@Configuration
@PropertySource("application.properties")
public class ApplicationConfig {

    @Bean
    public ConversionService conversionService() {
        return new DefaultConversionService();
    }
}
