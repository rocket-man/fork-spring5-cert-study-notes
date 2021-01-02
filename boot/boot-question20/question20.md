# How are DataSource and JdbcTemplate auto-configured?
```DataSource``` and ```JdbcTemplate``` are configured by Auto Configuration Classes defined in ```spring-boot-autoconfigure```
module.

```DataSource``` is configured by ```DataSourceAutoConfiguration```,```JdbcTemplate``` is configured by ```JdbcTemplateAutoConfiguration```.
```DataSourceAutoConfiguration``` requires some properties to be defined, example below shows MySql configurator:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/spring-tutorial
spring.datasource.username=root
spring.datasource.password=
```
Above properties will be injected into ```DataSourceProperties``` by the prefix ```spring.datasource``` and used by 
```DataSourceAutoConfiguration```. 

After having Auto Configuration enabled by default in Spring Boot, configured properties and Database Connector on your 
classpath, you can just use ```@Autowire``` to inject ```DataSource``` or ```JdbcTemplate``` 

