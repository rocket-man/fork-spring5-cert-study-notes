package org.spring.cert.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeRepositoryAspect {
    @Before("execution(* org.spring.cert.service.a.EmployeeRepository.findEmployeeById(..))")
    public void beforeFindEmployeeById() {
        System.out.println("Service A - beforeFindEmployeeById");
    }

    @After("within(org.spring.cert.service.a.*)")
    public void afterExecutionWithinPackage() {
        System.out.println("Service A - afterExecutionWithinPackage");
    }
}
