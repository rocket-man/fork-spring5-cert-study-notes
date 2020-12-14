package org.spring.cert;

import org.spring.cert.ds.Employee;
import org.springframework.stereotype.Component;

@Component
public class SamePackageEmployeeRepository {
    public void saveEmployee(Employee employee) {
    }

    protected void deleteEmployee(long id) {
    }

    void deleteEmployeeByEmail(String email) {
    }

    private void deleteEmployeeByPhone(String phone) {
        System.out.println("deleteEmployeeByPhone method called");
    }
}
