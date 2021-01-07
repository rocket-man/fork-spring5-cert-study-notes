# What is the delegating filter proxy?
```DelegatingFilterProxy``` is an internal Spring Framework class located in package ```org.springframework.web.filter```
of ```spring-web``` module. 

This class acts as a Proxy between standard Servlet Filter and Spring-managed Bean that implements Servlet Filter. ```DelegatingFilterProxy```
is registered within application container and delegates all calls to Bean registered within Spring Application Context.

We may say that it acts like a bridge between Servlet container and Spring Application Context.

Bean to which all calls should be delegated to is located based on Filter Name provided within Filter Configuration, usually 
it is named ```SpringSecurityFilterChain``` and is an instance of ```FilterChainProxy```

```DelegatingFilterProxy``` can be registered in following 3 ways:

1- Servlet 3 - via ```AbstractSecurityWebApplicationInitializer``` 
    - Method ```insertSpringSecurityFilterChain``` will register ```DelegatingFilterProxy```
    
2- Servlet 2 - via web.xml
```xml
<filter>
    <filter-name>springSecurityFilterChain</filter-name>
    <filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
</filter>
<filter-mapping>
    <filter-name>springSecurityFilterChain</filter-name>
    <url-pattern>/*</url-pattern>
</filter-mapping>
```
```springSecurityFilterChain``` is a default name for ```FilterChainProxy``` specified in ```AbstractSecurityWebApplicationInitializer#DEFAULT_FILTER_NAME```

3- Spring Boot 
    - uses ```DelegatingFilterProxyRegistrationBean``` instead of regular ```DelegatingFilterProxy``` to create a specialized version of ```DelegatingFilterProxy``` 
    - Registered by ```SecurityFilterAutoConfiguration```
    
Role of ```DelegatingFilterProxy``` is to delegate all calls to ```FilterChainProxy```, which contains ```SecurityFilterChain``` responsible for Web Level ```Authentication``` and ```authorization```:
The ```DelegatingFilterProxy``` is managed by the container (ie: Tomcat, Undertow) and the ```FilterChainProxy``` is bean 
that is managed by Spring 