package org.spring.cert;

import org.spring.cert.report.PdfReport;
import org.spring.cert.report.TxtReport;
import org.spring.cert.report.XlsReport;

import java.nio.file.Paths;

public class Runner {
    public static void main(String[] args) {
        new PdfReport()
                .generateReport(Paths.get("report.pdf"), "report content");

        new XlsReport()
                .generateReport(Paths.get("report.xls"), "report content");

        new TxtReport()
                .generateReport(Paths.get("report.txt"), "report content");
    }
}
