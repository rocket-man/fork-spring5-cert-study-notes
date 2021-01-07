# What is a security context?
```SecurityContext``` is an interface, allowing you to access security information associated  with the 
current thread of execution. Interface provides two methods:
- ```getAuthentication``` - provides currently authenticated principal, or an authentication request token
- ```setAuthentication``` - sets currently authenticated principal, or removes the authentication

```SecurityContext``` can be accessed via ```SecurityContextHolder```, which allows access in three modes:
- ```MODE_THREADLOCAL```
- ```MODE_INHERITABLETHREADLOCAL```
- ```MODE_GLOBAL```

```SecurityContextHolder``` is set to ```MODE_THREADLOCAL```by default, it allows each Thread to access it's own dedicated
```SecurityContext```

_ThreadLocal is a structure to easily associate the data with the specific thread_    

When ```SecurityContextHolder``` is set to ```MODE_INHERITABLETHREADLOCAL```, then child threads are allowed to access 
same ```SecurityContext``` as parent Thread 

When ```SecurityContextHolder``` is set to ```MODE_GLOBAL```, then all threads within JVM are accessing the same ```SecurityContext```,
this mode is usually used by standalone desktop applications, such as Java Swing based clients. Not recommended to be used 
with Web applications

Mode of ```SecurityContextHolder``` can be change via:
- Property - ```spring.security.strategy```
- Programmatically - ```SecurityContextHolder#setStrategyName```

Allowed values are:
- ```MODE_TREADLOCAL``` (default)
- ```MODE_INHERITABLETHREADLOCAL```
- ```MODE_GLOBAL```


```SecurityContext``` allows you to access or set currently used ```Authentication``` object.

```Authentication``` object represents the token for an authentication request or an authenticated principal, once the 
authentication request has been processed. ```Authentication``` object contains following methods. 
- ```getPrincipal``` - identity of the principal being authenticated
- ```getAuthorities``` - collection of authorities granted to the principal 
- ```getCredentials``` - credentials that prove the principal is correct
- ```getDetails``` - additional details about the authentication request, address, certificate, serial number etc...
- ```isAuthenticated```, ```setAuthenticated``` - for internal used by ```AbstractSecurityInterceptor```, ```AuthenticationManager```
to control required amount of for re-authentications 