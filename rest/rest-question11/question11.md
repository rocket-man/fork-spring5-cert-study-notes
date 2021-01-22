# What is the difference between @Controller and @RestController
```@Controller``` annotation indicates that class will be assigned with @Controller role of MVC pattern, and usually it is expected
from it to return a Model and View that will be used to render response, with usage of configured template engine (Thymeleaf)

```@RestController``` annotation indicates that class will be used to handle REST Service Endpoint requests, it is expected 
from it to correctly handle requests input and produce outputs in acceptable format like JSON/XML etc. Serialized output 
is sent directly to the client

```@RestController = @Controller + @ResponseBody```

```@ResponseBody``` annotation indicates that method return value should be bound to the web response, it's return value
will be serialized into response in requested format