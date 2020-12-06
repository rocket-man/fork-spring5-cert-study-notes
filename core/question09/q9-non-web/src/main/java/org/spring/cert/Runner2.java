package org.spring.cert;

import org.spring.cert.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * This try-with-resources automatically closes the context for us. Because AnnotationConfigApplicationContext is of
 * type auto closable. After leaving the try with resources block the application context is automatically closed
 * */
public class Runner2 {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(ApplicationConfiguration.class)){

            SpringBean1 bean = context.getBean(SpringBean1.class);
            bean.sayHello();
        }
    }
}
