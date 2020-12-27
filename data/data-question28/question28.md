# How are Spring Data repositories implemented by Spring at runtime?
Spring repositories are implemented at runtime by ```SimpleJpaRepository``` by default.

When application context is starting up, Spring will scan for all classes annotated with ```@Configuration```. 
When ```@Configuration``` class with ```@EnableJpaRepositories``` will be detected, ```JpaRepositoriesRegistrar``` with
```JpaRepositoryConfigExtension``` will be used to create bean repositories in packages pointed out by ```basePackages```
field in ```@EnableJpaRepositories```. ```JpaRepositoryFactoryBean``` will use ```JpaRepositoryFactory``` to create beans 
based on bean definitions by default will create instance of ```SimpleJpaRepository``` class for each Repository interface.

Class used for implementation of Repository interface can be customized on:
- Global level, by using ```repositoryBaseClass``` field from ```@EnableJpaRepositories``` annotation
- Single Dao/Repository by creating separate interface and Impl class for behaviour that you want to customize
