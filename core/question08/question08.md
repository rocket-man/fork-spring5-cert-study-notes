# How are you going to create an ApplicationContext in an integration test ?
- Make sure that you have spring test dependency added
    - groupId: org.springframework
    - artifactId: spring-test 
    - version: 5.1.6.RELEASE 
    - scope: test
    

- Add Spring Runner to your test
    - @RunWith(SpringRunner.class)

    
- Add Context Configuration to your test    
    - @ContextConfiguration(classes = ApplicationConfiguration.class)