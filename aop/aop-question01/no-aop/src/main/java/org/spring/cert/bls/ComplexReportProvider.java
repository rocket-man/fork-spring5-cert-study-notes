package org.spring.cert.bls;

import org.spring.cert.ds.Report;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class ComplexReportProvider {
    public Report getReport() throws InterruptedException {
        System.out.println("Fetching the report...");
        Thread.sleep(TimeUnit.SECONDS.toMillis(3));
        System.out.println("Report created");

        return new Report();
    }
}
