# What is the behaviour of the annotation @Autowired with regard to field injection, constructor injection and method injection?
``` @Autowired ``` is an annotation that is processed by ``` AutowiredAnnotationBeanPostProcessor ```, which can be put onto class constructor,
field, setter method or config method. Using this annotation enables automatic Spring dependency resolution that is primary 
based on types.
``` @Autowired ``` has a property ``` required ``` which can be used to tell Spring if dependency is required or optional. 
By default, dependency is required. if  ``` @Autowired ``` with required dependency is used on top of constructor or method
that contains multiple arguments, then all arguments are considered required dependency unless argument is of type ``` Optional,```
is marked as Nullable, or is marked as ``` @Autowired(required = false)```

If ``` @Autowired``` is used on top of ``` Collection ``` or ``` Map ```then spring will inject all beans matching 
the type into ``` Collection ``` and key-value pairs as BeanName-Bean into ``` Map```. Order of elements depend on 
usage of ``` @Order, @Priority``` annotations and implementation of ``` Ordered``` interface.

``` @Autowired ``` uses following steps when resolving dependency:
1. Match exactly by type, if only one found, finish
2. If multiple beans of same type found, check if any contains ``` @Primary``` annotation, if yes, inject ``` @Primary```
bean and finish.
3. If no exactly one match exists, check if ``` @Qualifier``` exists for field, if yes use ``` @Qualifier``` to find matching bean
4. If still no exactly one bean found, narrow the search by bean name
5. If still no exactly one bean found, throw exception NoSuchBeanDefinitionException, NoUniqueBeanDefinitionException

### ``` @Autowired``` with field injection is used like this:

```java
@Autowired
public SpringBean1 springBean1;
@Autowired
protected SpringBean2 springBean2;
@Autowired
private SpringBean3 springBean3;
@Autowired
SpringBean4 springBean4;
```

- Autowired fields can have any visibility level.
- Injection is happening after Bean is created but before any of the init ``` (@PostConstruct, InitializingBean, @Bean(initMethod)) ``` methods are called.
- By default, field is required, however you can use ``` Optional, @Nullable or @Autowired(required = false)``` to indicate 
that the field is not required


### ``` @Autowired``` can be used with constructor like this:
```java 
@Autowired
public RecordService(DbRecordReader dbRecordReader, DbRecordProcessor dbRecordProcessor){
    this.recordReader = recordReader;
    this.dbRecordProcessor = dbRecordProcessor;
}
``` 
Constructor can have any access modifier (public, protected, private, package-private).

If there is only one constructor in class, there is no need to use ``` @Autowired``` on top of it, Spring will use
this default constructor anyway and will inject dependencies into it.

If class defines multiple constructors, then you are obligated to use ``` @Autowired``` to tell Spring which constructor 
should be used to create Spring Bean. Otherwise, Spring throws ``` NoSuchMethodException```.

By default, all arguments in the constructor are required, however you can use ``` Optional, @Nullable, or @Autowired(required = false)```
to indicate that parameter is not required.

### ``` @Autowired``` with **method injection** is used like this:
```java 
@Autowired
public void setRecordReader(DbRecordReader dbRecordReader){
    this.recordReader = recordReader;
}
``` 
``` @Autowired``` method can have any visibility level and also can contain multiple params. If method contains multiple
params, then by default it assumed that in ``` @Autowired``` method all params are required. If Spring is unable 
to resolve all dependencies for this method, ``` NoSuchBeanDefinitionException``` or ``` NoUniqueBeanDefinitionException```
will be thrown.

When using ``` @Autowired(required = false)``` with method, it will be invoked only if Spring can resolve all params.

If you want Spring to invoke method only with arguments partially resolved, you need to use ``` @Autowired``` method
with parameter marked as ``` @Optional, @Nullable or @Autowired(required = false)``` to indicate that this param is not required
 