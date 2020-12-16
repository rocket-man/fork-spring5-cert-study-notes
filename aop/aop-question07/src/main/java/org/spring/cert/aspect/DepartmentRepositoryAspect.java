package org.spring.cert.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DepartmentRepositoryAspect {
    @Before("@within(org.spring.cert.annotation.MonitoredRepository)")
    public void annotationWithinExample() {
        System.out.println("Before - annotationWithinExample");
    }

    @Before("@target(org.spring.cert.annotation.MonitoredRepository)")
    public void annotationTargetExample() {
        System.out.println("Before - annotationTargetExample");
    }
}
