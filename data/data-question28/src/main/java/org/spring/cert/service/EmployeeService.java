package org.spring.cert.service;


import org.spring.cert.dao.custom.CustomEmployeeDao;
import org.spring.cert.dao.regular.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CustomEmployeeDao customEmployeeDao;

    public void queryEmployee() {
        System.out.println("Searching for John Doe employee with SimpleJpa implementation...");
        System.out.println(
                employeeDao.findByFirstNameAndLastName("John", "Doe")
        );

        System.out.println("Searching for John Doe employee with custom dao implementation...");
        System.out.println(
                customEmployeeDao.findByFirstNameAndLastName("John", "Doe")
        );
    }
}
