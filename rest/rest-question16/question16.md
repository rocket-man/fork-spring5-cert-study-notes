# If you saw example Controller code, would you understand what it is doing? Could you tell if it was annotated correctly?
Controller can be defined in on of the following ways:
- ```@Controller``` - Spring MVC Controller, should return view name and model
- ```@RestController``` - REST API Controller, ```@RestController = @Controller + @ResponseBody```

Controller mapping can be defined with usage of none of following annotations:
- ```@RequestMapping```
- Composed annotation:
    - ```@GetMapping```
    - ```@PostMapping```
    - ```@PutMapping```
    - ```@PatchMapping```
    - ```@DeleteMapping```
    
Request parameter body can be mapped with usage of:
- ```@RequestBody```
  - Additionally ```@Valid``` annotation can be used to trigger Bean Validation
  
Response can be bound to web response by:
- Usage of ```@ResponseBody``` annotation on top of ```@Controller``` or ```@Controller``` method
- Usage of ```@RestController``` annotation

Custom HTTP status can be provided  for controller methods and exceptions with usage of ```@ResponseStatus``` annotations

Request and URI parameters can be accessed with:
- ```@RequestParam``` - Servlet request parameters
- ```@PathVariable``` - access to URI Template variable
- ```@MatrixVariable``` - access to name-value pairs in URI path segments, allows mapping variables fro requests like ```/employees/id-1;name-John```
- ```@CookieValue``` - bind the value of an HTTP cookie to a method argument in a controller
- ```@RequestHeader``` - access request header values or all header key and values when binding against a Map.

Calls to controller can be interpreted, and custom exception handling can be implemented with one of:
- ```@ExceptionHandler``` - when applied at controller level method, acts as controller level exception handler
- ```@ControllerAdvice``` used together with ```@ExceptionHandler``` - global exception handler for all controllers, acts 
as global annotation driven call interceptor