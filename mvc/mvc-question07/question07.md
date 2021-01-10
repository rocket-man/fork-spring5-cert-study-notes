# What is @RequestParam used for?
```@RequestParam``` is used to bind web request parameters to controller method parameter.

```/index?name=John&city=NYC&country=US```

```java
@GetMapping("/index")
public String index(
        @RequestParam("name") String name, 
        @RequestParam("city") String city, 
        @RequestParam("country") String country) {

    //...

}
```

Because Servlet API combines query parameters and form data into single parameters map, it is possible to use ```@RequestParam``` annotation
to map:

- query parameter
- form data
- parts in multipart request

```@RequestParam``` annotation allows you to specify following parameters:
- ```name``` - the name of the request parameter to bind 
- ```required``` - whether the parameter is required to bind
    - by default parameter is required and in case of it being absent exception will be thrown
    - If switched to false, in case of parameter being absent null value will be provided or value pointed out by defaultValue property
- ```defaultValue``` - allows you to specify default value to use in case of absence of optional parameter 
  
```@RequestParam``` annotation also supports Java 8 Optional, so following will be equal:
``` @RequestParam(value = "city", required = false) String city``` == ``` @RequestParam(value = "city") Optional<String> city```

---

```@RequesParam``` annotation also supports additional use cases, like:
- Mapping all request parameters to Map 
    - ```/index?name=John&city=NYC&country=US``` 
    
```java 
@GetMapping("/index")
public String index(@RequestParam Map<String, String> parameters){
  //...
} 
```

- Mapping all values to list
  - ```/index?cities=1,2,3```
  
```java
@GetMapping("/index")
public String index(@RequestParam("cities") List<String> cities){
    //...    
}
```