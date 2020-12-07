# What does component-scanning do?
- Component Scanning
Is the process in which Spring is scanning the classpath in search for classes annotated with stereotype annotations 
(@Component, @Repository, @Service, @Controller, ...) and based on those it creates bean definitions.

- Simple component scanning within Configuration package and all subpackages 
```java
@ComponentScan
public class ApplicationConfiguration{
}
```

- Advance component scanning rules
```java
@ComponentScan(
        basePackages="org.spring.cert.beans",
        includeFilters= @ComponentScan.Filters(type = FilterType.REGEX, pattern = ".*Bean" ),
        excludeFilters= @ComponentScan.Filters(type = FilterType.REGEX, pattern = ".*(Controller|Service).*")
)
public class ApplicationConfiguration{
}
```