package org.spring.cert.dao;

import org.spring.cert.ds.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomersDao extends CrudRepository<Customer, Integer> {
    List<Customer> findByFirstNameLike(String firstNamePattern);
}
