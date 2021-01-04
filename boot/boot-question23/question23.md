# What are the examples of @Conditional annotations? How are they used?

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

```@Conditional``` annotations are used together with Auto Configuration Classes, to indicate under which conditions, specific
```@Configuration``` class should apply:

```java
@Configuration
@ConditionalOnProperty(name = "file.store", havingValue="network")
public class NetworkFileStoreAutoConfiguration{
    @Bean
    public FileStore networkFileStore(){
        return new NetworkFileStore();
    }
}
```
    