# spring5-cert-study-notes
A repository to keep track of the studies on the pursue of the Spring 5 certification

![spring](spring.png)

# Official Spring Framework Documentation
https://docs.spring.io/spring-framework/docs/5.0.5.RELEASE/spring-framework-reference/index.html.

# Resources
https://www.udemy.com/course/spring-professional-certification-exam-tutorial-module-03/ by Dominik Cebula

https://pivotalcontent.s3.amazonaws.com/academy/Spring-Professional-Certification-Study-Guide.pdf

https://www.ivankrizsan.se/my-books/ This awesome guy's book -> Core Spring 5 Certification in Detail 

# Content
**core** -> application-context, life-cycle of Spring beans, AnnotationConfigApplicationContext, FileSystemXmlApplicationContext, BeanFactoryPostProcessor,       BeanPostProcessor, ContextLoaderListener, AbstractDispatcherServletInitializer, @ContextConfiguration, @RunWith(SpringRunner.class), @SpringJUnitConfig,   registerShutdownHook, Bean Scopes, @Component, @Autowired, @ComponentScan, @Qualifier, @Configuration, @Lazy, @Profile, @PropertySource, ProperySourcesPlaceholderConfigurer, @PreDestroy, @PostConstruct, JSR-250, Java Config, @Bean, @Value("# , SpEL, StandardServletEnvironment

**aop** -> Cross cutting concern, Pointcut, join point, advice, aspect, weaving, JDK dynamic proxies, CGLIB proxies, @Before, @AfterReturning, @After, @Around, @EnableAspectJAutoProxy, execution(*, within(, ProceedingJoinPoint

**data** -> 
  - (JDBC) => DataSource, JndiDataSourceLookup, JdbcTemplate, callbacks: ResultSetExtractor, RowCallbackHandler, RowMapper, batchUpdate, execute, query, queryForList, queryForMap, queryForObject, queryForRowSet, update; 
  - (Transactions) => @Transactional, a local and a global transaction, The transaction isolation level, noRollbackFor, noRollbackForClassName, propagation, readOnly, rollbackFor, PlatformTransactionManager?, @EnableTransactionManagement, declarative transaction management; 
  - (JPA) => DataSource, EmbeddedDatabase, spring.datasource.jndi-name, PlatformTransactionManager, ORM, PersistenceContext, EntityManager, @Entity, Spring Data repository, @EnableJpaRepositories, find(First[count])By[property expression], @Query

**mvc** -> web layer, DispatcherServlet, annotations like @Controller, @RequestMapping, @GetMapping, @RequestParam, @PathVariable

**rest** ->  http, RestTemplate, annotations like @RequestBody, @ResponseBody, @ResponseStatus

**security** -> authorisation, authetication, WebSecurityConfigurerAdapter class, @EnableWebSecurity, DelegatingFilterProxy,** patter, antMatcher, mvcMatcher, @EnableGlobalMethodSecurity, @RolesAllowed, @PreFilter, @PostFilter, @PreAuthorize, @PostAuthorize

**boot** -> 
  - (intro) => @SpringBootApplication, spring-boot-starter-parent, spring-boot-devtools, @Configuration, @ConfigurationProperties, Automatic configuration; @ConditionalOnClass, @ConditionalOnWebApplication, ..., META-INF/spring.factories, application.properties, YAML, @SpringBootApplication, @EnableAutoConfiguration, @EntityScan, Logging, @SpringBootConfiguration, Fat Jar, Uber Jar Embedded Containers: Tomcat, Jetty and Undertow
  - (auto-configuration) => @SpringBootApplication, spring-boot-starter-parent, spring-boot-devtools, @Configuration, @ConfigurationProperties, Automatic configuration; @ConditionalOnClass, @ConditionalOnWebApplication, ..., META-INF/spring.factories
  - (actuator) =>  HTTP, JMX, Logging level, list of prod ready endpoints, /actuator/info, /actuator/health, HealthIndicators, CustomHealthIndicator, management.endpoint.health.status.order, mapping, metrics, 3rd party external monitoring systems
  - (testing) => @SpringBootTest, @AutoConfigureMockMvc, @MockMvc, spring-boot-starter-test, SpringBootTest.WebEnvironment.RANDOM_PORT or DEFINED_PORT, @WebMvcTest, @MockBean vs @Mock, @DataJpaTest

**testing** -> integration, transactional, mockito, easymock, @ContextConfiguration, @SpringBootTest, @SpringBootApplication, @SpringBootConfiguration

# This notes and src
The notes should answer the question by explaining the concept with words while the src should prove the previous theoretical explanation with code.  
