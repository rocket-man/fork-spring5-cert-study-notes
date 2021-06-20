# Randomly taken study notes

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

You have three options for controlling bean life cycle: The InitializingBean and DisposableBean callback interfaces: custom init() and destroy() methods; and the @PostConstruct() and @PreDestroy() annotations.

Multiple lifecycle mechanisms configured for the same bean, with different initialization methods, are called as follow:
- Method annotated with @PostConstruct
- afterPropertiesSet() as defined by InitializingBean callback interface 
- A custom configured init() method

Destroy methods are called in the same order:
- Methods annotated with @PreDestroy
- destroy() as defined by DisposableBean callback interface
- A custom configured destroy() method
