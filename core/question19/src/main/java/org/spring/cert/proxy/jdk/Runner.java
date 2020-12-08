package org.spring.cert.proxy.jdk;

import org.spring.cert.dao.PersonDao;
import org.spring.cert.dao.PersonDaoImp;
import org.spring.cert.ds.Person;

import java.lang.reflect.Proxy;

public class Runner {
    public static void main(String[] args) {

        PersonDao proxiedPersonDao = (PersonDao)Proxy.newProxyInstance(
                PersonDao.class.getClassLoader(),
                PersonDaoImp.class.getInterfaces(),
                new PersonDaoInvocationHandler(new PersonDaoImp())
        );
        Person person = proxiedPersonDao.findById(5);
        proxiedPersonDao.save(person);
    }
}
