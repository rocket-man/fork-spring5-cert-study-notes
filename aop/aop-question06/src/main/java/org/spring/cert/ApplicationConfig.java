package org.spring.cert;

import org.spring.cert.aspect.HelloBeanAspect;
import org.spring.cert.beans.HelloBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
//@ComponentScan
public class ApplicationConfig {

    @Bean
    public HelloBean helloBean(){
        return new HelloBean();
    }

    @Bean
    public HelloBeanAspect helloBeanAspect(){
        return new HelloBeanAspect();
    }
}
