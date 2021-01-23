package org.spring.cert.api.dao;

import org.spring.cert.api.ds.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersDao extends CrudRepository<Customer, Integer> {
}
