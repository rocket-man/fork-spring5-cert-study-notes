# Can you describe: Dependency injection using Java configuration? Dependency injection using annotations (@Component, @Autowired)? Component scanning, Stereotypes and Meta-Annotations? Scopes for Spring beans? What is the default scope ?  

Dependency injection using java configuration:

When doing dependency injection using Java Configuration you need to explicitly define all you beans and you need to use 
@Autowired on @Bean method level to inject dependencies

```java
@Configuration
public class ApplicationConfiguration {

    @Bean
    @Autowired
    public SpringBean1 springBean1(SpringBean2 springBean2, springBean3 springBean3){
        return new SpringBean1(springBean2, springBean3);
    }

    @Bean
    public SpringBean2 springBean2(){
        return new SpringBean2();
    }

    @Bean
    public SpringBean3 springBean3(){
        return new SpringBean3();
    }
}
```

Dependency Injection using Annotations:

- Create classes annotated with @Component annotations
```java
@Component
public class SpringBean1

@Component
public class SpringBean2

@Component
public class SpringBean3
```

- Define dependencies when required
```java
@Autowired
private SpringBean2 springBean2;

@Autowired
private SpringBean2 springBean2;
```

- Create Configuration with Component Scanning Enabled

```java
@ComponentScan
public class ApplicationConfiguration{
}
```

- Component Scanning
Is the process in which Spring is scanning Classpath in search for classes annotated with stereotype annotations like 
  @Component @Repository @Service @Controller ... and based on these it creates bean definitions.
  

- Simple component scanning within Configuration package and all subpackages

```java
@ComponentScan
public class ApplicationConfiguration{
}
```

- Advanced Component Scanning Rules
```java
@ComponentScan( 
        basePackages = "org.spring.cert.beans",
//        basePackageClasses = "SpringBean1.class",
        includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern=".*Bean.*"),
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern=".*Bean1.*")
)
public class ApplicationConfigurationAdvanced{
}
```

- Stereotypes - Definition
Stereotypes are annotations applied to classes to describe the role which will be performed by this class. 
  Spring discovered classes annotated by Stereotypes and creates bean definitions based on those types.
  

- Types of Stereotypes
    - Component -> generic component in the System, root stereotype, candidate for auto scanning
    - Service -> class will contain business logic
    - Repository -> class is data repository (used for data access objects, persistence)
    - Controller -> class is a controller, usually a web controller (used with @RequestMapping)

    
- Meta-Annotations
Meta-annotations are annotations that can be used to create new annotations 
  

- Example of Meta-Annotation
@RestController annotation is using @Controller and @ResponseBody to define its behaviour
```java
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
@ResponseBody
public @interface RestController {
@AliasFor(
annotation = Controller.class
)
String value() default "";
}
```

- Scopes of Spring Beans
    - Singleton -> Single Bean per Spring container - Default
    - Prototype -> New instance each time Bean is requested
    - Request -> New instance per HTTP Request
    - Session -> New instance per HTTP Session
    - Application -> One instance per each Servlet
    - Websocket -> One instance per each WebSocket