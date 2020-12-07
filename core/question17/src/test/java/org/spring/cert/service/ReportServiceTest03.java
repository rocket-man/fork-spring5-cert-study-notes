package org.spring.cert.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.spring.cert.ds.Report;
import org.spring.cert.writer.IReportWriter;
import org.springframework.test.util.ReflectionTestUtils;

@RunWith(MockitoJUnitRunner.class)
public class ReportServiceTest03 {

    private ReportService subject;

    @Before
    public void setUp(){
        subject = new ReportService();
    }

    @Test
    public void should_passReportToWriter(){
        IReportWriter reportWriter = Mockito.mock(IReportWriter.class);

        ReflectionTestUtils.setField(subject, ReportService.class,
                "reportWriter",reportWriter, IReportWriter.class);

        subject.execute();

        Mockito.verify(reportWriter).write(Mockito.any(Report.class), Mockito.any());
    }
}