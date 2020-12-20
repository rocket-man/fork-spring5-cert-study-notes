# spring5-cert-study-notes
A repository to keep track of the studies on the pursue of the Spring 5 certification

![spring](spring.png)

# Official Spring Framework Documentation
https://docs.spring.io/spring-framework/docs/5.0.5.RELEASE/spring-framework-reference/index.html

# Resources
https://www.udemy.com/course/spring-professional-certification-exam-tutorial-module-03/ by Dominik Cebula

https://pivotalcontent.s3.amazonaws.com/academy/Spring-Professional-Certification-Study-Guide.pdf

https://www.ivankrizsan.se/my-books/ This awesome guy's book -> Core Spring 5 Certification in Detail 

# Content
**core** -> application-context, life-cycle of Spring beans, AnnotationConfigApplicationContext, FileSystemXmlApplicationContext, BeanFactoryPostProcessor,       BeanPostProcessor, ContextLoaderListener, AbstractDispatcherServletInitializer, @ContextConfiguration, @RunWith(SpringRunner.class), @SpringJUnitConfig,   registerShutdownHook, Bean Scopes, @Component, @Autowired, @ComponentScan, @Qualifier, @Configuration, @Lazy, @Profile, @PropertySource, ProperySourcesPlaceholderConfigurer, @PreDestroy, @PostConstruct, JSR-250, Java Config, @Bean, @Value("# , SpEL, StandardServletEnvironment

**aop** -> Cross cutting concern, Pointcut, join point, advice, aspect, weaving, JDK dynamic proxies, CGLIB proxies, @Before, @AfterReturning, @After, @Around, @EnableAspectJAutoProxy, execution(*, within(, ProceedingJoinPoint

**data** -> DataSource, JndiDataSourceLookup, JdbcTemplate, callbacks: ResultSetExtractor, RowCallbackHandler, RowMapper, batchUpdate, execute, query, queryForList, queryForMap, queryForObject, queryForRowSet, update, @Transactional, a local and a global transaction, The transaction isolation level, noRollbackFor, noRollbackForClassName, propagation, readOnly, rollbackFor, PlatformTransactionManager?, @EnableTransactionManagement, declarative transaction management

**mvc** -> web layer, annotations like @Controller, @RequestMapping, @GetMapping, @RequestParam, @PathVariable

**rest** ->  http, RestTemplate, annotations like @RequestBody, @ResponseBody, @ResponseStatus

**security** -> auth, filter, proxy, chain, context, ** patter, antMatcher, mvcMatcher, @PreAuthorised, @RolesAllowed

**boot** -> autoconf, actuator, health, yml, war, jar, test

**testing** -> integration, transactional, mockito, easymock, @ContextConfiguration, @SpringBootTest, @SpringBootApplication, @SpringBootConfiguration

# This notes and src
The notes should answer the question by explaining the concept with words while the src should prove the previous theoretical explanation with code.  
