package org.spring.cert.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeRepositoryAspect {
    @Pointcut("within(org.spring.cert.service.*.*) || within(org.spring.cert.*)")
    public void serviceOrSamePackageRepository() {
    }

    @Before("serviceOrSamePackageRepository()")
    public void before(JoinPoint joinPoint) {
        System.out.println("before - " + joinPoint.getSignature());
    }

    @After("serviceOrSamePackageRepository()")
    public void after(JoinPoint joinPoint) {
        System.out.println("after - " + joinPoint.getSignature());
    }
}
