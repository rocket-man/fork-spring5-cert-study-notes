package org.spring.cert.advanced.beans;

import org.springframework.stereotype.Component;

@Component
public class ComponentBean {
    public ComponentBean(){
        System.out.println(getClass().getSimpleName()+"::constructor");
    }
}
