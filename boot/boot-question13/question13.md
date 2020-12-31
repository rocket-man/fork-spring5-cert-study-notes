# What is a fat jar? How is it different from original jar?
Fat jar also called "executable jar", is a jar that contains compiled code for your application and also all dependencies. 
Spring Boot uses nested jars approach, that means that fat jar contains all dependencies as nested jars. This differs
from other approach, which is uber jar that packs all dependencies into single jar archive. Uber jar approach is problematic
because is hard to see application dependencies and also causes issues when same filename in the same context is used 
in different jars.

Fat jar is often called "executable jar" because Spring Boot will generate ```MANIFETS.MF``` file which contains ```Main-Class```
and ```Start-Class``` entries together with JarLauncher code. This manifest together with launcher code will be used to 
execute standalone jar.

To create fat jar in your project, you need to use ```spring-boot-maven-plugin```

Executing application is a simple as executing command:
```java -jar spring-boot-application-1.0-SNAPSHOT.jar``` 

The differences in comparison to original jar are the following:
- Original jar does not contain all dependencies
- Original jar is not executable by default