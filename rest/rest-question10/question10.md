# Is @Controller a stereotype? Is @RestController a stereotype? What is a stereotype annotation? What does that mean?

```@Controller``` annotation and ```@RestController``` annotation are stereotypes.

Stereotypes are annotations applied to classes to describe roles which will be performed by this class

Types of stereotypes:
- ```@Component``` - generic component in the system, root stereotype, candidate for autoscanning.
- ```@Service``` - class will contain business logic
- ```@Repository``` - class is a data repository (used for data access objects, persistence)
- ```@Controller```  - class is a controller, usually a web controller
- ```@RestController``` - class is a controller that will implement REST Service Endpoints, usually consuming and producing json