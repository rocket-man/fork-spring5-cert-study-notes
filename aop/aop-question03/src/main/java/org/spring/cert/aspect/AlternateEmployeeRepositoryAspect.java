package org.spring.cert.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AlternateEmployeeRepositoryAspect {

    @Before("execution(* org.spring.cert.service.b.AlternateEmployeeRepository.findEmployeeById(..))")
    public void beforeFindEmployeeById() {
        System.out.println("Service B - beforeFindEmployeeById");
    }

    @After("within(org.spring.cert.service.b.*)")
    public void afterExecutionWithinPackage() {
        System.out.println("Service B - afterExecutionWithinPackage");
    }
}
