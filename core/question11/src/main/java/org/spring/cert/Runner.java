package org.spring.cert;

import org.spring.cert.beans.SpringBean3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        context.registerShutdownHook();

        //SpringBean3 is a prototype it is lazily initialized
//        context.getBean(SpringBean3.class);
    }
}
