# What is the @Controller annotation used for?
```@Controller``` annotation is used to indicate that annotated class is a Controller from Model-View-Controller Design
Pattern, and should be considered a candidate for request handling when ```DispatcherServlet``` searches for component to 
which work can be delegated.

```@Controller``` annotation is specialization of ```@Component``` annotation, this allows Spring to autodetect 
controllers during classpath scanning.

Controllers in Spring do not have to implement any interface or extend any base class, Spring uses annotation based programming
model with ```@Controller``` annotation being  part of it. Controllers have flexible method signatures with mapping expressed
via annotations like ```@RquestMapping```, ```@GetMapping```, ```@PostMapping``` etc...

```java
@Controller
public class HelloController{
    //...
}
```