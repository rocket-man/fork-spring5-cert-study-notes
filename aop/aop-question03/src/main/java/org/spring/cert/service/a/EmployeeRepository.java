package org.spring.cert.service.a;

import org.spring.cert.ds.Employee;

public interface EmployeeRepository {

    public Employee findEmployeeById(int foo);

    public void saveEmployee(Employee employee);

    public void deleteEmployee(Employee employee);
}
