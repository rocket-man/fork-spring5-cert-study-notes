package org.spring.cert.proxy.jdk;

import org.spring.cert.dao.PersonDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonDaoInvocationHandler implements InvocationHandler {

    private final PersonDao target;

    public PersonDaoInvocationHandler(PersonDao target){
        System.out.println("Generating JDK Dynamic Proxy...");
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {

        System.out.println("Before " + method.getName());

        Object result = method.invoke(target, args);

        System.out.println("After " + method.getName());

        return result;
    }
}
