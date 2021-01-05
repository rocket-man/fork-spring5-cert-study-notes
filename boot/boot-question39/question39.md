# What does @SpringBootTest auto-configure?
```@SpringBootTest``` annotation will auto-configure:
- ```ApplicationContext``` for testing
- Test itself with tools used for testing

```ApplicationContext``` is configured by searching for ```SpringBootApplication``` or ```@SpringBootConfiguration``` 
annotated classes, based on those bean definitions will be created.

It is also possible to test only slice of the application with usage one of following:
- ```@SpringBootTest#classes```
- ```@ContextConfiguration#classes```
- ```@AutoConfigure...``` annotations

```@AutoConfigure...``` annotation allows you to configure specific environment and tools for testing, for example ```@AutoConfigureMockMvc```
will configure Mock Mvc that can be used for controllers testing.

Spring Boot test includes annotations that are wrapping ```@AutoConfigure...``` annotations and make test development simpler:
- ```@JsonTest```
- ```@WebMvcTest```
- ```@WebFluxTest```
- ```@DataJpaTest```
- ```@JdbcTest```
- ```@JooqTest```
- ```@DataMongoTest```
- ```@DataLdapTest```
- ```@RestClientTest```
- ```...```

Each of this annotation uses ```@AutoConfigure...``` annotations and also ```@ExtendedWith(SpringExtension.class)``` for 
JUnit 5, which makes test development easier