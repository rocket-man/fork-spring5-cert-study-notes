package org.spring.cert.defined.configuration;

import org.spring.cert.beans.SpringBean1;
import org.spring.cert.beans.SpringBean2;
import org.spring.cert.beans.SpringBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationStatic {

    @Bean
    public SpringBean1 getSpringBean1(){
        return new SpringBean1();
    }

    @Bean
    public SpringBean2 getSpringBean2(){
        return new SpringBean2();
    }

    @Bean
    public SpringBean3 getSpringBean3(){
        return new SpringBean3();
    }
}
