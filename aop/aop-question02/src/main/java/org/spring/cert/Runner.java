package org.spring.cert;

import org.spring.cert.bls.AlternativeCurrenciesRepository;
import org.spring.cert.bls.CurrenciesRepository;
import org.spring.cert.bls.CurrencyService;
import org.spring.cert.ds.CurrencyId;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();

        CurrencyService currencyService = context.getBean(CurrencyService.class);
        CurrenciesRepository currenciesRepository = context.getBean(CurrenciesRepository.class);
        AlternativeCurrenciesRepository alternativeCurrenciesRepository = context.getBean(AlternativeCurrenciesRepository.class);

        currencyService.getExchangeRate("EUR", "USD");
        currencyService.getExchangeRate("EUR", "USD", 100);
        currencyService.getCurrencyLongName(CurrencyId.EUR);
        try {
            currencyService.getCurrencyCountryName(CurrencyId.EUR);
        } catch (Exception e) {
            // ignored on purpose
        }
        currencyService.getCurrencyCountryName(CurrencyId.USD);
        currenciesRepository.getCurrenciesCount();
        alternativeCurrenciesRepository.getCurrenciesCount();

    }
}
