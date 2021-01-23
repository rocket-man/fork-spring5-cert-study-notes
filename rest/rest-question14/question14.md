# When do we need @ResponseStatus?
```@ResponseStatus``` annotation is required whenever you want to override default HTTP status returned from controller handler method

This can be achieved by applying ```@ResponseStatus``` annotation to:

- Controller class
- Controller method
- Exception being thrown from controller

```@ResponseStatus``` annotation allows you to set:
- HTTP status code
- Response message  to be used in response in case of error
