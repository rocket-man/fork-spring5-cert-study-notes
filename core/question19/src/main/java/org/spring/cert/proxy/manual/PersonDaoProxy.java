package org.spring.cert.proxy.manual;

import org.spring.cert.dao.PersonDao;
import org.spring.cert.ds.Person;

public class PersonDaoProxy implements PersonDao {

    private final PersonDao personDao;

    public PersonDaoProxy(PersonDao personDao){
        this.personDao = personDao;
    }

    @Override
    public Person findById(int id) {
        System.out.println("Before findById");
        Person person = this.personDao.findById(id);
        System.out.println("After findById");
        return person;
    }

    @Override
    public void save(Person person) {
        System.out.println("Before save");
        this.personDao.save(person);
        System.out.println("After save");
    }
}
