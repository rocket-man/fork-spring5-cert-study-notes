package org.spring.cert.service.b;

import org.spring.cert.ds.Employee;
import org.springframework.stereotype.Component;

@Component
public class AlternateEmployeeRepository {
    public Employee findEmployeeById(long id) {
        return new Employee();
    }

    public void saveEmployee(Employee employee) {
    }

    public void deleteEmployee(Employee employee) {
    }
}
