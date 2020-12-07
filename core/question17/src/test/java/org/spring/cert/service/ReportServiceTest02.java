package org.spring.cert.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.spring.cert.ApplicationConfig;
import org.spring.cert.ds.Report;
import org.spring.cert.writer.IReportWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(MockitoJUnitRunner.class)
public class ReportServiceTest02 {
    @InjectMocks
    private ReportService subject;
    @Mock
    private IReportWriter reportWriter;

    @Test
    public void should_passReportToWriter(){
        subject.execute();

        Mockito.verify(reportWriter).write(Mockito.any(Report.class), Mockito.any());
    }
}