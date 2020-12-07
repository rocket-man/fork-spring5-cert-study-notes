package org.spring.cert.simple.beans;

import org.springframework.stereotype.Controller;

@Controller
public class ControllerBean {
    public ControllerBean(){
        System.out.println(getClass().getSimpleName()+"::constructor");
    }
}
