# What is a pointcut, a join point, an advice, an aspect and a weaving?
Join Point in Aspect Oriented Programming is a point in execution of a program in which behaviour can be altered by AOP.

In Spring AOP **Join Point** is always method execution
```java
public interface CurrencyService{
    float getExchangeRate(String from, String to);

    float getExchangeRate(String from, int multiplier);

    String getCurrencyLongName(CurrencyId id);
    
    String getCurrencyCountryName(CurrencyId id);
}
```

AOP concept in general, distinguishes additional Joint Points, some of them include:
- Method Execution / Invocation
- Constructor Execution / Invocation
- Reference / Assignment to Field
- Exception Handler
- Execution Advice
- Execution of Static Initializer / Object Initializer

**Pointcut** is a predicate used to match join point. Additional code, called Advice is executed in all parts of the program 
that are matching pointcut. Spring uses the AspectJ pointcut expression language by default.

Examples of Pointcut Expressions:
- execution - Match Method Execution \
  ``` execution(* org.spring.cert.bls.CurrencyService.getExchangeRate(..)) ``` 
  
  
- within - Match Execution of given type or types inside package\
  ``` within(* org.spring.cert.bls.*) ``` 
  
  
- @within - Match Execution of type annotated with annotation \
  ```@within(org.spring.cert.annotations.Secured)```
  
  
- @annotations - Match join points where subject of the join point has given annotation \
  ```@annotation(org.spring.cert.annotations.InTransaction)```
  

- bean - Match by Spring bean name \
  ```bean(currency_service)```
  

- args - Match by method argument \
  ```args(Stirng, String, int)```
  

- @args - Match by runtime type of the method arguments that have annotations of the given type \
  ``` args(org.spring.cert.annotations.Validated) ```


- this - Match by bean reference being an instance of the given type (for CGLIB-based Proxy) \
  ```this(org.spring.cert.bls.CurrencyService)```


- target - Match by target object being an instance of the given type \
  ```target(org.spring.cert.bls.CurrencyService)```
  

- @target - Match by class of the executing object having an annotation of the given type \
  ```@target(org.spring.cert.annotations.Secured)```


**Advice** is the additional behaviour that will be inserted into the code, at each point matched by pointcut

```
import org.aspectj.lang.annotation.Pointcut;

@Pointcut("@annotation(org.spring.cert.annotations.InTransaction)")     
public void transactionAnnotationPointcut(){    <-------------------------------------   Pointcut
    
}

@Before("transactionAnnotationPointcut()")
public void beforeTransationAnnotatinAdvice(){
    System.out.println("Before - transactionAnnotationPointcut");    <-----------------  Advice
}

//--------------------------------------------------------------------

@Before("this(org.spring.cert.bls.CurrencyRepositoryImpl)"){      <---------------------- Inline Pointcut 
    System.out.println("Before - this(CurrencyRepositoryImpl)")   <----------------------  & Advice
}
```

**Aspect** Aspect brings together Pointcut and Advice. Usually it represents single behaviour implemented by advice that 
will be added to all points matched by pointcut.  In spring the Aspect class needs to be a bean usually with annotated 
with @Component and the @Aspect

```java
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CurrencyRepositoryAspect {  //<---------------------------------------   Aspect class
    @Before("this(org.spring.cert.bls.CurrenciesRepositoryImpl)")    //<-------------- Pointcut
    public void beforeThisCurrenciesRepository(){
        System.out.println("Before - this(CurrenciesRepositoryImpl)");  //<-----------  Advice
    }
}

```


**Weaving** is the process of applying aspects, which modifies code behaviour at join points that have matching pointcuts 
and associated advices. During weaving aspects and application code is combined which enables execution of cross-cutting
concerns. 

Types of weaving:
- Compile Time Weaving - byte code is modified during the compilation, aspects are applied, code is modified at join points 
matching pointcuts by applying advices. (normally done by maven plugin. The generated JAR already has the aspects applied)
  
- Load Time Weaving - byte code is modified when classes are loaded by class loaders, during class loading aspects are applied,
code is modified at join points matching pointcuts by applying advices

- Run time Weaving - used by Spring AOP, for each object/bean subject to aspects, proxy object is created (JDK Proxy or 
  CGLIB Proxy), proxy objects are used instead of original object, at each join point matching pointcut, method invocation
  is changed to apply code from advice.
