package org.spring.cert.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
//@Component
public class HelloBeanAspect {

    @Pointcut("within(org.spring.cert.beans.*)")
    public void withinBeansPackage(){
    }

    @Before("withinBeansPackage()")
    public void before(JoinPoint jointPoint){
        System.out.println("before - " + jointPoint.getSignature().toShortString());
    }

    @After("withinBeansPackage()")
    public void after(JoinPoint jointPoint){
        System.out.println("after - " + jointPoint.getSignature().toShortString());

    }

}
