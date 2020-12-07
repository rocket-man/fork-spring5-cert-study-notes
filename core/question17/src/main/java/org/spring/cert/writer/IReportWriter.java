package org.spring.cert.writer;

import org.spring.cert.ds.Report;

public interface IReportWriter {

    public void write(Report report, String name);
}
