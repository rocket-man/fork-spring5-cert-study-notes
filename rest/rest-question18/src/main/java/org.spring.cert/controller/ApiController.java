package org.spring.cert.controller;

import org.spring.cert.ds.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    // curl http://localhost:8080/api/methodA
    @GetMapping(value = "/methodA")
    public Customer methodA() {
        return new Customer("CC", "Caitlin", "Chen");
    }
}
