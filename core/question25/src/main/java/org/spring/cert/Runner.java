package org.spring.cert;

import org.spring.cert.bean.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.registerShutdownHook();

        //Activate profile
        context.getEnvironment().setActiveProfiles("database", "prod");
        context.register(ApplicationConfig.class);
        context.refresh();

        System.out.println(context.getBean(SpringBean1.class).getClass().getSimpleName());
        System.out.println(context.getBean(SpringBean2.class).getClass().getSimpleName());
        System.out.println(context.getBean(SpringBean3.class).getClass().getSimpleName());
//        System.out.println(context.getBean(SpringBean4.class).getClass().getSimpleName());
        System.out.println(context.getBean(SpringBean5.class).getClass().getSimpleName());
        System.out.println(context.getBean(SpringBean6.class).getClass().getSimpleName());
    }
}
