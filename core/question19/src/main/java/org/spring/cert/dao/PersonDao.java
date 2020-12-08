package org.spring.cert.dao;

import org.spring.cert.ds.Person;

public interface PersonDao {
    Person findById(int id);

    void save(Person person);
}
