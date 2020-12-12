# Can you describe the lifecycle of a Spring Bean in an application context ?
Context is created:
1. Beans Definitions are created based on Spring Bean Configuration.
2. BeanFactoryPostProcessors are invoked.

Bean is created:
1. Instance of Bean is created.
2. Properties and Dependencies are set.
3. BeanPostProcessor::postProcessorBeforeInitialization gets called.
4. @PostConstruct method gets called.
5. InitializingBean::afterPropertiesSet method gets called.
6. @Bean(initMethod) method gets called.
7. BeanPostProcessor::postProcessAfterInitialization gets called

Bean is ready to use

Bean is destroyed:
1. @PreDestroy method gets called
2. DisposableBean::destroy method gets called
3. @Bean(destroyMethod) method gets called

