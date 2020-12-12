# What is a BeanFactoryPostProcessor and what is it used for? When is it invoked? Why would you define a static @Bean method? What is a PropertySourcesPlaceHolderConfigurer used for?
BeanFactoryPostProcessor is an interface that contains a single method postProcessorBeanFactory, implementing it allows 
you to create logic that modifies Spring Bean Metadata before any Bean is created. BeanFactoryProcessor does not create 
any beans, however it can access and alter Metadata that is used later to create Beans.

BeanFactoryPostProcessor is invoked after Spring reads or discovers Bean Definitions, but before any Spring Bean is created.

Because BeanFactoryPostProcessor is also a Spring Bean, but a special kind of Bean that should be invoked before other 
types of beans get created, Spring needs to have the ability to create it before any other beans. This is why 
BeanFactoryPostProcessor needs to be registered from static method level.

```java
@Bean
public static CustomBeanFactoryPostProcessor customBeanFactoryPostProcessor(){
    return new CustomBeanFactoryPostProcessor();
}
```

PropertySourcesPlaceHolderConfigurer is a BeanFactoryPostProcessor that is used to resolve properties placeholders in Spring
Beans on fields annotated with @Value("${property_name}")
```java
@Value("${app.env}")
private String appEnv;
@Value("${app.envid}")
private String appEnvId;

```