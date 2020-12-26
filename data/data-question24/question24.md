# What do you have to configure to use JPA with Spring? How does Spring Boot make this easier?
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

# How does Spring Boot make this easier?
Spring boot simplifies JPA setup by:
- Providing ```spring-boot-starter-data-jpa``` dependency which includes all required dependencies
- Providing auto-configuration for JPA
- Automatically defines ```PlatformTransactionManager, EntityManager``` and other required beans.
- Allows Data Source to be configured via properties 
- Provides out-of-the-box support for ```Hikari Connection Pool```
- Provides default properties to JPA
- Automatically creates DAO beans for Repositories