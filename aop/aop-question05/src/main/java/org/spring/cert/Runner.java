package org.spring.cert;

import org.spring.cert.repository.EmployeeRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();

        EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);

        employeeRepository.findEmployeeById(10);

        try{
            employeeRepository.findEmployeeById(-1);
        }catch(Exception e){
            //ignored in purpose
        }


    }

}
