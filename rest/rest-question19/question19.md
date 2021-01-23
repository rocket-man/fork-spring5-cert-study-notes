# What are the advantages of the RestTemplate?
RestTemplate is an asynchronous HTTP client wrapper to perform HTTP request. It exposes simple API over underlying HTTP client 
libraries:
- JDK HttpURLConnection
- Apache HttpComponents
- OkHttp

It supports:
- Automatic Object Serialization/Deserialization
    - JAXB2, Jackson2, GSON, JSONB
  
- Automatic HttpMessageConverters registration
- URI Templates
- Exchange Operation - send and retrieve, for example HTTP POST that takes input object and returns object
- HTTP GET for object
- HTTP HEAD for object
- HTTP POST for object
- HTTP PUT for object
- HTTP PATCH for object
- HTTP DELETE

RestTemplate has following advantages:
- Simplicity
- Automatic object serialization and deserialization
- High-level API that allows to focus on business instead on technical details
- Provides support for common HTTP GET, POST, PUT, PATCH, HEAD, OPTIONS, DELETE operations
- Flexibility
  - Allows custom error management with usage of ResponseErrorHandler
  
- Extendability
  - Allows registering custom HttpMessageConverters
  - Allows registering custom ClientHttpRequestFactory
  
- URI Template supports
- A Minimal amount of code required
- Automatic content type detection

Because of its simplicity, REST template is often used in testing code, however it can be used as general purpose HTTP Client
* whenever using REST Template as HTTP client, also consider Spring Cloud components if the purpose is to build distributed systems

