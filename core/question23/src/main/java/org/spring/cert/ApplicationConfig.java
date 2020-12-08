package org.spring.cert;

import org.spring.cert.beans.SpringBean1;
import org.spring.cert.beans.SpringBean2;
import org.spring.cert.beans.SpringBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfig {

    @Bean
    public SpringBean1 springBean1(){
        System.out.println("Creating Bean " + SpringBean1.class.getSimpleName());
        return new SpringBean1();
    }

    @Bean
    @Scope("prototype")
    public SpringBean2 springBean2(){
        System.out.println("Creating Bean " + SpringBean2.class.getSimpleName());
        return new SpringBean2();
    }

}
