# Are beans lazily or eagerly instantiated by default? How do you alter this behaviour?
Lazy and Eager Instance Creation vs Scope Type:
- Singleton Beans are eagerly instantiated by default
- Prototype Beans are lazily instantiated by default (instance is created when bean is requested)
    - ...however, if singleton bean has dependency on Prototype bean, then Prototype bean instance will be created eagerly
    to satisfy dependencies for Singleton Bean
      
Altering behaviour:
- You can change default behaviour for all beans by @ComponentScan annotation
    - Setting lazyInit to true, will make all beans lazy, even Singleton beans
    - Setting lazyInit to false (default), will create singleton beans Eagerly and Prototypes lazily
```java
@ComponentScan(lazyInit = true)
```

- You can also change default behaviour by using @Lazy annotation
    - @Lazy annotation takes one parameter - Whether lazy initialization should occur
    - By default, @Lazy is used to mark bean as lazily instantiated
    - You can use @Lazy(false) to force Eager Instantiation - use case @ComponentScan(lazyInit = true) when some beans always 
    needs to be instantiated eagerly


- @Lazy can be applied to:
    - Classes annotated with @Component - makes bean Lazy or as specified by @Lazy parameter
    - Classes annotated with @Configuration - makes all beans provided by configuration lazy or as specified by @Lazy parameter
    - Method annotated with @Bean annotation - makes bean created by method Lazy or as specified by @Lazy parameter