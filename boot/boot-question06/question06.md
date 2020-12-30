# Spring Boot supports both properties and YAML files. Would you recognize and understand them if you saw them?
Spring boot allows you to externalize configuration for the application by using properties stored in properties files that
can be in format:
- YAML
- Java Properties File

YAML is a superset of JSON and it is convenience for specifying hierarchical data. Spring Boot supports YAML properties with
usage of ```SnakeYAML``` library, which is included by default by ```spring-boot-starter```

You can transform application properties between YAML and Java Properties format.

YAML version:
```yaml
app:
  name: spring-boot-app
  description: Example Spring Boot Application
  
  servers:
    - server1
    - server2
    - server3
    
  environment:
    dev:
      name: Development Environment
      url: https://dev.example.com
      
    prod:
      name: Prod Environemnt
      url: https://prod.example.com

```

Java properties version:
```properties
app.name:spring-boot-app
app.description:Example Spring Boot Application
app.servers[0]:server1
app.servers[1]:server2
app.servers[2]:server3
app.environment['dev'].name:Development Environment
app.environment['dev'].url:https://dev.example.com
app.environment['prod'].name:Prod Environment
app.environment['prod'].url:https://prod.example.com
```