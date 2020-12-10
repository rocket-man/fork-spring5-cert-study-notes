# Can you use @Component together with @Profile?

Yes, ```@Profile``` annotation can be used together with ```@Component``` on top of class representing spring bean. 

If, class annotated with ```@Component``` does not have ```@Profile```, that means that the bean will exist in all properties.

You can specify one, multiple profiles, or profile in which bean should not exist:
```java
@Profile("database")

@Profile("!prod")

@Profile("database","file")
```