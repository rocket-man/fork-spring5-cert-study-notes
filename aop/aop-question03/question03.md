# How does Spring solve (implement) a cross cutting concern?
Spring implements cross-cutting concerns with usage of Spring AOP module. Spring AOP uses AspectJ expression syntax for
Pointcut expressions, which are matched against Join Point, code is altered with logic implemented in advices. In Spring 
AOP Join Point is always method invocation.

Spring AOP uses Runtime Weaving, and for each type subject to aspects, to intercept calls, spring creates on type of proxy:
- JDK Proxy - created for classes that implements interfaces.
- CGLIB Proxy - created for class that not implement interface.

It is possible to force Spring to use CGLIB Proxy with usages of ```@EnableAspectJAutoProxy(proxyTragetClass = true)```


