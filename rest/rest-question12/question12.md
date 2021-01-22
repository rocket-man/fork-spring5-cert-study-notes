# When do you need @ResponseBody?
```@ResponseBody``` annotation is needed whenever you want spring to return serialized response of controller method return
value, instead of returning model and view that will be used by template engine to produce response. ```@ResponseBody``` annotation
bounds method return value to the web response body, produced by ```HttpMessageConverter```

```@ResponseBody``` annotation can be used:

- On top of a class
- On top of a method
- On top of other annotations

```@ResponseBody``` annotation is useful when implementing backend service API, for example REST service. Usage of this annotation
is not needed when using ```@RestController``` annotation, since this one already contains ```@ResponseBody``` annotation
