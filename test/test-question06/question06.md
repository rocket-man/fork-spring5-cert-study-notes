# How is context configuration used?
```@ContextConfiguration``` annotation is used on top of the class that represents Integration Test, and its purpose
is to specify how to load and configure Application Context for integration.

```java
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
public class ApplicationServiceIntegrationTest{
    //...
}
```

```@ContextConfiguration``` annotation can be used in two basic modes:
- Annotated Classed Based Approach
- XML Based Approach

When ```@ContextConfiguration``` annotation is used with Annotated Classes Approach, it is expected for classes field to 
point to class that represents ```@Configuration``` classes, which will contain information about ```@ComponentScan``` or will
provide ```@Bean```s

```java
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
public class ApplicationServiceIntegrationTest{
    //...
}
```

```java
import java.beans.BeanProperty;

@Configuration
@ComponentScan("com.app.example")
public class ApplicationConfiguration {
    //...
    
    @Bean
    public DataSource dataSource(){
        return new EmbeddedDatasourceBuilder()
                .generateUniqueName(true)
                .build();
    }
    
    //...
}
```

When ```@ContextConfiguration``` annotation is used with XML Based Approach, it is expected for locations field to point 
to context xml definitions or list of context xml definitions.

```java
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/application-configuration.xml")
public class ApplicationServiceIntegrationTest{
    //...
}

```

Additionally, ```@ContextConfiguration``` annotation also allows you to specify:
- initializers - list of ```ApplicationContextInitilizer```, used within cases that require some programmatic initialization 
of the application context
  
- loader - usually not used and default ```DelegatingSmartContextLoader``` is used, if required, this field allows you to specify 
custom context loader or one of the following:
  - GenericXmlContentLoader
  - GenericGroovyXmlContextLoader
  - AnnotationConfigContextLoader  
  - GenericXmlWebContextLoader  
  - GenericGroovyXmlWebContextLoader
  - AnnotationConfigWebContextLoader  
    
- name - name of the context hierarchy level represented by this configuration, only applicable when used within a test class
hierarchy configured using ```@ContextHierarchy```
  
- inheritLocations - whether or not xml locations or annotated classes from test superclasses should be inherited, default true

- inheritInitializers - whether or not context initializers from test superclasses should be inherited, default true