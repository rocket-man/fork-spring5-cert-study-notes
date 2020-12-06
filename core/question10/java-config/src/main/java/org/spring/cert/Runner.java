package org.spring.cert;

import org.spring.cert.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        context.registerShutdownHook();

        SpringBean1 bean = context.getBean(SpringBean1.class);
        bean.sayHello();
    }
}

/*
* After running the Runner class look at the output
* SpringBean2::constructor
* SpringBean3::constructor
* SpringBean1::constructor
* Hello
*
* Dependency Injection using Annotations:
* -----------------------------------------------------
* When running this all of the beans are created but this time the applicationConfiguration does not have all the beans
* listed. Instead we are using component scan annotations and this tells Spring that needs to search for the beans in the
* classpath and it finds three beans. Each of the beans is annotated with component annotation and this tells Spring
* that it is a candidate for the Spring bean. Then in SpringBean1 I am using the autowired annotation to inject the
* dependencies. Note that there are other ways to inject dependencies by using constructor or setter injections.
* In the postConstruct annotations I am logging the injections. This logging mechanism is also possible to achieve by
* constructor and setter injections
*
* */
