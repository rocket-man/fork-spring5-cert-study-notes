# What is Spring Boot?
Spring Boot is a Java Framework that allows you to easily create stand-alone production-grade Spring based Java Applications.
It is often used in Microservice Architecture because of simplicity that it allows.

Application created with Spring Boot can be executed with simple ```java -jar``` command and also allows traditional ```war```
deployment. Spring Boot supports following embedded containers:
- Tomcat
- Jetty
- Undertow

Simplicity of deployment and execution has many advantages, for example, it allows for Dev/Prod parity which increases product quality.

Spring Boot provides number of features that can be used to fulfill non-functional requirements for the project( externalize configuration,
security metrics, health checks).

Spring Boot provides many modules under common umbrella:
- Spring Boot DevTools - live-reload to speed up development
- Spring Boot Actuator - monitoring and management of application
- String Boot Starters - dependency set of technologies to minimize set up time
- Spring Boot Autoconfiguration - configuration templates for technologies to minimize setup time

On top of it, you can use all Spring Framework technologies like:
- Spring Web - Spring MVC Framework
- Templates Engines - server side rendering engines for web pages
- Spring Security - authentication and authorisation framework
- Spring Data MongoDB - NoSQL database client
- ... and many more 