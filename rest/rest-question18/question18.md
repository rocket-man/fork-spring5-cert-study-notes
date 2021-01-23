# What spring Boot starter would you use for a Spring REST application?
To create spring REST application, use ```Spring Boot Web Starter```

```properties
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
Spring boot Web Starter Maven pom.xml has following description:
```Starter for building web, including RESTful, applications using Spring MVC. Uses Tomcat as the default embedded container.```

Spring Boot Web starter will automatically include:

- spring-web
- spring-webmvc
- spring-boot-starter-json
    - jackson-databind
    
- spring-boot-starter-tomcat    
    - tomcat-embedded-core