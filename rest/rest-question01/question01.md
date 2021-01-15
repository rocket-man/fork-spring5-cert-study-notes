# What does REST stand for?
Rest stands for REpresentational State Transfer.

It is an architectural style of designing distributed applications, in which requesting system accesses and manipulates 
textual representations of Web resources by using a uniform and predefined set of stateless operations, given a set of 
constraints.

Web resources are made available through URIs (Uniform Resource Identifiers) and are accessed or modified, usually through 
HTTP operations.

For example:
- ```GET /customers```
- ```GET /customers/1```
- ```PUT /customers/6```
- ```DELETE /customers/3```

Most implementations of REST services are using HTTP as the application protocol, and JSON as format that moves between
called and callee. However, REST is not necessarily tied to HTTP and JSON. 

REST defines constrains to be used for creating Web services, aligning with those constraints results in gaining non-functional
properties of system such as performance, scalability, simplicity, modifiability, visibility, portability and reliability:
- Cient-server architecture and Separation of Client-Server concerns 
- Statelessnes
- Cacheability
- Uniform interface
    - resource identification in requests
    - Resource manipulation through representations
    - Self-descriptive messages
    - Hypermedia as the engine of application state
    
- Layered system
- Code on demand (optional)

Requesting system interact with target system, usually by HTTP requests which should follow these semantics:

HTTP method + URI 
verb        + noun(pluaral form)
GET         ```/customers```
GET         ```/customers/1```
PUT         ```/customers/6```
PATCH       ```/customers/7```
DELETE      ```/customers/3```

REST services often allow you to perform all CRUD operations for specified resources.

Following HTTP Methods are usually used with Rest Services:
- ```GET``` - fetch resource or collection of resources at the specified URI
- ```PUT``` - create a new resource, or update existing resource at the specified URI
- ```PATCH``` - partially updates existing resource at the specified URI, for example update only ```firstName``` of ```Customer```
- ```DELETE``` - delete resource at the specified URI
- ```POST``` - triggers operation at server or creates a new resource at the specified URI

Other HTTP Methods that REST service can support are: ```HEAD```, ```CONNECT```, ```OPTIONS```, ```TRACE```

In case of request processing error, REST service should respond in a way for it to be easily to understand cause of issue.
Error return to requester usually includes:
- HTTP Status Code
- Code ID 
- Human readable error message that explains the error

HTTP Status Code should fall within one of the groups:
- 1xx - Informational
- 2xx - Success
    - 200 - OK
    - 201 - Created
    - 204 - No content
- 3xx - Redirection
- 4xx - Client error
    - 400 - Bad Request
    - 401 - Unauthorized
    - 403 - Forbidden
    - 404 - Not Found
- 5xx - Server error
    - 500 - Internal Server Error
    - 501 - Not Implemented
    
REST API should be backwards compatible as long as possible, in case of introducing breaking change, one of versioning methods
should be used:
- URI versioning 
    - ```/api/v1/products```
- Query String versioning 
    - ```/api/products?version=1```
- Header versioning 
    - ```/api/products```
    - Header - ```Accepts-versioning: 1.0```
- Media type content negotiation versioning 
    - ```/api/products```
    - Header - ```Accept: application/vnd.my-app.v1+json```
    
