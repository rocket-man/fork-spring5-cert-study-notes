# What does @SpringBootApplication do?
```@SpringBootApplication``` annotation is supposed to be used on top of the class it was introduced for convenience. Usage 
of ```@SpringBootApplication``` annotation is equivalent to usage of following three annotations:
- ```@Configuration``` - allows additional bean registration
- ```@EnableAutoConfiguration``` - enables context auto-configuration
- ```@Configuration``` - turns on scanning for ```@Component``` annotated classes

