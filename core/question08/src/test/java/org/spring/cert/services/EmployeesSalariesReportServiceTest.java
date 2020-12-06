package org.spring.cert.services;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.cert.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Configuration.class)
class EmployeesSalariesReportServiceTest {

    @Autowired
    private EmployeesSalariesReportService subject;

    @Test
    public void should_generateReport(){
        //given

        //when
        subject.generateReport();

        //then
        // Assertions to test the code works correctly

    }
}