# What is info endpoint for? How do you supply data?
Spring Boot Actuator ```info``` endpoint is used to provide arbitrary, non-sensitive, custom defined data, available at 
runtime that can provide additional information about started application.

```info``` endpoint is exposed by default via protocols:
- ```HTTP``` at ```/actor/info```
- ```JMX``` at ```org.springframework.boot/Endpoint/Info```

```info``` endpoint is usually used to expose information like: 
- Application Name, Description, Version
- Java Runtime Used
- Git information - see ```git-commit-id-plugin```
    - Branch
    - Tag
    - Commit ID
- etc
  
You can supply data to Spring Boot by using following methods:
- With usage of property files, by defining ```info.*``` properties
```properties
info.app.name=Spring Boot Application
info.app.description=This application exposes Spring Boot Actuator Endpoints
info.app.version=1.0.0
info.java-vendor=${java.specification.vendor}
```

- By implementing ```InfoContributor``` bean
```java
@Component
public class SystemNameInfoContributor implements InfoContributor{
    @Override
    oublic void contribute(Info.Builder builder){
        builder.withDetail("system-name", System.getProperty("os.name"));
    }
}
```

