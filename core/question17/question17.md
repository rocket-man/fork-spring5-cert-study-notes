# What do you have to do, if you would like to inject something into a private field? How does this impact testing?
Injection of dependency into a private field can be done with ``` @Autowired``` annotation:
```java
@Autowired
private ReportWriter reportWriter;
```
Injection of property into a private field can be done with ``` @Value``` annotation:
```java 
@Value("${report.global.name}")
private String reportGlobalName;
```

Private fields cannot be accessed from outside the class, to resolve this when unit testing you can use the following solutions:
- Use ```SpringRunner``` with ```ContextConfiguration``` and ```@MockBean```
- Use ```ReflectionTestUtils``` to modify private fields
- Use ```MockitoJUnitRunner``` to inject mocks
- Use ```@TestPropertySource``` to inject test properties into private fields
