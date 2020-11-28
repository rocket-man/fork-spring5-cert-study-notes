package org.spring.cert;

import org.spring.cert.services.EmployeesSalariesReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        // the system behaviour can be change by using profiles.
        // In this case there are two profiles (1)pdf-report and (2)xsl-report
        AnnotationConfigApplicationContext context = getSpringContext("pdf-report");

        EmployeesSalariesReportService employeesSalariesReportService = context.getBean(EmployeesSalariesReportService.class);
        employeesSalariesReportService.generateReport();

        context.close();
    }

    public static AnnotationConfigApplicationContext getSpringContext(String profile){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles(profile);
        context.register(Configuration.class);
        context.refresh();
        return context;
    }
}
