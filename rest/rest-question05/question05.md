# Is REST scalable and or interoperable?
Scalability of RESTful Service is a result of developing software with following characteristic in mind:
- **Statelessness** - each request to the system, should be designed in a way, for it to be processed without having to keep
any state at the backend side, for example, we want to avoid keeping information in HTTP session related to user conversation
  with the system, this way we can delegate request to any backend node that can be processed the request without
  having to introduce share state between models
  
- **Layered approach** - layered approach to te system design means that we can introduce new parts of the system in a way for it 
to be transparent to the client resulting in ability to change system without having to modify client, example of this can be 
  introduction of Application Load Balancer, API Getaway, Security Layers, Web Application Firewall without having 
  to change client at all.
  
- **Cacheability** - alows to create response for repeatable requests, without having to process them on server side, caching 
is introduced to improve response time and to reduce load on the service.
  
Scalability that can be achieved by statelessnes of RESTful Service is specially visible in Microservice Architecture, that
can be created with usage of Spring Cloud Component. Layered Approacg allows introduction of additional components without
changing client application.

Rest service is interoperable because:
- Access to REST Service and resources available by URIs is standarized and not coupled with any specific technology, allowing you
to consume REST service in any technology of choice, like JavaScript, Python, Java, C++ etc...
  
- Data for the request resource can be set to client in different formats specified by the client, in case of HTTP protocols
this can be done with usage of ```Accept``` header, for example ```Accept```: ```application/json``` or ```Accept: application/mxl```
  
- All CRUD operations can be handled with standardized approach, in case RESTful service implemented with HTTP protocol, 
Standarized HTTP methods GET, PUT, PATCH, POST, DELETE are used.