# What are the differences between @MockBean and @Mock?
```@Mock``` annotation comes from Mockito Framework which allows for easy Mock creation. This annotation is used by 
```MockitoJUnitRunner```, each field annotated with it will have Mock for specified class created. This annotation does
not inject mocks into tested class on itself, to use injection you need to have target class annotated with ```@InjectMocks```
annotation.

```@MockBean``` annotation comes from spring-boot-test, it creates Mockito Mock and also injects it into Application 
Context created by ```@SpringBootTest```. All beans which refers to mocked class via ```@Autowired``` will get this mock
injected instead of real class.

Main difference between ```@MockBean``` and ```@Mock``` annotation is that ```@MockBean``` creates mock and **injects it into
Application Context**, while ```@Mock``` annotation only **creates it**, if you want to inject it, you can do it manually
or with ```@InjectMocks``` annotation, however injection is being done **to the class not whole Application Context**