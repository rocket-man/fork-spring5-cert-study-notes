# What are the differences between @RequestParam and @PathVariable?
The main differences between ```@RequestParam``` and ```@PathVariable``` is a purpose of each annotation.

```@PathVariable``` is responsible for mapping parts of URI, marked with usage of URI template variables to controller 
method parameters. URI templates are identifiers surrounded with curly brackets

```/countries/US/cities/DEN```

```java
@GetMapping("/countries/{country}/cities/{city}")
public String countryAndCityByCode(@PathVariable("country") String country, @PathVariable(value = "city") String city){
    //...
}
```

```@RequestParam``` is used to bind web request parameters to controller method parameter.
```/index?name=John&city=NYC&country=US```

```java
@GetMapping("/index")
public String index(@RequestParam("name") String name, @RequestParam("city") String city, @RequestParam("country") String country){
    //...
}
```

- Another difference is that ```@RequestParam``` allows you to specify ```defaultValue``` property, ```@PathVariable``` does not

Similarities are the following:
- Specify name of variables to bind
- Mark variables as required or optional
- Use Java 8 Optional for optional values
- Map all parameters to Map
- Map list of values for parameter to collection
