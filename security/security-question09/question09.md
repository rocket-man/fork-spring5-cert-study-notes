# Why do you need method security? What type of object is typically secured at the method level (think of its purpose not its Java type)
Method level security is needed whenever more granular security rules needs to be expressed for the application. In some cases 
having web based rules, written based on URI patterns, might not be detailed enough, and additional set of rules needs to be
applied to the application service layer of application that is being built. In that case method level security is helpful.

Method level security is typically applied at Application Service layer

Spring supports following method level security application:
- ```@Secured```
- ```@RolesAllowed``` (JSR 250)
- ```@PreAuthorize, @PostAuthorize, @PreFilter, @PostFilter```

Annotations above will work if Method Level Security is enabled by annotation ```@EnableGlobalMethodSecurity```, additionally 
you can choose which type of annotations you want to enable:
- ```@Secured``` - ```@EnabledGlobalMethodSecurity(securedEnabled = true)```

- ```@RolesAllowed``` - ```@EnabledGlobalMethodSecurity(jsr250Enabled = true)```

- ```@PreAuthorize, @PostAuthorize, @PreFilter, @PostFilter``` - ```@EnabledGlobalMethodSecurity(prePostEnabled = true)```

For example to enable all of them:
```java
@EnabledGlobalMethodSecurity(
        securedEnabled = true,
        jsr250Enabled = true,
        prePostEnabled = true
)
```