# What are some of the valid return types of a controller method?
- ```@ResponseBody``` - binds method return value to web response body, complex types will be converted with usage of
```HttpMessageConverter```
  
- ```HttpEntity<B>,ResponseEntity<B>``` - allows to specify full response with headers and body, ```ResponseEntity<B>```
additionally allows you to specify HTTP status code
  
- ```HttpHeaders``` - allows to return response only with headers, without body
- ```String``` - allows to return logical name of view to use when rendering response, view will be resolved by ```ViewResolver```
 usually used with implicit model through ```@ModelAttribute``` parameters or explicit model by declaring ```Model``` method
  parameter
  
- ```View``` - allows to return instance of view, like ```JstlView```, ```ThymeleafView```, ```FreeMarkerView```, usually used
with implicit model through ```@ModelAttribute``` parameters or explicit model by declaring ```Model``` method parameter.
 
- ```Map,Model``` - allows you to specify attributes to be added to the implicit model, with the view name implicitly determined 
through ```RequestToViewNameTranslator```
  
- ```@ModelAttribute``` - allows you to specify an attribute to be added to the model, with the view name implicitly determined 
through a ```RequestToViewNameTranslator```
  
- ```ModelAndView``` - view and model attributes to used and, optionally, a response status, view can be specified by logical name 
or instance of view can be passed, model can be specified as name object or ```Map```
  
- ```void``` - method that returns ```void``` can correctly handle request by using ```ServletResponse``` or ```OutputStream```
as parameter, or ```@ResponseStatus``` annotation, if none of previous are used ```RequestToViewNameTranslator``` will identify 
  view based on request, ```void``` return type can also indicate "no response body" for REST controllers.
  
- ```DeferredResult<V>``` - allows to specify result for controller asynchronously from different Thread or as result of some 
event callback, part of integration with Servlet 3.0 asynchronous request
  
- ```Callable<V>``` - allows to produce return value asynchronously in a Spring MVC managed Thread

- ```ListenableFuture<V>, CompletableFuture<V>, CompletionStage<V>``` - allows to return set of chained, asynchronous operations, 
with callbacks and transformations.
  
- ```ResponseBodyEmitter, SseEmitter``` - allows to send objects in stream asynchronously, objects will be converted with usage 
of ```HttpMessageConverter``` can be used with ```ResponseEntity``` both classes have the same goal, however ```SseEmitter``` uses
  Server-Sent Events Standardized with W3C SSE specification
  
- ```StreamingResponseBody``` - allows to write to the response ```OutputStream``` asynchronously

- Reactive types - allows the to use Reactive types for streaming scenarios, handled by ```ReactiveAdapterRegistry``` 