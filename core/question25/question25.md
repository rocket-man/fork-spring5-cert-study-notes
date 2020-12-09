# Can you use @Bean together with @Profile?
Yes, ```@Bean``` annotation can be used together with ```@Profile``` inside class annotated with ```@Configuration``` annotation 
on top of the method that returns instance of the bean.

If method annotated with ```@Bean``` does not have ```@Profile``` the bean will exist for all profiles.

You can specify one, multiple profiles, or profile in which bean should not exist: 

```java
@Profile("database)
@Profile("!prod)
@Profile({"database","file"})
```

Any bean that does not specify a profile belongs to the ```default``` profile

#Further Reading:
https://www.baeldung.com/spring-profiles