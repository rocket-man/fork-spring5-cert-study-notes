# What is the security filter chain?
Security Filter Chain is a collection of Spring Managed Filters that are responsible for authentication 
and authorization. Usually they include functionalities like Username and Password Authentication, Logout Management, Session 
Management, Security Interceptor etc.

```SecurityFilterChain``` is an interface located in package ```org.springframework.security.web``` of ```spring-web``` module.

This interface specifies a contract for behaviour that associates request URL to list of security filters.

Spring provides one implementation of this interface called ```DefaultSecurityFilterChain``` which uses request matchers 
to check if list of security filters should be applied to specified url.

Some of the request matchers that can be used include ```AntPathRequestMatcher```, ```MvcRequestMatcher```,
```RequestHeaderRequestMatcher```, ```MediaTypeRequestMatcher```, etc.

Security Filters are implementation of Servlet Filter and are usually managed by Spring Context

```FilterChainProxy``` holds list of ```SecurityFilterChains``` and upon request searches for the first ```SecurityFilterChain```
that matches request.

Upon request being matched, ```SecurityFilterChain``` is picked up and list of ```Filters``` is being 
fetched from ```SecurityFilterChain```.

After that ```FilterChainProxy``` executes ```Filters``` from ```SecurityFilterChain```.

```FilterChainProxy``` is registered bean in Spring Context and takes default name specified inside 
```AbstractSecurityWebApplicationInitilizer#DEFAULT_FILTER_NAME``` which is ```springSecurityFilterChain```

```FilterChainProxy``` is fetched from the context based on name within ```DelegatingFilterProxy```

Spring usually includes following Filters within filter chain:
- WebAsyncManagerIntegrationFilter 
- SecurityContextPersistenceFilter 
- HeaderWriterFilter
- CsrfFilter
- LogoutFilter
- UsernamePasswordAuthenticationFilter
- RequestCacheAwareFilter
- SecurityContextHolderAwareRequestFilter
- AnonymousAuthenticationFilter
- SessionManagementFilter
- ExceptionTranslationFilter
- FilterSecurityInterceptor

Spring provides API customize list of used Securoty Filter, by extending ```WebSecurityConfigurerAdapter``` and overriding 
configure metho.

```java
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(WebSecurity web) throws Exception {
        //...
    }
    @Override
    protected void configure(HttpSecurity http) {
        //...
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        //...
    }
}

```