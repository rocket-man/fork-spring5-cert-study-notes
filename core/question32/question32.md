# Where can properties in the env come from - there are many sources for properties - check the documentation if not sure. Spring Boot adds even more.
Property Sources in Spring Application vary based on type of applications that is being executed:
- Standalone Application
- Servlet Container Application
- Spring Boot Application

Property Sources for Standalone Applications:
- Property Files
- JVM System Properties
- System Environment Variables 

Property Sources for Servlet Container Applications Spring Framework Applications (when using Tomcat):
- Property files
- JVM System Properties
- System Environment Variables
- JNDI
- ServletConfig init params
- ServletContext init params 

Property Sources for Spring Boot Applications:
- Devtools properties from ~/.spring-boot-devtools.properties (when devtool is active)
- ```@TestPropertySource``` annotations on tests
- Property attributes in ```@SpringBootTest``` tests
- Command line arguments
- Properties from SPRING_APPLICATION_JSON property
- ServletConfig init params
- ServletContext init params 
- JNDI attributes from java:comp/env
- JVM System Properties
- System Environment Variables
- RandomValuePropertySource - ${random.*}
- application-{profile}.properties and YAML variants - outside of JAR 
- application-{profile}.properties and YAML variants - inside of JAR
- application.properties and YAML variants - inside JAR
- ```@PropertySource``` annotations on ```@Configuration``` classes
- Default properties - SpringApplication.setDefaultProperties

