package org.spring.cert.service.a;

import org.spring.cert.ds.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepositoryImpl implements EmployeeRepository{
    @Override
    public Employee findEmployeeById(int foo) {
        return new Employee();
    }

    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Employee employee) {

    }
}
