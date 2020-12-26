# What do you need to do in Spring if you would like to work with JPA?
Following steps are required to work with JPA in Spring Framework:
- Declare maven dependencies:
    - JPA API - ```javax.persistence:javax.persistence.api```
    - Spring ORM - ```org.springframework:spring.orm```
    - ORM of your choice, for example - ```org.hibernate:hibernate.core```
    - Database Driver, for example - ```org.hsqldb:hsqldb```
    - Optionally, but recommended, Spring Data JPA - ```org.springframework.data:spring-data-jpa```
- Define Datasource Bean
- Define PlatformTransactionManager, in case of JPA ```JpaTransactionManager```
- Define ```EntityManagerFactoryBean```
    - ```LocalContainerEntityManagerFactoryBean``` for standalone application
    - ```EntityManagerFactory``` from JNDI
    - ```LocalEntityManagerFactoryBean``` for tests purposes 
- Define ```@Entity``` classes with at least on ```@Id``` field
- Define DAO classes, or use Spring Data JPA Repositories
