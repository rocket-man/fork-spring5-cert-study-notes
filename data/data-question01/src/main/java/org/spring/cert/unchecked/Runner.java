package org.spring.cert.unchecked;

import org.spring.cert.unchecked.dao.PersonDao;
import org.spring.cert.unchecked.ds.Person;
import org.spring.cert.unchecked.exception.DaoFilesystemException;
import org.spring.cert.unchecked.exception.PersonInvalidException;
import org.spring.cert.unchecked.exception.PersonStoreException;

public class Runner {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        Person person = new Person();

        personDao.save(person);
    }
}
