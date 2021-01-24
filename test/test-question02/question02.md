# What type of tests typically use Spring?
Integration tests are type of tests that typically use Spring. Reason for it is that on Integrated test level we want to 
test multiple components that are combined together, and we want to check if those components provide requested functionalities
when cooperating together under environment that should be close to production one, however with assumptions that some of 
components might still be mocked. When performing integration Test we want to initiate subset of system and executes test against it.

IoC/DI Container is used for this kind of testing, with some simplification upon deployment or container execution. Dependencies 
are resolved and injected by Spring.

Spring provides great support for integration testing, with main goals of the support being:
- Management of Spring IoC container and IoC container caching between tests
    - Spring will create and manage IoC container for tests
    - Context can be reused between tests 
    - Main purpose of context being reused is to improve test execution time
    - Execution times of integration tests might be long mainly because of Embedded Database, hibernate and other components 
      tha are created once context is created
      
- Dependency Injection in Tests
    - allows for easy Spring test definition with usage of ```@RunWith(SpringRunner.class)```
    - ```@ContextConfiguration``` can be used in tests to configure context
    - Support for ```@Autowired, @Inject```
    - Allows customization with ```@TestExecutionListener```
    
- Transaction management appropriate to integration testing
    - Resolves issue with test affecting each other on data level by implementing proper transaction management
    - By default, all transactions are roll-back transactions
    - Gives ability to commit transactions if required
    
Additionally, Spring provides following tools to simplify Integration Testing:
- JDBC Testing Support 
    -  ```JdbcTestUtils``` provides JDBC related utility functions
    - ```countRowsInTable, countRowsInTableWhere, deleteFromTable, deleteFromTableWhere``` 
    
- Spring MVC testing support
    - Allow for easy setup with:
        - ```@RunWith(SpringRunner.class)```
        - ```@WebAppConfiguration```
        - ```@ContextConfiguration```
    - Automatically creates ```MockMvc```
    
- HtmlUnit Integration 
    - Simplifies end-to-end testing for HTML views
    
- Client-Side Rest Test
    - Allows you to test Client code that interacts with mocked REST Service
    - Use ```RestTemplate``` with ```MockRestServiceServer``` to make assertions on mock
    
---

Spring annotation for Integration Testing are the following:
- @ContextConfiguration
    - Allows you to specify how to load and configure an ApplicationContext for integration tests
    - You can specify ```@Configuration``` classes that will be used during ```ApplicationContext``` loading
    - Optionally, you can specify XML configuration files locations, if you are using it instead of annotated ```@Configuration```
    classes
      
    ```java
        @RunWith(SpringRunner.class)
        @ContextConfiguration(classes = ApplicationConfiguration.class)
        public class ApplicationServiceIntegrationTest{
            //...
        }
    ```

- @BootstrapWith
    - Allows for low-level control on how Context for tests is created
    - To implement custom bootstrapped, it is best to extend ```AbstractTestContextBootstrapper```
    - Used at class-level
    

- @DirtiesContext
    - Mark test as one that modifies state of context, and it means that context should be recreated prior next test execution 
    because otherwise modified context state might affect test execution
      
      ```java
          @Test
          @DirtiesContext
          public void should_book_any_room_for_guest(){
          
          }
      ```
      
    - When used at class-level you can specify following modes:
        - BEFORE_CLASS
        - BEFORE_EACH_TEST_METHOD
        - AFTER_CLASS
        ```java
            @DirtiesContext(classMode = AFTER_EACH_TEST_METHOD)  
        ```
    - When used at method level you can specify following modes:
        - BEFORE_METHOD
        - AFTER_METHOD
      ```java
          @DirtiesContext(methodMode = AFTER_METHOD)
      ```

- @ActiveProfiles
    - class level annotation that is used to declare which bean definition profiles should be active when loading an application context
    ```java
      @RunWith(SpringRunner.class)  
      @ContextConfiguration(classes = ApplicationConfiguration.class)
      @ActiveProfiles({"test", "example-data"})
      public class ApplicationServiceIntegrationTest(){
            //...  
      }
    ```
  
- @TestPropertySource
    - class-level annotation that you can use to configure the locations of properties files and inlined properties
    
        ```@TestPropertySource("/application-test.properties")```
      
        ```@TestPropertySource(properties = {"user = test-user", "group = test-group"})```

- @WebAppConfiguration
    - class level annotation that triggers creation of ```MockServletContext``` which serves as the ```ServletContext```
    for the test's ```WebApplicationContext```
    - Indicates that ```ApplicationContext``` loaded for an integration test should be a ```WebApplicationContext```
      ```java
          @RunWith(SpringRunner.class)
          @ContextConfiguration
          @WebAppConfigutarion
          public class ApplicationServiceIntegrationTest{
          
          }
      ```
      
- @ContextHierarchy
    - used when hierarchy of application contexts has to be used for integration test
      ```java
          @RunWith(SpringRunner.class)
          @WebAppConfigutarion
          @ContextHierarchy({
                @ContextConfiguration(classes = AppConfig.class),
                @ContextConfiguration(classes = WebConfig.class) 
          })
          public class ApplicationServiceIntegrationTest{
          
          }
      ```
      
- @TestExecutionListeners
    - Allows registration of ```TestExecutionListener``` which allows for customization of test execution
    - Example of ```TestExecutionListener``` that is registered by default is ```DirtiesContextTestExecitionListener```
    ```java
        @RunWith(SpringRunner.class)
        @ContextConfigutarion(classes = ApplicationConfiguration.class)
        @TestExecutionListeners({
            CustomTestExecutionListener1.class,
            CustomTestExecutionListener2.class
        })
        public class ApplicationServiceIntegrationTest(){
            //...
        } 
    ```
  
- @Commit
    - class or method level annotation
    - indicates that after test execution, transaction should be committed.
    
    ```java
        @Test
        @Commit
        public void should_book_any_room_for_any_guest(){
            //...
        } 
    ```

- @Rollback
    - class or method level annotation that indicates that transaction should be rolled back after test execution
    - Even if ```@Rollback``` is not explicitly defined, all transactions under tests will be rolled back by default

    ```java
        @Test
        @Rollback()
        public void should_book_any_room_for_any_guest(){
            //...
        } 
    ```
  
- @BeforeTransaction
    - indicates method that should be executed before transaction is started.
    

- @AfterTransaction
    - indicates method that should be executed after transaction is started.

    
- @Sql
    - indicates Sql script that should be executed against database during integration test
    ```java
    @Test
    @Sql({
        "/test-schema.sql", 
        "/test-data.sql"}) 
    public void should_book_any_room_for_any_guest(){
        //...
    }
  ```


- @SqlConfig
    - Defines metadata used for SQL script parsing
        ```java
          @Test
          @Sql(
                scripts = "/test-schema.sql",
                config = @SqlConfig(commentPrefix = "`", separator = "@@")
          )
          public void should_book_any_room_for_any_guest(){
            //...
          }
        ```
      
- @SqlGroup
    - Allows you to use multiple @Sql annotations
      ```java
          @Test
          @SqlGroup({
                @Sql(scripts = "/test-schema.sql", config = @SqlConfig(commentPrefix = "`", separator = "@@")),
                @Sql("/test-data.sql")
          })
          public void should_book_any_room_for_any_guest(){
            //...
          }
        ```