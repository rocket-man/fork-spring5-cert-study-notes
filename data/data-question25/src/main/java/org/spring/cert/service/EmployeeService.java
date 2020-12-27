package org.spring.cert.service;


import org.spring.cert.dao.EmployeeDao;
import org.spring.cert.ds.Employee;
import org.spring.cert.ds.EmployeeKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public void saveEmployee() {
        System.out.println("Saving employee...");

        employeeDao.save(new Employee(new EmployeeKey("John", "Doe"), "John.Doe@corp.com", "555-55-55", Date.valueOf("2019-06-05"), 70000));

        System.out.println("Employee saved");
    }

    public void listEmployee() {
        System.out.println("Searching for John Doe employee...");
        employeeDao.findById(new EmployeeKey("John", "Doe")).ifPresent(System.out::println);
    }
}
