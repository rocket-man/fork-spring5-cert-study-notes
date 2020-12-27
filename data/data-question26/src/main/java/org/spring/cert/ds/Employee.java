package org.spring.cert.ds;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.sql.Date;


@Entity
public class Employee {
    @EmbeddedId
    private EmployeeKey employeeKey;
    private String email;
    private String phoneNumber;
    private Date hireDate;
    private float salary;

    @SuppressWarnings("unused")
    public Employee() {
    }

    public Employee(EmployeeKey employeeKey, String email, String phoneNumber, Date hireDate, float salary) {
        this.employeeKey = employeeKey;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public EmployeeKey getEmployeeKey() {
        return employeeKey;
    }

    public void setEmployeeKey(EmployeeKey employeeKey) {
        this.employeeKey = employeeKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeKey=" + employeeKey +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                '}';
    }
}
