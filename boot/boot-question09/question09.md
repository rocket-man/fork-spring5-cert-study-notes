# How do you define profile specific property files?
Spring Boot allows you to define profile specific property files in two way:
- Dedicated property file per profile
    - ```application-{profile}.properties```
    - ```application-{profile}.yml```
        - You can use ```application-default.properties``` or ```application-default.yml``` filename to specify 
          property file that should be used when no profile is set.
- Multi-profile YAML Document
```yaml
server:
  url: https://local.service.com/
---
spring:
  profiles: dev
server:
  url: https://dev.service.com/
---
spring:
  profiles: prod
server:
  url: https://prod.service.com/
```