package org.spring.cert.dao.custom;


import org.spring.cert.ds.Employee;

public interface CustomEmployeeFindRepository {
    Employee findByFirstNameAndLastName(String firstName, String lastName);
}
