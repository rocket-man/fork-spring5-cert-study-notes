# What is a web application context? What extra scopes does it offer?
Web Application Context is a Spring Application Context for Web Applications that runs under Embedded or Standalone Application
Server that supports Servlet API and acts as Servlet Container.

Web Application Context is described by ```WebApplicationContext``` interface and it allows you to access ```ServletContext```
interface from Servlet API.

Web Application Context provides four additional scopes:
- Request Scope
- Session Scope
- Application Scope
- Websocket Scope

---

- Request Scope
    - Defined by ```@RequestScope``` annotation
    - Bean lifecycle is tightly coupled with HTTP Request lifecycle
    - New Bean instance created for each request
```java
@RequestScope
@Component
public class RequestScopeBean{
    //...
}
``` 

---

- Session Scope
    - Defined by ```@SessionScope``` annotation
    - Bean lifecycle is tightly coupled with HTTP Session lifecycle
    - New Bean instance is created for each new session and Bean instance lives as long as HTTP Session is alive
```java
@SessionScope
@Component
public class SessionScopeBean{
    //...
}
```     

---

- Application Scope
    - Defined by ```@ApplicationScope``` annotation
    - Bean lifecycle is tightly coupled with the ```ServletContext```
    - One Bean instance available per entire Web Application - ```ServletContext```
    - Differences compared to Singleton Bean
        - Singleton per ```Servlet Context```, not per Spring Application Context (one Web Application may have several Spring Application Context)
        - Exposed via attribute of ```ServletContext```
```java
@ApplicationScope
@Component
public class ApplicationScopeBean{
    //...
}
``` 

---

- Websocket Scope
    - Defined by ```@Scope``` annotation with specified properties
        - ```@Scope(scopeName = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)```
    - Bean lifecycle is coupled with lifecycle of Websocket Session, however bean usually lives longer then WebSocket session
```java
@Scope(scopeName = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class WebSocketScopeBean{
    //...
}
```