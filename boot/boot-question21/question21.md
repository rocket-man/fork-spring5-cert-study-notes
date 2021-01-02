# What is ```spring.factories``` file for?
```spring.factories``` file, located ```META-INF/spring.factories``` location on the classpath, is used by Auto Configuration
mechanism to locate Auto Configuration Classes. Each module that provides Auto Configuration Class needs to have ```META-INF/spring.factories```
file with ```org.springframework.boot.autoconfigure.EnableAutoConfiguration``` entry that will point Auto Configuration Classes.

```META-INF/spring.factories``` file is consumed by ```SpringFactoriesLoader``` class, which is used by ```AutoConfigurationImportSelector```
enabled by ```@EnableAutoConfiguration``` annotation used by default in ```@SpringBootApplication``` annotation.

Each Auto Configuration Class lists conditions, in which it should be applied, usually based on existence of specific class
on the classpath or bean in the context. When conditions are met, ```@Configuration``` class produced beans within application 
context to integrate your application with desired technology.

Auto Configuration use case for ```spring.factories``` file is probably most popular one, it also allows you to define 
other entries and achieve customization with following classes:
- ApplicationContextInitializer
- ApplicationListener
- AutoConfigurationImportFilter
- AutoConfigurationImportListener
- BeanInfoFactory
- ContextCustomizer
- DefaultTestExecutionListenerPostProcessor
- EnableAutoConfiguration
- EnvironmentPostProcessor
- FailureAnalysisReporter
- FailureAnalyzer
- ManagementContextConfiguration
- PropertySourceLoader
- ProxyDetector
- RepositoryFactorySupport
- SpringApplicationRunListener
- SpringBootExceptionReporter
- TemplateAvailabilityProvider
- TestExecutionListener