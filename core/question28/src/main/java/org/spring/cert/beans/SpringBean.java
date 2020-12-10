package org.spring.cert.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class SpringBean {

    @Value("${app.department.name}")
    private String name;

    @Value("#{'Wall Street'.toUpperCase()}")
    private String streetName;

    @Value("true")
    private boolean accountExists;

    @Value("100")
    private int idNumber;

    @Value("#{5000 * 0.9}")
    private float accountBalance;

    @Value("${app.department.id}")
    private int departmentId;

    @Value("#{'${app.department.id}'.toUpperCase()}")
    private String departmentName;

    private String managerName;
    private String supportContactMail;
    private String supportPhone;
    private String supportAddress;

    @Value("${app.dependent.departments}")
    private String[] dependentDepartments;

    @Value("${app.cases.id}")
    private List<Integer> casesList;

    @Value("${app.cases.set}")
    private Set<String> casesSet;

    @Value("#{${app.cases.map}}")
    private Map<String, Integer> casesMap;


    public SpringBean(@Value("#{'${app.manager.name}'.toUpperCase()}") String managerName) {
        this.managerName = managerName;
    }

    @Value("${app.support.contact}")
    public void setSupportContactMail(String supportContactMail) {
        this.supportContactMail = supportContactMail;
    }

    @Autowired
    public void setSupportPhoneAndAddress(@Value("${app.support.phone}") String supportPhone, @Value("${app.support.address}") String supportAddress) {
        this.supportPhone = supportPhone;
        this.supportAddress = supportAddress;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public boolean isAccountExists() {
        return accountExists;
    }

    public void setAccountExists(boolean accountExists) {
        this.accountExists = accountExists;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getSupportContactMail() {
        return supportContactMail;
    }

    public String getSupportPhone() {
        return supportPhone;
    }

    public void setSupportPhone(String supportPhone) {
        this.supportPhone = supportPhone;
    }

    public String getSupportAddress() {
        return supportAddress;
    }

    public void setSupportAddress(String supportAddress) {
        this.supportAddress = supportAddress;
    }

    public String[] getDependentDepartments() {
        return dependentDepartments;
    }

    public void setDependentDepartments(String[] dependentDepartments) {
        this.dependentDepartments = dependentDepartments;
    }

    public List<Integer> getCasesList() {
        return casesList;
    }

    public void setCasesList(List<Integer> casesList) {
        this.casesList = casesList;
    }

    public Set<String> getCasesSet() {
        return casesSet;
    }

    public void setCasesSet(Set<String> casesSet) {
        this.casesSet = casesSet;
    }

    public Map<String, Integer> getCasesMap() {
        return casesMap;
    }

    public void setCasesMap(Map<String, Integer> casesMap) {
        this.casesMap = casesMap;
    }
}
