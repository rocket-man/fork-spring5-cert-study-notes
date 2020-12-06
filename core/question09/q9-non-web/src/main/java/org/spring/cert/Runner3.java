package org.spring.cert;

import org.spring.cert.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The third way is to call the close method directly but this is not recommended because if an exception is thrown
 * the context is not closed.
 * */
public class Runner3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        SpringBean1 bean = context.getBean(SpringBean1.class);
        bean.sayHello();

        context.close();
    }
}
