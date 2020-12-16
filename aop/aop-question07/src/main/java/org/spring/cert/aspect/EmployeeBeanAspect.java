package org.spring.cert.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeBeanAspect {
    @Before("execution(* org.spring.cert.beans.EmployeeBean.get*()) || execution(* org.spring.cert.beans.EmployeeBean.set*(*))")
    public void beforeGetterOrSetter(JoinPoint joinPoint) {
        System.out.println("beforeGetterOrSetter " + joinPoint.getSignature());
    }
}
