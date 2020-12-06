package org.spring.cert;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        SpringBean bean = context.getBean(SpringBean.class);
        bean.printProperties();


    }
}
