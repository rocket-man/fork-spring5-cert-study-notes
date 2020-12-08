package org.spring.cert;

import org.spring.cert.beans.SpringBean1;
import org.spring.cert.beans.SpringBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();

       context.getBean(SpringBean1.class);
       context.getBean(SpringBean1.class);
       context.getBean(SpringBean1.class);

       context.getBean(SpringBean2.class);
       context.getBean(SpringBean2.class);
       context.getBean(SpringBean2.class);
    }
}

/**
 * Notice that even though there are 3 calls for each one of the beans by looking at the logs generated the SpringBean1 is
 * called only once and the SpringBean2 three times.
 *
 * When SpringBean1 is being requested dor the first time then proxy intercepts the call and checks if exists or not. If it
 * already exists returns the precreated instance and if it does not exists it will create SpringBean1. That is why is only
 * called once.
 *
 * For the prototype bean is different. The call is also intercepted but since it is a prototype bean we want a new instance
 * each time is called
 *
 * The best way to check it is by adding a breakpoint in the bean methods of configuration class and debug the object names.
 * For SpringBean1 is called only once and the SpringBean2 is called as many times is requested
 */
