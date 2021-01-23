# Do you need Spring MVC in your classpath?
Yes, you need Spring MVC on classpath for REST API wo work correctly.

Spring MVC is not required for compilation time, but it is required at runtime.

REST API in Spring is built with usage of annotations like:
- ```RestController```
- ```RequestBody```
- ```RequestMapping```
- ```GetMapping```
- ...

All of those annotations are available in ```spring-web``` module which is not dependent on ```spring-webmvc``` module

However, for request to be mapped to ```RestController, DispathcerServlet``` has to be initialized, which is part ```spring-webmvc``` module.
This is the reason why ```spring-webmvc``` module is required on classpath.


