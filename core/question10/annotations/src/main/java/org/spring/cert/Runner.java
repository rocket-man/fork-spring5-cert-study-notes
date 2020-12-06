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
* SpringBean1::constructor
* SpringBean2::constructor
* SpringBean3::constructor
* SpringBean1 postConstruct with SpringBean2 and SpringBean3
* Hello
*
* Dependency injection using Java configuration
* -----------------------------------------------------
* In this example we are not using component scanning annotation instead we have a configuration class that is providing
* us with the beans. Three beans are being created in the configuration class. Spring knows that there is a dependency
* in SpringBean1 and in order to be able to create this bean, first it needs to create SpringBean3 and then SpringBean2.
* The dependencies on the SpringBean1 constructor are provided in the @Autowired annotation and also each of the methods
* contain the @Bean annotation. Also, the constructor injection is being used but notice that in the actual bean classes
* there are no @Autowired annotations. Instead the dependency injection is being done by the constructor of the
* configuration class
*
*
*
* */
