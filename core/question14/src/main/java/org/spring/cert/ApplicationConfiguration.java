package org.spring.cert;

import org.spring.cert.beans.SpringBean1;
import org.spring.cert.beans.SpringBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ApplicationConfiguration {

    @Bean
    public static CustomBeanPostProcessor customBeanPostProcessor(){
        return new CustomBeanPostProcessor();
    }

    @Bean(initMethod = "initMethod")
    public SpringBean1 springBean1(){
        return new SpringBean1();
    }

    @Bean(destroyMethod = "destroyMethod")
    public SpringBean2 springBean2(){
        return new SpringBean2();
    }
}
