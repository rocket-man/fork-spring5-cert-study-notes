package org.spring.cert;

import org.spring.cert.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * With this approach we can register beans.It is a more manual set up of the context
 * */
public class AnnotationConfigApplicationContextExample3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.scan("org.spring.cert.beans");
//        context.registerBean();
        context.refresh();

        SpringBean1 bean = context.getBean(SpringBean1.class);
        bean.sayHello();
    }
}
