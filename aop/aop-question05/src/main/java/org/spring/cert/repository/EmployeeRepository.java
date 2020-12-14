package org.spring.cert.repository;

import org.spring.cert.ds.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepository {

    public Employee findEmployeeById(int id) {
        if(id < 0){
            throw new IllegalArgumentException("id cannot be less than 0");
        }

        return new Employee(id);
    }

    public void saveEmployee(Employee employee) {

    }


    public void deleteEmployee(Employee employee) {

    }
}
