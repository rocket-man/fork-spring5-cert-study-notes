package org.spring.cert.services;

import org.spring.cert.beans.ISalaryReport;
import org.spring.cert.dao.EmployeeDao;
import org.spring.cert.ds.Employee;
import org.spring.cert.ds.EmployeeSalary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeesSalariesReportService {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private EmployeeSalaryCalculator employeeSalaryCalculator;
    @Autowired
    private ISalaryReport report;

    public void generateReport(){
        List<Employee> allEmployees = employeeDao.findAll();
        List<EmployeeSalary> employeeSalaries = employeeSalaryCalculator.calculateSalaries(allEmployees);

        report.writeReport(employeeSalaries);
    }
}
