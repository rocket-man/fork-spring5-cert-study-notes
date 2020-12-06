package org.spring.cert.beans;

import org.spring.cert.ds.EmployeeSalary;

import java.util.List;

public interface ISalaryReport {
    void writeReport(List<EmployeeSalary> employeeSalary);
}
