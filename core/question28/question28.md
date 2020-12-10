# How do you inject scalar / literal values into Spring Beans?
To inject literal values into Spring beans, you need to use ```@Value``` annotation.

```@Value``` annotation has one field value that accepts:
- Simple value
- Property reference
- SpEL String

```@Value``` annotation can be usde on top of:
- Field
- Constructor parameter
- Method - all fields will have injected the same value
- Method parameter - injection will not be performed automatically if ```@Value``` is not present on method level or if 
  ```@Autowired``` is not present at method level
  
Inside ```@Value``` you can specify:
- Simple value -> ```@Value("John"), @Value("true")```
- Reference a property -> ```@Value("${app.department.id})```
- Perform SpEL inline computation -> ```@Value("#{'Wall Street'.toUppercase()}")```, ```@Value("#{5000 * 0.9}")```, ```@Value("#{'${app.department.id}'.toUpperCase()}")```
- Inject values into array, list, set, map