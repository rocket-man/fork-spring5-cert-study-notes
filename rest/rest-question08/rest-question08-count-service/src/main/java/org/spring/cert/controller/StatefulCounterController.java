package org.spring.cert.controller;

import org.spring.cert.ds.CounterServiceResponse;
import org.spring.cert.service.MutableCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counter/stateful")
public class StatefulCounterController {

    @Autowired
    private MutableCounter mutableCounter;

    @PostMapping("/countUp")
    public CounterServiceResponse countUp() {
        mutableCounter.countUp();

        return new CounterServiceResponse(
                mutableCounter.getNumber()
        );
    }
}
