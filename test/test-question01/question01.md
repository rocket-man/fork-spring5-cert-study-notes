# Do you use Spring in a unit test?
Spring framework is usually not used in unit tests (with regards of IoC/DI), however Spring contains some support for unit testing within following 
packages:
- ```org.springframework.test.utils```
    - ```ReflectionTestUtils```
        - ORM Entities related testing - set value for private field, normally handled by ORM
        - Manual dependency injection into private field, normally handled by ```@Autowired, @Inject```
        - ```@PostConstruct``` and ```@PreDestroy``` lifecycle callback method testing
    - ```AopTestUtils``` - Aspect Oriented Programming related testing
    
- ```org.springframework.test.web```
    - ```ModelAndViewAssert``` - Unit testing for Spring MVC Controllers
    
- ```org.springframework.mock.env```
    - mock implementations of the Environment and PropertySource
    - ```MockEnvironment, MockPropertySource```
    
- ```org.springframework.mock.jndi```
    - Mock implementation of JNDI SPI - usually used for Java EE
    
- ```org.springframework.mock.web```
    - Servlet API mock objects
    
To get full understanding on why Spring is usually not used for unit tests, however some support for unit testing exists 
within the framework, we need to get deeper into testing subject and understanding differences between:
- Units Tests
- Integration Tests
- System Tests

Having uderstanding on purpose and range of testing performed on each level will make it clear to know which type of test Spring
IoC/DI should be used and at high level only Spring Mocks should be used, without involving Spring IoC/DI

---
Unit tests should test one unit of functionality in isolation. This unit of functionality can be defined as single method, class, module
component. In OOP, unit of functionality is usually defined as single class. Testing in isolation, means that environment of execution 
is not initiated during testing and should not affect testing process, any dependencies on environment should be mocked. 
All class collaborators should be mocked as well. Testing should be performed outside of container, that means that IoC/DI should not be 
required to create instances of objects under test. Test should execute successfully as out of container tests.

---

Integration tests should test multiple modules or components that are combined together. Those modules should be already unit tested
and on Integration Test level some subset of functionalities should be checked, to test if modules provide requested functionalities
should be checked, to test if modules provide requested functionalities when cooperating together under environment that should be close
to production one, however with assumptions that some of the components might still be mocked. When performing Integration Test we want 
to initiate subset of system and execute test against it. IoC/DI Container is used for this kind of testing, with some simplification 
upon deployment or container execution.

---

System test should check required system functionality on fully running system, consisting of all modules and environment that is 
as close as possible to production one. System under System Tests level should already be checked on unit and integration test level,
and on System level only subset of functionalities should be checked to fill the gaps that were not possible to test on unit and integration 
testing level. IoC/DI container is used with assumption that it is used in the same way as production environment. 

In practice, large scale enterprise systems needs to have testing strategy defined to test system that is being developed in efficient 
manner. Often used strategy for test automation is "Testing Pyramid". It assumes that Unit, Integration and System Tests are implemented,
with right ratio on number of tests on each level.

- System Test - sits on top of the pyramid
    - Execution: slow
    - Maintenace: expensive
    - Easy to test system cases
    - Hard to test Detailed cases
    
- Integration Tests - sits in the middle
    - Execution: middle to slow
    - Maintenance: Medium to high cost
    - Details testing is a challenge
    - Easy to test integration between components
    
- Unit Tests - sits at the base
    - Execution is fast
    - Maintenance is cheap
    - Hard or impossible to test Integration/System cases
    - Easy to test detailed Cases
    
