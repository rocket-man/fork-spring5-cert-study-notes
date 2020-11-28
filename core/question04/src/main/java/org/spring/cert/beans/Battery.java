package org.spring.cert.beans;

import org.springframework.stereotype.Component;

@Component
public class Battery {
    public void switchOn(){
        System.out.println("Battery power is on");
    }
}
