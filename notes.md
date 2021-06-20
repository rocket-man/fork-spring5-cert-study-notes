# Randomly taken enumerated study points

1. In Spring AOP, which of these can prevent execution from proceeding to the join point ? Select all that apply.

  ##### A) Before Advice
  ##### B) After Returning Advice
  ##### C) After Throwing Advice
  ##### D) Around Advice 

  Correct Answer: A, D
  
  If the Before Advice throws an exception, the join point will not be called. By not calling the 'proceed()' on the ProceedingjoinPoint param of the Around Advice method, the join point (target method) will not be executed. 'After Returning Advice' and 'After Throwing Advice' are involved only after the execution of the join point.
  
---
  
2. Which of these advices, when used, will have a chance to execute some code before the join point is executed ? Select all that apply.

   ##### A) @AfterReturning
   ##### B) @Before
   ##### C) @Around
   ##### D) @After
  
  Correct Answer: B, C
  
  @AfterReturning and @After advices are executed only after (not before) the target method is executed.
  
---
  
3. In spring security:
  - Spring secures web requests using Standard Filters
  - Spring secures method invocations using Sppring AOP

---

4. Which of these are called after all the bean properties have been set. in other words, after dependency injection is done ?
  - Method annotated with @PostConstruct
  - afterpropertiesSet() as defined by the InitializingBean interface

Note that, the class constructor method is called before doing dependency injection.

---

5. Which of these advices, when used, will always have a chance to execute some code after the join point execution, regardless on if the execution completes normally or throws an exception ?

   ##### A) @AfterReturning
   ##### B) @AfterThrowing
   ##### C) @Around
   ##### D) @After 
   
   Correct Answer: C, D
   
   @AfterReturning advices are executed only if the target method completes normally (without exception thrown)
   
   @AfterThrowing advices are executed only if the target method completed abnormally (with exception thrown)
   
---
   
6. Which of these advices, will have a chance to execute some code after the join point execution throws an exception ? Select all that apply.

   ##### A) @AfterReturning
   ##### B) @AfterThrowing
   ##### C) @Around
   ##### D) @After 
   
   Correct Answer: B, C, D
   
   @AfterReturning advices are executed only if the target method completes normally (without exception thrown). If you only need to add some actions if an exception is thrown, the simplest one to use is @AfterThrowing
   
---

7. @RequestParam annotation statements
  - The 'required' attribute can be specified inside the @RequestParam, to specify if a parameter is required or not.
  - Parameter using this annotation are required by default
  - The @RequestParam annotation binds request parameters handler method parameters and they must be called the same.
    - @RequestParam("cardId") String cardIdFoo
    - @RequestParam String cardId

---

8. @Import annotation allows for loading @Bean definitions from another configuration class:

```java
@Configuration
public class ConfigA {
  @Bean
  public A a() {
    return new A();
  }
}

@Configuration
@Import(ConfigA.class)
public class ConfigB {
	@Bean
	public B b() {
		return new B();
	}
}

```
Now rather than needing to specify both ConfigA.class and ConfigB.class when instantiating the context, only ConfigB.class need to be supplied explicitly.

```java
public static void main(String[] args) {
  ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);
  
  // now both beans A and B will be available...
  A a = ctx.getBean(A.class);
  B b = ctx.getBean(B.class);
}
```

This approach simplifies container instantantiation, as only one class needs to be dealt with, rather than requiring the developer remember a potentially large number of @Configuration classes during construction.

---

9. @PostConstruct and @PreDestroy annotations

These two annotations are part of the JSR-250 lifecycle annotations. Introduced in spring 2.5, the support of these offers yet another alternative to those in:
  - initialization callbacks - implementing InitializingBean::afterPropertiesSet()
  - destruction callbacks - implementing Disposable::destroy()

---

10. Combining Lifecycle mechanism

You have three options for controlling bean life cycle: 
	1. the @PostConstruct() and @PreDestroy() annotations
	2. The InitializingBean and DisposableBean callback interfaces 
	3. custom init() and destroy() method  
	

Multiple lifecycle mechanisms configured for the same bean, with different initialization methods, are called as follow:
- Method annotated with @PostConstruct
- afterPropertiesSet() as defined by InitializingBean callback interface 
- A custom configured init() method

Destroy methods are called in the same order:
- Methods annotated with @PreDestroy
- destroy() as defined by DisposableBean callback interface
- A custom configured destroy() method

---

11. @Entity annotation can only be annotated on classes

---

12. @ExtendedWith(SpringExtension.class) and @RunWith(SpringRunner.class) annotations. 

If you are using JUnit4, don't forget to add @RunWith(SpringRunner.class) or @RunWith(MockitoJUnitRunner.class) to your test, otherwise the annotation will be ignored. If you are using JUnit5, there is no need to add the equivalent @ExtendedWith(SpringExtension.class) as @SpringBootTest and the other @...Test annotations are already annotated with it.

---

13. Differences between **@RolesAllowed**, **@PreAuthorize** and **@Secured**
- These three annotations are securoty annotations which allow to configure method security
- They can be applied both on individual methods or on class level.
- Method-level security is accomplished using Spring AOP

#### @PreAuthorize
Allows to specify access constraints to a method using the Spring Expression Language (SpEL). This method is evaluated prior to the method being executed 

This annotation is part of Spring Security Framework

In order to be able to use this annotation, @EnableGlobalMethodSecurity(prePostEnabled = true)

#### @RolesAllowed
This annotations has its origin in the JSR-250 Java Security standard. This annotation is more limited than @PreAuthorized because it only supports role based security. SpEL expression is not allowed

To be able to use this annotation the library must be in the classpath as it is not part of Spring Security.

In order to be able to use this annotation, @EnableGlobalMethodSecurity(jsr250Enabled=true)

#### @Secured
This is legacy Spring Security 2 annotation. It does not support SpEL and it is role-based. That is why the @PreAuthorize annotation is preferred to be used over these two annotations


In order to be able to use this annotation, @EnableGlobalMethodSecurity(securedEnabled=true)

---

14. Because @RestController is annotated internally with @ResponseBody all of the method within a class annotated with @RestController will return a serialized response

---

15. Difference between **@Mock**, **@MockBean** and **@InjectMock**

@MockBean creates a mock and injects it into the ApplicationContext, while @Mock annotation only creates it, if you want to inject it, you can do it manually or with @InkectMock annotation, however, injection is being done to the class not the whole ApplicationCotext.

You need to use @MockBean annotation together with @RunWith(SpringRunner.class) and @SpringBootTest for JUnit4 and for JUnit5 only @SpringBootTest is required since it already includes @ExtendWith(SpringExtension.class)

---

16. About Actuator endpoints

By default, all endpoints except for **shutdown** are enabled.

To configure, the enablement of an endpoint, use this property ```management.endpoint.<id>.enabled```

``` management.endpoint.shutdown.enabled=true ```

If you prefer endpoint enablement to be opt-in rather than opt-out, set the ``` management.endpoints.enabled-by-default``` property to false and use individual enable property to opt back in. The following, enables info and disables all of the other endpoints.

```
management.endpoints.enabled-by-default=false
management.endpoint.info.enabled=true
```

To change which endpoints are exposed, use the following Technology specific include and exclude properties:

Property | Default
------------ | -------------
management.endpoints.jmx.exposure.exclude| 
management.endpoints.jmx.exposure.include | *
management.endpoints.web.exposure.exclude | 
management.endpoints.web.exposure.include | info, health

---

17. JDK Dynamic Proxy and CGLIB Proxy 

JDK Dynamic Proxy Limitations are:
- Does not support self invocation
- Class must implement interface (it can proxy final classes)
- Only public interface methods implementing the interface will be proxied (has no limitations for final methods)

CGLIB Proxy Limitation:
- Does not support self invocation
- Class for which proxy should be created cannot be final 
- Method which should be proxied cannot be final
- Only public, protected, package methods will be proxied
- private methods are not proxied

---

18. About spring.factories

https://docs.spring.io/spring-boot/docs/2.0.0.M3/reference/html/boot-features-developing-auto-configuration.html

---

19. Transaction propagation values

@Transactional(propagation = Propagation.REQUIRED)
public void transactionalExample(String user) { 
    // ... 
}

##### Required
is the default propagation. Spring checks if there is an active transaction, then it creates one if nothing existed. Otherwise, appends to the currenly active transaction
##### Supports
Spring checks if an active transaction exists. If a transaction esists, then the existing transaction will be used. If there isn't one, it is executed non transactional
##### Mandatory
If there is an active transaction, then it will be used. If there isn't an active transaction, then spring throws an expection
##### Never
Spring throws an exception if there is an active transaction
##### Not_Supported
Spring at first suspends the current transaction if it exists, then the business logic is executed without a transaction
##### Requires_New
Spring suspends the current transaction if it exists and then creates a new one
##### Nested
Spring checks if a transaction exists, then if yes, it marks a savepoint. This means if our business logic execution throws an exception, then transaction rollbacks to this savepoint. If there is no active transaction, it works like **REQUIRED** 
