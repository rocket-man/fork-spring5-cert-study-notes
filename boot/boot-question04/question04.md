# What things affect what Spring Boot sets up?
Spring Boot uses autoconfiguration to detect dependencies on the class path, based on detected dependencies, spring beans
are configured to allow integration with technologies, like JPA, Data Sources, Embedded Databases, Template Rendering,
engines, etc...

Spring Boot searches ```META-INF/spring.factories``` on classpath that should contain entry 
```org.springframework.boot.autoconfiguration.EnableAutoConfiguration``` that lists all autoconfiguration classes provided 
by autoconfiguration module.

Autoconfiguration class is using ```@Conditional On...``` annotations to specify under which conditions, certain autoconfiguration
should be applied. 

Spring Boot provides starter modules, which are empty jars with set of dependencies specified with correct dependencies 
versions to allow easy start with the library.

Starter module may provide only set of dependencies, or set of dependencies with auto-configuration code.

Spring Boot supports following Conditional Annotations for Autoconfiguration Classes:
- ```ConditionalOnBean``` - presence of Spring Bean
- ```ConditionalOnMissingBean``` - absence of Spring Bean
- ```ConditionalOnClass``` - presence of class on classpath
- ```ConditionalOnMissingClass``` - absence of class on classpath
- ```ConditionalOnCloudPlatform``` - if specified cloud platform is active - for example Cloud Foundry
- ```ConditionalOnExpression``` - if SpEL expression is true
- ```ConditionalOnJava``` - presence of Java in specified version
- ```ConditionalOnJndi``` - if JNDI location exists
- ```ConditionalOnWebApplication``` - if a web application that uses WebApplicationContext or StandardServletEnvironment
- ```ConditionalOnNotWebApplication``` - application that is not a web application
- ```ConditionalOnProperty``` - presence of spring property
- ```ConditionalOnResource``` - presence of resource
- ```ConditionalOnSingleCandidate``` - only one candidate for the bean found
    

