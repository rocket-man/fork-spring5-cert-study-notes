package org.spring.cert.dao.custom;

import org.spring.cert.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface CustomEmployeeDao extends CrudRepository<Employee, Integer>, CustomEmployeeFindRepository {
}
