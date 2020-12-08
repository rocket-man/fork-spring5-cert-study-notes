package org.spring.cert.dao;

import org.spring.cert.ds.Department;

public class DepartmentDao {

    public Department findById(int id){
        System.out.println("Searching for department");
        return new Department();
    }

    public void save(Department department){
        System.out.println("Saving department...");
    }
}

/**
 * This department dao does not have an interface therefore it is not possible to use JDK Dynamic Proxy. However, we can use
 * CGLIB proxy using the enhancer class.
 */
