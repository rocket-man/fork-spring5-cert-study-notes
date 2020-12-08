package org.spring.cert.proxy.cglib;

import org.spring.cert.dao.DepartmentDao;
import org.spring.cert.ds.Department;
import org.springframework.cglib.proxy.Enhancer;

public class Runner {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(new DepartmentDaoMethodInterceptor());
        enhancer.setSuperclass(DepartmentDao.class);

        DepartmentDao proxiedDao = (DepartmentDao) enhancer.create();

        Department department = proxiedDao.findById(5);
        proxiedDao.save(department);
    }
}
