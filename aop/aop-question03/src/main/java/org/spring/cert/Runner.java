package org.spring.cert;

import org.spring.cert.aspect.AlternateEmployeeRepositoryAspect;
import org.spring.cert.ds.Employee;
import org.spring.cert.service.a.EmployeeRepository;
import org.spring.cert.service.b.AlternateEmployeeRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();

        EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
        AlternateEmployeeRepository alternateEmployeeRepository = context.getBean(AlternateEmployeeRepository.class);

        Employee employee = employeeRepository.findEmployeeById(10);
        employeeRepository.saveEmployee(employee);
        employeeRepository.deleteEmployee(employee);

        Employee alternateEmployee = alternateEmployeeRepository.findEmployeeById(12);
        alternateEmployeeRepository.saveEmployee(alternateEmployee);
        alternateEmployeeRepository.deleteEmployee(alternateEmployee);


    }

}
