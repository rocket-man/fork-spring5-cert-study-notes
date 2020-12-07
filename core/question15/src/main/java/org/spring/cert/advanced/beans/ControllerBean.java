package org.spring.cert.advanced.beans;

import org.springframework.stereotype.Controller;

@Controller
public class ControllerBean {
    public ControllerBean(){
        System.out.println(getClass().getSimpleName()+"::constructor");
    }
}
