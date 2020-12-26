package org.spring.cert.db.employees.dao;

import org.spring.cert.db.employees.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
}
