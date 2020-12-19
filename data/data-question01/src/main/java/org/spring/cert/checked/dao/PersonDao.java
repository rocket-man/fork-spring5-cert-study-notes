package org.spring.cert.checked.dao;

import org.spring.cert.checked.ds.Person;
import org.spring.cert.checked.exception.DaoFilesystemException;
import org.spring.cert.checked.exception.PersonInvalidException;
import org.spring.cert.checked.exception.PersonStoreException;

import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemException;

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
