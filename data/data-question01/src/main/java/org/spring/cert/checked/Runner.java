package org.spring.cert.checked;

import org.spring.cert.checked.dao.PersonDao;
import org.spring.cert.checked.ds.Person;
import org.spring.cert.checked.exception.DaoFilesystemException;
import org.spring.cert.checked.exception.PersonInvalidException;
import org.spring.cert.checked.exception.PersonStoreException;

public class Runner {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        Person person = new Person();

        try{
            personDao.save(person);
        }catch(PersonInvalidException e){
            //handle ex
        }catch(PersonStoreException e){
            //handle ex
        }catch(DaoFilesystemException e){
            //handle ex
        }
    }
}
