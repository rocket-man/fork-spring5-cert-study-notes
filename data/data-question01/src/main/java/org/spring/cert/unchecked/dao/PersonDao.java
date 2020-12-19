package org.spring.cert.unchecked.dao;

import org.spring.cert.unchecked.ds.Person;
import org.spring.cert.unchecked.exception.DaoFilesystemException;
import org.spring.cert.unchecked.exception.PersonInvalidException;
import org.spring.cert.unchecked.exception.PersonStoreException;

public class PersonDao {

    public void save(Person person) throws PersonInvalidException, PersonStoreException, DaoFilesystemException {
        if(!valid(person)){
            throw new PersonInvalidException();
        }

        if(!store(person)){
            throw new PersonStoreException();
        }

        if(!filesystemActive(person)){
            throw new DaoFilesystemException();
        }
    }

    private boolean valid(Person person){
        return false;
    }

    private boolean store(Person person){
        return false;
    }

    private boolean filesystemActive(Person person){
        return false;
    }

}
