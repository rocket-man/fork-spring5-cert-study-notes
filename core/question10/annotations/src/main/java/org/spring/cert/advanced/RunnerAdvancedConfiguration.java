package org.spring.cert.advanced;

import org.spring.cert.ApplicationConfiguration;
import org.spring.cert.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class RunnerAdvancedConfiguration {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfigurationAdvanced.class);

        context.registerShutdownHook();

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}

/*
* After running the Runner class look at the output
* SpringBean1::constructor
* SpringBean2::constructor
* SpringBean3::constructor
* SpringBean1 postConstruct with SpringBean2 and SpringBean3
* Hello
*
* Dependency injection using annotations
* -----------------------------------------------------
* Notice that the spring bean 1 is not listed in the output and that is because I have exclude it using
* the exclude filter in the Component Scan annotation.
*
*
* */
