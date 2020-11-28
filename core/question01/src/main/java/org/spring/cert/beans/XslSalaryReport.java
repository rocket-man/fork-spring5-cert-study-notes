package org.spring.cert.beans;

import org.spring.cert.ds.EmployeeSalary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("xsl-report")
public class XslSalaryReport implements ISalaryReport {
    @Override
    public void writeReport(List<EmployeeSalary> employeeSalary) {
        System.out.println("Writing Xsl Report");
    }
}
