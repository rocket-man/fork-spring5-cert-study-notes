package org.spring.cert;

import org.spring.cert.beans.SpringBean1;
import org.spring.cert.beans.SpringBean2;
import org.spring.cert.beans.SpringBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public SpringBean1 springBean1(){
        return new SpringBean1();
    }

    @Bean(name = "2ndSpringBean")
    public SpringBean2 springBean2(){
        return new SpringBean2();
    }

    @Bean(name = {"3rdSpringBean", "thirdSpringBean"})
    public SpringBean3 springBean3(){
        return new SpringBean3();
    }
}
