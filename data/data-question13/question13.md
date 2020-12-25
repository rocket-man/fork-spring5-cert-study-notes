# What is @EnableTransactionManagement for?
```@EnableTransactionManagement``` annotation is used on top of ```@Configuration``` class to enable annotation-driven
transaction management by ```@Transactional``` annotation in Spring Framework.

When ```@EnableTransactionManagement``` is used, ```TransactionInterceptor``` and ```TransactionAspectSupport``` will be used 
to proxy each call to ```@Transactional``` class or method, which will use ```PlatformTransactionManager``` to manage transaction.

```@EnableTransactionManagement``` allows you to specify following values:

- Mode - sets advice mode for ```@Transactional``` annotation, indicates how calls to methods should be intercepted, PROXY
is default mode, you can switch it to more advance ASPECTJ Weaving advice, which supports local calls.
  
- Order - indicates order of advice execution when more than one advice applies to ```@Transactional``` joint point

- proxyTargetClass - indicates whether CGLIB Proxy classes should be created or if JDK Proxies should be created (default),
this field is used only when ```Mode``` is set to PROXY
  
