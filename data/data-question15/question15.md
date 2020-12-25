# What happens if one @Transactional annotated method is calling another @Transactional annotated method on the same object instance?
JDK Proxy and CGLIB Proxy in Spring Beans AOP do not support self invocation, so when one method with ```@Transactional``` annotation
calls different method with ```@Transactional``` annotation from the same class, nothing happens, transaction interceptor will not be called.

To enable self invocation support, you need to configure Spring Aspects with AspectJ, to do that you need to:
- Have dependency to ```spring-aspects```
- Include ```aspectj-maven-plugin```
- Configure Transaction Support with ```@EnableTransactionManagement(mode - AdviceMode.ASPECTJ)```

To sum up, in order to have self invocation transactions working in Spring you need to use AspectJ.

 