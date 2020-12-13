package org.spring.cert.bls;


import org.spring.cert.ds.FormattedReport;
import org.spring.cert.ds.Report;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class ComplexReportFormatter {
    public FormattedReport formatReport(Report report) throws InterruptedException {
        System.out.println("Formatting the report...");
        Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        System.out.println("Report Formatted");

        return new FormattedReport(report);
    }
}
