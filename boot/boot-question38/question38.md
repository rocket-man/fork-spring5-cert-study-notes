# When do you want to use @SpringBootTest annotation?
You should use ```@SpringBootTest``` annotation whenever writing JUnit Integration Test for a product that is using Spring boot.

Spring Boot approach to Integration Testing simplifies it by eliminating requirenments of application deployment or establishing 
connection to other infrastructure.

```@SpringBootTest``` annotation enables Spring Boot specific features on top of Spring Test that are useful for testing, like:
- Automated Context creation through ```SpringApplication``` class
- Web Environment for testing - ```Mocked``` or ```Embedded```
- Mocked Bean injection via ```@MockedBean``` annotation
- Spy Injection via ```@SpyBean``` annotation
- Ability to customize created context with ```@TestConfiguration``` annotated classes
- Auto configurations for:
    - MVC Testing
    - JSON Testing 
    - JPA Tests
    - JDBC Tests
    - Mongo DB Tests
    - and more...
    
To use ```@SpringBootTest``` annotation, you will need to add ```@RunWith(SpringRunner.class)``` annotation on top of your 
test class first, this is required **only for JUnit4**, for JUnit5 ```@ExtendedWith(SpringExtension.class)``` annotation is already
contained in ```@SpringBootTest``` annotation.

Next you need to use ```@SpringBootTest``` annotation:

```java
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTest{
    
    @Test
    public void shouldPerformSomeActionCorrectly() throws Exception{
        
    }
}
```