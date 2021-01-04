# How do you change logging level of a package using loggers endpoint?
Spring Actuator allows you to list currently configured loggers with their levels in following ways:
- via ```HTTP``` by visiting ```/actuators/loggers``` endpoint
- via ```JMX``` by executing ```org.springframework.boot/Endpoint/Loggers/Operations/loggers```

```loggers``` endpoint is exposed by default via ```JMX```, to use it via ```HTTP``` you need to expose it by setting following
property in ```application.properties```:

```properties
management.endpoints.web.exposure.include-loggers
```

You can also view logging level for individual logger:
- via ```HTTP``` by visiting ```/actuator/loggers/{LOGGER_NAME}```, for example,
```/actuator/loggers/org.spring.cert.question28```
  
```json
{
 "configuredLevel": null,
  "effectiveLevel": "INFO"
}
```

- via ```JMX``` by executing
```org.springframework.boot/Endpoint/Loggers/Operations/loggerLevels``` with provided name parameter
  
You can change logging level for package by:

- ```HTTP``` via ```POST``` to ```/actuator/loggers/{LOGGER_NAME}``` ->

```curl -i -X POST -H 'Content-Type: application/json' -d '{"configuredLevel": "TRACE"}' http://localhost:8080/actuator/loggers/org.spring.cert.question28```

- ```JMX``` via ```org.springframework.boot/Endpoint/Loggers/Operations/configureLogLevel``` with name and configuredLevel parameters set
