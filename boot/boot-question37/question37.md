# Why do you want to leverage 3rd party external monitoring system?
It is a good idea to use external monitoring system, because this way you can use monitoring functionalities without having 
to spend time coding them.

External monitoring system usually provides:
- Durable persistent storage
- Tested way of ingesting massive amount of data
- A way to perform data visualization
- Configurable Dashboards
- Configurable alerting

Spring Actuator uses Micrometer Application Metrics Facade which Integrates with number of external 
monitoring systems. Provided dependency management and auto-configuration makes it easy to integrate Micrometer into your project.

Spring boot supports following monitoring systems:
- AppOptics
- Atlas
- Datadog
- Dynatrace
- Elastic
- Ganglia
- Graphite
- Humio
- Influx
- JMX
- KairosDB
- New Relic
- Prometheus
- SignalFX
- Simple(in memory)
- StatsD
- Wavefront

Configuring external monitoring system is easy as adding dependency:
```xml
<dependency>
    <groupId>io.micrometer</groupId>
    <artifactId>micrometer-registry-{monitoring-system-name}</artifactId>
</dependency>
```

You might also need to configure some properties, for example:
```properties
management.metrics.export.elastic.host=http://localhost:9200
```
