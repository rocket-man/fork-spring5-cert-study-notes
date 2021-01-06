package org.spring.cert.ds;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeePutRequest {
    private String name;
    private String city;

    @SuppressWarnings("unused")
    public EmployeePutRequest() {
    }
}
