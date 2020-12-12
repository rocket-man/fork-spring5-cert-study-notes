# What can you reference using SpEL?
You can reference following using SpEL:
- Static fields from class -> ```T(org.spring.SpringBean1).DEFAULT_NAME```
- Static methods from class -> ```T(org.spring.SpringBean1).getDefaultName()```
- Spring Bean Property -> ```@springBean1.name```
- Spring Bean Method -> ```@springBean1.getName()```
- SpEL variables -> ```#springBean1Name```
- Object Property on reference assigned to SpEL variables -> ```#springBean1.name```
- Object Method on reference assigned to SpEL variables -> ```#springBean1.getName()```
- Spring Application Environment Properties -> ```environment['app.file.property']```
- System Properties -> ```systemProperties['app.vm.property']```
- System Environment Properties -> ```systemEnvironment['JAVA_HOME']```