package org.spring.cert.dao;


import org.spring.cert.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
}
