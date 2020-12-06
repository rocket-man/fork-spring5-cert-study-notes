package org.spring.cert;

import org.spring.cert.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * If context.registerShutdownHook(); line is commented out then the @PreDestroy SpringBean1 message does not appear
 * because we are not registering the shutdown hook and we are not closing the context directly
 * */
public class Runner1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        context.registerShutdownHook();

        SpringBean1 bean = context.getBean(SpringBean1.class);
        bean.sayHello();

//        context.close();
    }
}
