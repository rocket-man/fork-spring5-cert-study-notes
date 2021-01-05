# What is metrics for?
Spring Actuator provides ```metrics``` endpoint which can be used to examine metrics collected by the applications during 
runtime.

```metrics``` endpoint allows you to view information about specific metric by visiting metric dedicated URI, for example 
```/actuator/metrics/jvm.memory.used?tag=area:heap```

```metrics``` endpoint allows you to view many out-of-the box defined metrics:
- CPU usage, CPU Core Count
- Memory usage, Max Memory Available
- Threads Info
- Garbage Collector Statistics
- HTTP Requests Info
- Embedded Tomcat Related Metrics
- ... (many more, also you can define custom metrics) 

```metrics``` endpoint is not exposed via Web by default, to have it available, you need to add following entry to the ```application.properties```:
```properties
management.endpoints.web.exposure.include=metrics
```

