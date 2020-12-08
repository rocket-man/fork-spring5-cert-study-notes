package org.spring.cert.definitions.custom.annotation;

import org.spring.cert.definitions.custom.annotation.service.FinancialReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.registerShutdownHook();

        // Activate profile
        context.getEnvironment().setActiveProfiles("file");
        context.register(ApplicationConfig.class);
        context.refresh();

        FinancialReportService financialReportService = context.getBean(FinancialReportService.class);

        financialReportService.generateReport();
    }
}
