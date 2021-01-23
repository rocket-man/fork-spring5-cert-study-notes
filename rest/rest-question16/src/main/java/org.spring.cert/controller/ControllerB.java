package org.spring.cert.controller;

import org.spring.cert.ds.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controllerB")
public class ControllerB {

    // @RestController annotation example

    // curl -i http://localhost:8080/controllerB/methodA
    @GetMapping("/methodA")
    public Customer methodA() {
        return new Customer("CC", "Caitlin", "Chen");
    }
}
