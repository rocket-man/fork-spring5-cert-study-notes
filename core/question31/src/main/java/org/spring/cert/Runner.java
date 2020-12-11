package org.spring.cert;

import org.spring.cert.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.registerShutdownHook();

        context.register(ApplicationConfig.class);
        context.refresh();


        System.out.println("Active profiles:");
        System.out.println(Arrays.toString(context.getEnvironment().getActiveProfiles()));
        System.out.println("--------------------------------");
        System.out.println("Printing from environment property:");
        System.out.println(context.getEnvironment().getProperty("app.file.property"));
        System.out.println(context.getEnvironment().getProperty("app.vm.property"));
        System.out.println(context.getEnvironment().getProperty("app.env.property"));
        System.out.println("--------------------------------");
        System.out.println("Printing from environment variables:");
        System.out.println(context.getEnvironment().getProperty("user.home"));
        System.out.println(context.getEnvironment().getProperty("JAVA_HOME"));
        System.out.println("--------------------------------");
        System.out.println("Printing from the bean:");
        System.out.println(context.getBean(SpringBean1.class).getAppEnvProperty());
        System.out.println(context.getBean(SpringBean1.class).getAppFileProperty());
        System.out.println(context.getBean(SpringBean1.class).getAppVmProperty());
        System.out.println(context.getBean(SpringBean1.class).getJavaHome());

    }
}
