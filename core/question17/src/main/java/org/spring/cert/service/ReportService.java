package org.spring.cert.service;

import org.spring.cert.ds.Report;
import org.spring.cert.writer.IReportWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReportService {

    @Autowired
    private IReportWriter reportWriter;
    @Value("${report.global.name}")
    private String reportGlobalName;

    public void execute(){
        Report report = new Report();

        //...
        reportWriter.write(report, reportGlobalName);

    }

}
