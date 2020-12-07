package org.spring.cert.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.cert.ApplicationConfig;
import org.spring.cert.ds.Report;
import org.spring.cert.writer.IReportWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.spring.cert.service.ReportServiceTest04.REPORT_NAME;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
@TestPropertySource(properties = "report.global.name=" + REPORT_NAME)
public class ReportServiceTest04 {
    static final String REPORT_NAME = "Mock_Report";

    @Autowired
    private ReportService reportService;
    @MockBean
    private IReportWriter reportWriter;

    @Test
    public void shouldPassReportToWriter() {
        reportService.execute();

        verify(reportWriter).write(any(Report.class), eq(REPORT_NAME));
    }
}
