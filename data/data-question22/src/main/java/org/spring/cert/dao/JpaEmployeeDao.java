package org.spring.cert.dao;

import org.spring.cert.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface JpaEmployeeDao extends CrudRepository<Employee, Integer> {
}
