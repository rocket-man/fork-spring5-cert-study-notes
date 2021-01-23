package org.spring.cert.controller;

import org.spring.cert.ds.Customer;
import org.spring.cert.ds.CustomerStatistics;
import org.spring.cert.service.CustomerStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatisticsControllerV2 {

    @Autowired
    private CustomerStatisticsService customerStatisticsService;

    // curl -v -X POST -H 'Content-Type: application/json' -d '{ "code": "CS", "firstName": "Christine", "lastName": "Smart" }' http://localhost:8080/api/v2/calculateStatistics
    @PostMapping("/api/v2/calculateStatistics")
    public CustomerStatistics getStatistics(@RequestBody Customer customer) {
        return new CustomerStatistics(
                customer, customerStatisticsService.calculcateStatistics(customer)
        );
    }
}
