# Where do you need @ResponseBody? What about @RequestBody?
```@ResponseBody``` annotation is needed whenever you want to return serialized response of controller handler method,
instead of returning model and view that will be used by template engine to produce response. ```@ResponseBody``` annotation will 
bind method return value to web response body and will use ```HttpMessageConverter```. (also consider using ```@RestController``` annotation)

```@RequestBody``` annotation is needed whenever you want to bind web request body to controller parameter. ```HttpMessageConverter```
is used to convert content of request body. Optionally can be used with ```@Valid``` annotation to invoke automatic Bean Validation 
(JSR 303/ JSR 380). Also, ```@RequestBody``` annotation allows you to set ```required``` field to indicate if parameter is required or not.

```@ResponseBody``` annotation can be used:
- On top of a class
- On top of a method
- On top of other annotations

```@RequestBody``` annotation can be used:
- On top of controller method parameter

