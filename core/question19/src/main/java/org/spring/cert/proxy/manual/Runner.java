package org.spring.cert.proxy.manual;

import org.spring.cert.dao.PersonDao;
import org.spring.cert.dao.PersonDaoImp;
import org.spring.cert.ds.Person;

public class Runner {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDaoImp();

        PersonDaoProxy personDaoProxy = new PersonDaoProxy(personDao);
        Person person = personDaoProxy.findById(5);
        personDaoProxy.save(person);

//        Person person = personDao.findById(5);
//        personDao.save(person);
    }
}
