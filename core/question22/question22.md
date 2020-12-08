# What is the default name id if you only use @Bean. How can you override this?
When using ```@Bean``` without specifying name or alias, default bean id will be created based on the name of the method
which was annotated with ```@Bean``` annotation.

```java
@Bean
public SpringBean1 springBean1(){
    return new SpringBean1();
}
```

You can override this behaviour by specifying name or alises for the bean.
```java
@Bean(name = "2ndSpringBean")
public SpringBean2 speingBean2(){
    return new SpringBean2();    
}

@Bean(name = {"3dSpringBean", "thirdSpringBean"})
public SpringBean3 springBean3(){
        return new SpringBean3();
}
```

The Alias is always the second name of the bean, and the first name will become the id