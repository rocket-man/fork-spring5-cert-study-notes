# What is a property source ? How would you use @PropertySource?
PropertySource is Spring Abstraction on Environment key value pairs, which can come from:
- JVM Properties
- System Environmental Variables
- JNDI Properties
- Servlet Parameters
- Property files located on File System
- Property files located on Classpath

You read properties with usage of @PropertySource or @PropertySources annotation
```java
@PropertySources({
        @PropertySource("file:${app-home}/app-db.properties"),
        @PropertySource("classpath:/app-defauls.properties")
})
```

You access properties with usage of @Value annotation:
```java
@Value("${db.host}")
private String dbHost;
```

