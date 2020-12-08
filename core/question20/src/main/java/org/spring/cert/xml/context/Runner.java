package org.spring.cert.xml.context;

import org.spring.cert.xml.context.beans.SpringBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");

        SpringBean1 springBean1 = context.getBean(SpringBean1.class);
        springBean1.printDependencies();
    }
}
