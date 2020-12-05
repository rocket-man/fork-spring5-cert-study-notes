package org.spring.cert;

import org.spring.cert.beans.SpringBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");

        SpringBean1 bean = context.getBean(SpringBean1.class);
        bean.sayHello();
    }
}
