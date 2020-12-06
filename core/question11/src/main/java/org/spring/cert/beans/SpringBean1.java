package org.spring.cert.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//@Component
//@Lazy(false)
public class SpringBean1 {
    public SpringBean1(){
        System.out.println("Creating " + getClass().getSimpleName() + " - Singleton Bean");
    }
}
