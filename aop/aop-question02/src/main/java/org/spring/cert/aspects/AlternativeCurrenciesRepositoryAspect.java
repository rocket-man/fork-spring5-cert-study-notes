package org.spring.cert.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AlternativeCurrenciesRepositoryAspect {
    @Before("this(org.spring.cert.bls.AlternativeCurrenciesRepository)")
    public void beforeThisCurrenciesRepository() {
        System.out.println("Before - this(AlternativeCurrenciesRepository)");
    }

    @Before("target(org.spring.cert.bls.AlternativeCurrenciesRepository)")
    public void beforeTargetCurrenciesRepository() {
        System.out.println("Before - target(AlternativeCurrenciesRepository)");
    }
}
