# What is a BeanPostProcessor and how is it different to a BeanFactoryPostProcessor? What do they do? When are they called?
BeanPostProcessor is an interface that allows you to create extensions to Spring Framework that will modify Spring Bean 
objects during initialization. This interface contains two methods:
- ```postProcessBeforeInitialization ```
- ```postProcessAfterInitialization ```

Implementing those methods allows you to modify created and assembled bean objects or even switch objects that will represent the bean
  
Main difference compared to BeanFactoryPostProcessor is that BeanFactoryPostProcessor works with Bean Definitions while BeanPostProcessor works with Bean objects.

BeanFactoryPostProcessor and BeanPostProcessor in Spring Container lifecycle:
1. Bean Definitions are created based on Spring Bean Configuration.
2. ```BeanFactoryPostProcessors ``` are invoked.
3. Instance of Bean is created.
4. Properties and Dependencies are set.
5. ```BeanPostProcessor::postProcessBeforeInitialization ``` gets called.
6. @PostConstruct method gets called.
7. InitializingBean::afterPropertiesSet method gets called.
8. @Bean(initMethod) method gets called.
9. ```BeanPostProcessor::postProcessorAfterInitialization ``` gets called

Recommended way to define BeanPostProcessor is through static @Bean method Application Configuration. This is because 
BeanPostProcessor should be created early, before other bean objects are ready
```java
@Bean
public static CustomBeanPostProcessor customBeanPostProcessor(){
    return new CustomBeanPostProcessor();
}
```
It is also possible to create BeanPostProcessor through regular registration in Application Configuration or through 
Component Scanning and @Component annotation, however, because in that case beans can be created late in processes, recommended 
way is the option provided above.


# What is an initialization method and how is it declared on a Spring bean? 
Initialization method is a method that you can write for Spring Bean if you need to perform some initialization code that depends
on properties and/or dependencies injected into Spring Bean.

You can declare Initialization method in three ways:
- Create method in Spring Bean annotated with @PostConstruct
- Implement InitializingBean::afterPropertiesSet 
- Create Bean in Configuration class with @Bean method and use @Bean(initMethod)

# What is a destroy method, how is it declared and when is it called?
Destroy method is a method in Spring Bean that you can use to implement any cleanup logic for resources used by the bean.
Method will be called when Spring Bean will be taken out of use, this is usually happening when Spring Context is closed.

You can declare destroy method in the following ways:
- Create method in Spring Bean annotated with @PreDestroy
- Implement DisposableBean::destroy
- Create Bean in Configuration class with @Bean method and use @Bean(destroyMethod)


# Consider how you enable JSR-250 annotation like @PostConstruct and @PreDestroy?
When using AnnotationConfigApplicationContext support for @PostConstruct and @PreDestroy is added automatically.

Those annotations are handled by CommonAnnotationBeanPostProcessor which is automatically registered by AnnotationConfigApplicationContext.

# When/how will they (initialization and destroy method) get called? 
Context is created:
1. Bean definitions are created based on Spring Bean configuration
2. BeanFactoryPostProcessors are invoked

Bean is created:
1. Instance of Bean is created
2. Properties and Dependencies are set.
3. BeanPostProcessor::postProcessorBeforeInitialization gets called.
4. @PostConstruct method get called
5. InitializationBean::afterPropertiesSet method gets called
6. @Bean(initMethod) method gets called
7. BeanPostProcessor::postProcessAfterInitialization gets called

Bean is ready to use

Bean is Destroyed (usually when context is closed)
1. @PreDestroy method gets called
2. DisposableBean::destroy method gets called
3. @Bean(destroyMethod) gets called
