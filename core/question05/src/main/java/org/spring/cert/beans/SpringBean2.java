package org.spring.cert.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringBean2 {

    public SpringBean2(){
        System.out.println(getClass().getSimpleName() + "::constructor");
    }

    @PostConstruct
    public void init(){
        System.out.println(getClass().getSimpleName() + "::init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println(getClass().getSimpleName() + "::destroy");
    }
}
