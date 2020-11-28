package org.spring.cert.beans;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public void turnOn(){
        System.out.println("The engine is turning on");
    }
}
