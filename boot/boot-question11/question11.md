# What properties do you have to define in order to configure external MySQl?
To configure external MySQL in Spring Boot you need to specify ```URL```, ```Username``` and ```Password``` for ```Data Source```
by defining following properties.
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/spring-tutorial
spring.datasource.username=spring-tutorial
spring.datasource.password=spring-tutorial
```
Optionally, you can also explicitly specify JDBC Driver:
```properties
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```
To initialize Database during application startup via ```data.sql``` and ```schema.sql``` you also need to specify property:
```properties
spring.datasource.initialization-mode=always
```
You also need to specify connector dependency:
```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>
```

You will also need a way to access database, simplest approach is to use JDBC:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jdbc</artifactId>
</dependency>
```
