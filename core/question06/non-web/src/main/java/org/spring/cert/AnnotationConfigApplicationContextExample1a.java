package org.spring.cert;

import org.spring.cert.beans.ConfigurationComponentScan;
import org.spring.cert.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextExample1a {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ConfigurationComponentScan.class
        );

        SpringBean1 bean = context.getBean(SpringBean1.class);
        bean.sayHello();
    }
}
