# What is Health Indicator?
Health Indicator is a component used by ```/actuator/health``` endpoint to check if system is in state which can be used 
to successfully handle requests.

```/actuator/health``` endpoint is returning aggregated information on system status by evaluating all Health Indicators
registered in ```HealthIndicatorRegistry```.

```/actuator/health``` endpoint is exposed by default via both ```JMX``` and ```Web```, however default configuration 
is exposing only minimal set of information.

This endpoint is used, usually by monitoring software, to periodically check system status, upon receiving failed status,
automated alert is sent to product support team.


Monitoring endpoint like this, is also very useful when building Highly Available and Fault tolerant Architecture, in this case
such endpoint can be used by Load Balancer to check which instances are healthy and can accept traffic.

To change level of details exposed by ```/actuator/health``` endpoint, following properties can be used:
- ```management.endpoint.health.show-details```
- ```management.endpoint.health.show-components```

Both of them can support following values:
- ```never``` - detailed information are never shown (default value)
- ```when-authorized``` - show information to users with roles from property
```management.endpoint.health.roles```
- ```always``` - detailed information are shown to all users

To create custom Health Indicator, Spring Bean has to be created that implements ```HealthIndicator``` interface:
```java
@Component
public class CustomHealthIndicator implements HealthIndicator{
    @Override
    public Health health(){
        return Health.up()
                .withDetail("system-ready", true)
                .build();
    }
}
```

