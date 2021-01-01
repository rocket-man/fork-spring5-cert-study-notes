# What does @EnableAutoConfiguration do?
```@EnableAutoConfiguration``` annotation turns on auto-configuration of Spring Context. Auto-configuration 
tries to guess Spring Beans that should be created for your application based on configured dependencies and 
configurations with ````@ConditionalOn...```` annotations.

When auto-configuration is turned on, Spring will search for ```META-INF/spring.factories``` on classpath, whenever entry
```org.springframework.boot.autoconfigure.EnableAutoConfiguration``` is encountered in this file, Auto Configuration Class
pointed by this property is loaded. When condition present in ```@ConditionalOn...``` annotation is matched, beans pointed 
out by this configuration are created. 

```@EnableAutoConfiguration``` annotation should be applied to your application ```@Configuration``` class, when using Spring
Boot with ```@SpringBootApplication``` annotation, ```@EnableAutoConfiguration``` annotation is not required because auto-
configuration is turned on by default.