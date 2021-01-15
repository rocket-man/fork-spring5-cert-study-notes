package org.spring.cert.dao;

import org.spring.cert.ds.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressesDao extends CrudRepository<Address, Integer> {
}
