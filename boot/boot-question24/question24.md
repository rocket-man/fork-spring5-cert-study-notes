# What values does Spring Boot Actuator provide?
Spring Boot Actuator provides features, that are required for your application to be viewed as production ready product,
such as: 
- Monitoring 
- Health-checks
- Metrics
- Audit Events

Advantage of using Spring Boot Actuator is that you can use those features in your product, without having to code them 
on your own, and enabling it, it is simple as putting dependency in your project:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

After that you can access endpoints available by default:
- /actuator/health
- /actuator/info