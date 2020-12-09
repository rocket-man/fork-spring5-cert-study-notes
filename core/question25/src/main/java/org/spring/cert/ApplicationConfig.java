package org.spring.cert;

import org.spring.cert.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfig {

    @Bean
    public SpringBean1 springBean1(){
        return new SpringBean1();
    }

    @Bean
    @Profile({"database", "file"})
    public SpringBean2 springBean2(){
        return new SpringBean2();
    }

    @Bean
    @Profile("database")
    public SpringBean3 springBean3(){
        return new SpringBean3();
    }

    @Bean
    @Profile("file")
    public SpringBean4 springBean4(){
        return new SpringBean4();
    }

    @Bean("!prod")
    public SpringBean5 springBean5(){
        return new SpringBean5();
    }

    @Bean("!dev")
    public SpringBean6 springBean6(){
        return new SpringBean6();
    }
}
