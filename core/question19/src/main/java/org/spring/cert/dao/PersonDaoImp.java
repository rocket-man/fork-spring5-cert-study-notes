package org.spring.cert.dao;

import org.spring.cert.ds.Person;

public class PersonDaoImp implements PersonDao{
    @Override
    public Person findById(int id) {
        System.out.println("Searching from person...");
        return new Person();
    }

    @Override
    public void save(Person person) {
        System.out.println("Saving person...");
    }
}
