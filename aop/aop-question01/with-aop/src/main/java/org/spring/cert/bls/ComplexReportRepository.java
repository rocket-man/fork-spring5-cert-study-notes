package org.spring.cert.bls;

import org.spring.cert.annotations.PerformanceLogger;
import org.spring.cert.ds.Report;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class ComplexReportRepository {

    @PerformanceLogger
    public void save(Report report) throws InterruptedException {
        System.out.println("Saving the report...");
        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        System.out.println("Report saved");
    }
}
