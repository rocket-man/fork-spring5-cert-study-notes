package org.spring.cert.controller;

import org.spring.cert.ds.CounterServiceRequest;
import org.spring.cert.ds.CounterServiceResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counter/stateless")
public class StatelessCounterController {

    @PostMapping("/countUp")
    public CounterServiceResponse countUp(@RequestBody CounterServiceRequest counterServiceRequest) {
        return new CounterServiceResponse(
                counterServiceRequest.getNumber() + 1
        );
    }
}
