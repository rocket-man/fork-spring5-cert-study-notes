# How are @PreAuthorize and @RolesAllowed annotations implemented?
```@PreAuthorized``` and ```@RolesAllowed``` annotations are implemented with usage of Spring AOP and ```AccessDecisionVoter(s)```

```AccessDecisionVoter(s)``` are called by ```AccessDecisionManager```, which is called by ```MethodSecurityInterceptor```
which are registered by one of ```AdvisorAutoProxyCreator```. Pointcuts and Advices AOP are pointed by ```MethodSecurityMetadataSourceAdvisor```.
Currently, used ```MethodSecurityInterceptor``` is pointed by ```GlobalMethodSecurityConfiguration#methodSecurityInterceptor```

```RolesAllowed``` annotation is implemented by ```Jsr250Voter```.

```@PreAuthorized``` annotation is implemented by ```PreInvocationAuthorizationAdviceVoter```
