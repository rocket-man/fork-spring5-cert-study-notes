# How do you create a custom metrics with or without tags
Spring Boot Actuator allows you to create custom metrics with usage of ```MeterRegistry``` from Micrometer Application Metrics
Facade.

Micrometer used by Spring Boot Actuator allows you to register followig Meter Primitives that will be exposed via 
```/actuator/metrics``` endpoint:
- Counter
- Gauge
- Timer 
- TimeGauge
- DistributionSummary
- LongTaskTimer
- FunctionCounter
- FunctionTimer

You can get more information on Meter Primitives from Micrometer Documentation:
```https://micrometer.io/docs```

Registration of metric can be done via method inside ```MeterRegistry```:
```shell
Counter objectsCount = meterRegistry.counter("storage.object.count", "type", "db"); 
```

or via usage builder:
```shell
Counter objectsCounter = Counter.builder("storage.object.count")
              .tag("type", "db")
              .register(meterRegistry);
```

Micrometer allows you to expose data with dimensions via tags:
```shell
Counter objectsCount = meterRegistry.counter("storage.object.count", "type", "db");
```

or register simple meter without any dimensions:
```shell
Counter objectsCount = meterRegistry.counter("storage.object.count");
```