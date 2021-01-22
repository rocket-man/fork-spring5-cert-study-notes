package org.spring.cert.controller;

import org.spring.cert.dao.AddressesDao;
import org.spring.cert.dao.CustomersDao;
import org.spring.cert.ds.Address;
import org.spring.cert.ds.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v2")
public class ApiControllerV2 {

    @Autowired
    private CustomersDao customersDao;
    @Autowired
    private AddressesDao addressesDao;

    // curl localhost:8080/api/v2/customers |jq
    @GetMapping("customers")
    @ResponseBody
    public Iterable<Customer> listCustomers() {
        return customersDao.findAll();
    }

    // curl localhost:8080/api/v2/addresses |jq
    @GetMapping("addresses")
    @ResponseBody
    public Iterable<Address> listAddresses() {
        return addressesDao.findAll();
    }
}
