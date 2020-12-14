package org.spring.cert.service.a;

import org.spring.cert.ds.Employee;

public interface EmployeeRepository {
    Employee findEmployeeById(long id);

    void saveEmployee(Employee employee);

    void deleteEmployee(Employee employee);

    void findAndUpdateEmployeeById(long id, Employee employeeToMerge);
}
