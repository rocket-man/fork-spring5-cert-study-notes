package org.spring.cert.simple.beans;

import org.springframework.stereotype.Repository;

@Repository
public class DaoBean {
    public DaoBean(){
        System.out.println(getClass().getSimpleName()+"::constructor");
    }
}
