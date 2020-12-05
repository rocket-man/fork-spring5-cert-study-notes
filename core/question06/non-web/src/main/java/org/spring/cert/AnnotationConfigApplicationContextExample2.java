package org.spring.cert;

import org.spring.cert.beans.SpringBean1;
import org.spring.cert.defined.configuration.ConfigurationStatic;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * In this example instead of provided the configuration with the component scan... we are providing
 * the package which contains the beans to be used.
 */
public class AnnotationConfigApplicationContextExample2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "org.spring.cert.beans"
        );

        SpringBean1 bean = context.getBean(SpringBean1.class);
        bean.sayHello();
    }
}
