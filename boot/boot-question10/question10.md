# How do you access the properties defined in the properties file?
Spring Boot allows you to access properties defined in property files in following ways:
- ```@Value("${PROPERTY_NAME}")```

You can inject properties into fields with usage of ```@Value``` annotation:
```java
@Value("${app.propertyB}")
private String propertyB;
```

- ```@ConfigurationProperties```

You can define Data Object which will hold properties for defined ```prefix```, you also need to register Configuration Properties
Data Object with usage of ```EnableConfigurationProperties:``` 
```java
@ConfigurationProperties(prefix = "app")
@Getter
@Setter
public class AppConfiguration{
    private String propertyA;
}
```

```java
@SpringBootApplication
@EnableConfigurationProperties(AppConfiguration.class)
public class SpringBootConsoleApplication implements CommandLineRunner{
    //...
}
```

- Environment Property Resolver

Inject and use  ```Environment``` object
```java
@Autowired
private Environment environments;
```

```java
environment.getProperty("app.propertyC");
```