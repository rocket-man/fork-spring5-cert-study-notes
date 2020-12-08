package org.spring.cert.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DepartmentDaoMethodInterceptor implements MethodInterceptor {

    public DepartmentDaoMethodInterceptor(){
        System.out.println("Generating CGLIB Proxy...");
    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before " + method.getName());

        Object result = methodProxy.invokeSuper(object, args);

        System.out.println("After " + method.getName());

        return result;
    }
}
