package org.spring.cert;

import org.spring.cert.beans.HelloBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();

        HelloBean bean = context.getBean(HelloBean.class);
        bean.sayHello();

    }
}
