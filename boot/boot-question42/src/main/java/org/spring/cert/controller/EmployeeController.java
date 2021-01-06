package org.spring.cert.controller;

import org.spring.cert.dao.CityDao;

import org.spring.cert.dao.EmployeeDao;
import org.spring.cert.ds.EmployeePutRequest;
import org.spring.cert.ds.Employees;
import org.spring.cert.entity.City;
import org.spring.cert.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CityDao cityDao;

    @GetMapping("/employees")
    public Employees getEmployees() {
        return new Employees(employeeDao.findAll());
    }

    @PutMapping("/employees")
    public void putEmployee(@RequestBody EmployeePutRequest employeePutRequest) {
        String requestedCity = employeePutRequest.getCity();
        Optional<City> city = cityDao.findByName(requestedCity);

        City employeeCity = city.orElseThrow(
                () -> new ResponseStatusException(HttpStatus.BAD_REQUEST, String.format("Employee City [%s] not found", requestedCity))
        );

        employeeDao.save(new Employee(employeePutRequest.getName(), employeeCity));
    }
}