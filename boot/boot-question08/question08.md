# Where does Spring Boot look for property file by default?
Spring Boot looks for ```properties``` in the following locations:

- Profile Specific:
    - Outside of Jar:
        - ```application-{profile}.properties``` and ```application-{profile}.yml``` outside of jar in /config subdirectory
        - ```application-{profile}.properties``` and ```application-{profile}.yml``` outside of jar in current directory
    - Inside Jar:
        - ```application-{profile}.properties``` and ```application-{profile}.yml``` inside of jar in /config package on classpath
        - ```application-{profile}.properties``` and ```application-{profile}.yml``` inside of jar in classpath root package
    
- Application Specific
    - Outside of Jar:
        - ```application.properties``` and ```application.yml``` outside of jar in /config subdirectory
        - ```application.properties``` and ```application.yml``` outside of jar in current directory
    - Inside Jar:
        - ```application.properties``` and ```application.yml``` inside of jar in /config package on classpath
        - ```application.properties``` and ```application.yml``` inside of jar in classpath root package

---
    
You can change name of default configuration file with usage of ```spring.config.name``` property:
```$ java -jar myproject.jar --spring.config.name=myproject```

---

You can also explicitly point location of configuration file with usage of ```spring.config.location``` property:
```$ java -jar myproject.jar --spring.config.location=classpath:/defualt.properties```
        