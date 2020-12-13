package org.spring.cert.actions;


import org.spring.cert.bls.ComplexReportFormatter;
import org.spring.cert.bls.ComplexReportProvider;
import org.spring.cert.bls.ComplexReportRepository;
import org.spring.cert.ds.FormattedReport;
import org.spring.cert.ds.Report;
import org.spring.cert.logger.PerformanceLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComplexReportAction {

    @Autowired
    private ComplexReportProvider complexReportProvider;
    @Autowired
    private ComplexReportFormatter complexReportFormatter;
    @Autowired
    private ComplexReportRepository complexReportRepository;
    @Autowired
    private PerformanceLogger performanceLogger;

    public void perform() throws InterruptedException {
        Report report = complexReportProvider.getReport();
        FormattedReport formattedReport = complexReportFormatter.formatReport(report);
        complexReportRepository.save(formattedReport);

        report = complexReportProvider.getReport();
    }
}
