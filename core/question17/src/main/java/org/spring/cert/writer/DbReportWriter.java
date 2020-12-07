package org.spring.cert.writer;

import org.spring.cert.ds.Report;
import org.springframework.stereotype.Component;

@Component
public class DbReportWriter implements IReportWriter{
    @Override
    public void write(Report report, String name) {

    }
}
