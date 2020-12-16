package org.spring.cert.beans;

import org.spring.cert.annotation.MonitoredRepository;
import org.spring.cert.ds.Department;
import org.springframework.stereotype.Component;

@Component
@MonitoredRepository
public class DepartmentRepository {

    public Department findDepartment(String pattern) {
        return new Department();
    }

    public void updateDepartment(int id, Department department) {
    }
}
