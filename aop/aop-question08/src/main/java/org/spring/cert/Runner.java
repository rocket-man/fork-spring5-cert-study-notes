package org.spring.cert;

import org.spring.cert.beans.HelloBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();

        HelloBean helloBean = context.getBean(HelloBean.class);

        String s = helloBean.formatData("John", "Doe");
        try {
            helloBean.saveData(null);
        } catch (Exception ignored) {
            // ignored on purpose
        }
    }
}
