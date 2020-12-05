package org.spring.cert;

import org.spring.cert.beans.SpringBean1;
import org.spring.cert.defined.configuration.ConfigurationStatic;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * This approach is recommended if you want to do the integration of a third party library that
 * is not spring enabled... and you want the third party library beans to be managed by Spring.
 * Imagine SpringBean1,2,3 are third party library beans.
 *
 * Another thing you could do in the ConfigurationStatic class is to add @ComponentScan so that
 * your beans are also scanned and managed by spring.
 *
 */
public class AnnotationConfigApplicationContextExample1b {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ConfigurationStatic.class
        );

        SpringBean1 bean = context.getBean(SpringBean1.class);
        bean.sayHello();
    }
}
