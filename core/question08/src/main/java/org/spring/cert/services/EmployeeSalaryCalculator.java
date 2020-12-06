package org.spring.cert.services;

import org.spring.cert.ds.Employee;
import org.spring.cert.ds.EmployeeSalary;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class EmployeeSalaryCalculator {
    public List<EmployeeSalary> calculateSalaries(List<Employee> list){
        System.out.println("Calculating salaries");
        return Collections.emptyList();
    }
}
