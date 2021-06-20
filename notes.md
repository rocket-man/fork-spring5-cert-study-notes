1. In Spring AOP, which of these can prevent execution from proceeding to the join point ? Select all that apply.
  ##### A) Before Advice
  ##### B) After Returning Advice
  ##### C) After Throwing Advice
  ##### D) Around Advice 

  Correct Answer: A, D
  
  If the Before Advice throws an exception, the join point will not be called. By not calling the 'proceed()' on the ProceedingjoinPoint param of the Around Advice 
  method, the join point (target method) will not be executed. 'After Returning Advice' and 'After Throwing Advice' are involved only after the execution of the join point.
  
  ---
  
2.   Which of these advices, when used, will have a chance to execute some code before the join point is executed ? Select all that apply.
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


5. 
