# How does Spring Boot simplify writing tests?
Spring Boot simplifies writing tests in the following way:
- Provides  ```@SpringBootTest``` annotation - alternative to ```@ContextConfiguration```, creates ```ApplicationContext```
through ```SpringApplication```, enables Test Auto-Configuration, Enables Spring Boot Test Features
  
- Provides ```@MockBean``` annotation - easy creation and injection of Mockito mock

- Provides ```@SpyBean``` annotation - easy creation and injection of mockito Spy

- Provides ```@WebMvcTest``` annotation - useful when test focuses only on Spring MVC components, disables full auto-configuration
and applies only configuration relevant to MVC tests
  
- Provides Web Environments 
    - MOCK (default)
    - RANDOM_PORT
    - DEFINED_PORT
    - NONE 
  

- Provides an algorithm for tests Environment Auto-Configuration  
    - Based on defined dependencies, beans, properties, resources provides beans necessary for integration tests
    - Allows you to focus on test content instead of focusing on how to configure specified technology for integration test
    
- Allows to explicitly use Auto-Configurations:
    - ```@JsonTest``` - Auto-Configured JSON Tests
    - ```@WebMvcTest``` - Auto-Configured Spring MVC Tests (context limited to MVC)
    - ```@JdbcTest``` - Auto-configured JDBC Tests
    - ```@DataJpaTest``` - Auto-configured Data JPA Test
    - ```@JooqTest``` - Auto-configured jOOQ Tests
    - ```@DataMongoTest``` - Auto-configured Data MongoDB Tests
    - ```@RestClientTest``` - Auto-configured Rest Client
    
- Provides ```spring-boot-starter-test``` module, which include:
    - JUnit 
    - Spring Tests
    - Spring Boot Test
    - AssertJ - fluent assertion library
    - Hamcrest - library of matchers objects
    - Mockito - mocking framework
    - JSONassert - An assertion library for JSON 
    - JsonPath - XPath for Json
    

- Provides ```@Conditional``` annotations
    - ```@ConditionalOnClass```
    - ```@ConditionalOnMissingBean```
    - ```@ConditionalOnMissingProperty```
    - ```@ConditionalOnResource```
    - ```@ConditionalOnExpression```
    
