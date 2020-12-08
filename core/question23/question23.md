# Why are you not allowed to annotate a final class with @Configuration? How do @Configuration annotated classes support singleton beans? Why can't @Bean methods be final either?
Class annotated with ```@Configuration``` cannot be final because Spring will use CGLIB to create a proxy for ```@Configuration```
 class. CGLIB creates a subclass for each class that is supposed to be proxied. However, since final class cannot have subclass
CGLIB will fail. This is also a reason why methods cannot be final, Spring needs to override methods from parent class for proxy
to work correctly. However, final methods cannot be overridden, having such a method will make CGLIB fail.

If ```@Configuration``` class is marked as final, or a method marked as final, Spring throws ```BeanDefinitionParsingException```

Spring supports Singleton beans in ```@Configuration``` class by creating CGLIB proxy that intercepts calls to the method. 
Before method is executed from the proxied class, proxy intercepts a call and checks if instance of the bean already exists.
If instance already exists, then call to the method is not allowed and already existing instance is returned. If instance does not
exist, the call is allowed, bean is created and instance returned and saved for future reuse.

Easiest way to verify that ```@Configuration``` object is proxied is by using the debugger or by printing the stacktrace. 
When looking at the stacktrace, you will see that the name of the bean is something like $$EnhancerBySpringCGLIB.
