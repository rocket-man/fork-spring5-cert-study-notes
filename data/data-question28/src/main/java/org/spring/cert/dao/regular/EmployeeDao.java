package org.spring.cert.dao.regular;

import org.spring.cert.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    Employee findByFirstNameAndLastName(String firstName, String lastName);
}
