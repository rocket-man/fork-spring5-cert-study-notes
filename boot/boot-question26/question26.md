# What are the actuator endpoints that are provided out of the box

| ID           | Description           | Enabled by default  |   Exposed via JMX by default  |  Exposed via Web by default   |
| -------------|:---------------------:| -------------------:|---------------------|--------------------|
| auditevents  | Exposes audit events information for the current application | Yes, but it requires an AuditEventRepository bean |  Yes   |    No    |
| beans        | Displays a complete list of all the Spring beans in your application       |   Yes |   Yes |  No  |
| caches       | Exposes available caches       |    Yes  |   Yes    |  No   |
| conditions   | Shows the conditions that were evaluated on configuration and auto-configuration classes and the reason why they did or did not match     |   Yes |   Yes |  No  | 
| configprops  | Displays a collated list of all @ConfigurationProperties  |  Yes  |   Yes    |  No  |
| env          | Exposes properties from Spring's ConfigurableEnvironment  |  Yes  |   Yes    |  No  |
| flyway       | Shows any flyway database migrations that have been applied  |  Yes  |   Yes    |  No  |
| health       | Shows application health information  |  Yes  |   Yes    |  Yes  |
| httptrace    | Displays HTTP trace information (by default the last 100 HTTP request-respose exchanges) | Yes, but it requires an HttpTraceRepository bean |  Yes   |    No    |
| info    | Displays arbitrary apoplication info | Yes  |  Yes   |    Yes    |
| integrationgraph    | Shows the Spring integration graph | Yes |  Yes   |    No    |
| loggers    | Shows and modifies the configuration of loggers in the application | Yes |  Yes   |    No    |
| liquibase    | Shows any liquibase database migration that has been applied |  Yes|  Yes   |    No    |
| metrics    | Shows metric information for the current application | Yes |  Yes   |    No    |
| mappings    | Displays a collated list of all @RequestMapping paths | Yes |  Yes   |    No    |
| scheduledtasks | Displays the scheduled tasks in your application | Yes |  Yes   |    No    |
| sessions    |  Allows retrieval and deletion of user sessions from Spring session backed session store. Not available when using Spring Session's support for reative web applications | Yes |  Yes   |    No    |
| shutdown    |  Lets the application be gracefully shutdown | No |  Yes   |    No    |
| threaddump    | Performs a thread dump | Yes |  Yes   |    No    |
| prometheus    | Expose metrics in a format that can be scraped by prometheus server  | Only for Web Application |  N/A   |    No    |
| heapdump    | Returns an hprof heap dump file | Only for Web Application  |   N/A   |    No    |
| jokolia    | Exposes JMX beans over HTTP (when Jokolia is on classpath, not available for WebFlux) | Only for Web Application| N/A   |    No    |
| logfile    | Returns the contents of the logfile (if logging.file.name or logging.file.path properties have been set) Supports the use of the HTTP Range header to retrieve part of the log file's content | Only for Web Application |  N/A   |    No    |

You can enable or disable Actuator Endpoints with usage of property:
```property
management.endpoint.{ENDPOINT_NAME}.enable=true
```

For example:
- ```management.endpoint.shutdown.enabled=true```
- ```management.endpoint.beans.enabled=false```
- ```management.endpoint.info.enabled=false```

You can also disable `Enable by default` behaviour with usage of property:
```management.endpoints.enabled-by-default=false```

You can change endpoints exposure with usage of properties:
- ```management.endpoints.jmx.exposure.exclude```
- ```management.endpoints.jmx.exposure.include```
- ```management.endpoints.web.exposure.exclude```
- ```management.endpoints.web.exposure.include```

For example:
```management.endpoints.web.exposure.include=info, health, env, beans```

You can also expose all endpoints with usage wildcard, for example:
```management.endpoints.web.exposure.include=*```

You can enable navigation through Actuator Endpoints, by usage of HATEOAS.

To enable this navigation, all you have to do is to add dependency to your project:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-hateoas</artifactId>
</dependency>
```
After having this dependency, visiting main Actuator page:
```http://localhost:8080/actuator```
 
Will give you ```_links``` element in response, that can be used for navigation.

