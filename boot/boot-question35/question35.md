# What are the Health Indicator Statuses that are provided out of the box
Spring Boot Actuator provides following Health Indicator Statuses out of the box:
- ```UP``` - component or subsystem is functioning as expected
- ```DOWN``` - component or subsystem has suffered an unexpected failure
- ```OUT_OF_SERVICE``` - component or subsystem has been taken out of service and should not be used.
- ```UNKNOWN``` - component or subsystem is in an unknown state

Based on Health Indicator Statuses from above, Spring will also perform default mapping of statuses to HTTP response codes
with usage of ```HealthStatusHttpMapper``` that follows this default configuration:
- ```UP``` -> HTTP 200
- ```DOWN``` -> HTTP 503
- ```UNKNOWN``` -> HTTP 200
- ```OUT_OF_SERVICE``` -> HTTP 503

You can change default mapping with usage of ```management.health.status.http-mapping``` property, for example:
```management.health.status.http-mapping.DOWN=501```

