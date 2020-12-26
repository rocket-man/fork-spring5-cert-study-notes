package org.spring.cert;


import org.spring.cert.dao.EmployeeDao;
import org.spring.cert.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@EnableAspectJAutoProxy
public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Runner.class);
        context.registerShutdownHook();

        EmployeeService employeeService = context.getBean(EmployeeService.class);
        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);

        try {
            employeeService.operationsWithAutoCommit();
        } catch (Exception e) {
            System.err.println(String.format("Exception occurred: %s: %s", e.getClass().getSimpleName(), e.getMessage()));
        }
        employeeService.findAllEmployees();

        employeeDao.deleteAllEmployees();
        System.out.println("\n\n");

        try {
            employeeService.operationsWithoutAutoCommit();
        } catch (Exception e) {
            System.err.println(String.format("Exception occurred: %s: %s", e.getClass().getSimpleName(), e.getMessage()));
        }
        employeeService.findAllEmployees();
    }
}
