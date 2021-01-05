# How do you change the Health Indicator status severity order?
Spring Actuator allows you to change Health Indicator Status severity order with usage pf property 
```management.health.status.order``` for example:
```properties
management.health.status.order=system-halted, DOWN, OUT_OF_SERVICE, UNKNOWN, UP
```
This property will be injected into ```HealthIndicatorProperties``` and used by ```OrderedHealthAggregator``` to resolve
final status for application by aggregating statuses from all Health Indicators available in the system.

