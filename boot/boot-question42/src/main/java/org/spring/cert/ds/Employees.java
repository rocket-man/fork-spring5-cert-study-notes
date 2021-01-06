package org.spring.cert.ds;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.spring.cert.entity.Employee;

@Data
@AllArgsConstructor
public class Employees {
    private Iterable<Employee> employees;

    @SuppressWarnings("unused")
    public Employees() {
    }
}
