package org.spring.cert.dao;

import org.spring.cert.ds.Employee;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    Employee findByFirstNameAndLastName(String firstName, String lastName);

    List<Employee> findTop3ByOrderBySalaryDesc();

    List<Employee> findByHireDateBetween(Date min, Date max);

    List<Employee> findByOrderByHireDateDesc();
}
