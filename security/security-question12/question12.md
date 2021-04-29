# In which security annotation are you allowed to use SpEL?
Spring security supports SpEL expressions in following annotations:

-```@PreAuthorize```
```java
@PreAuthorize("hasRole('ROLE_EMPLOYEE_CREATE') || 'TEST'.equals(#employee.getFirstName())")
```
-```@PostAuthorize```
```java
@PostAuthorize("hasRole('ROLE_CUSTOMER_QA') && returnObject.firstName.equals('TEST')")
```

-```@PreFilter```
```java
@PreFilter("hasRole('ROLE_CUSTOMER_QA') && filterObject.firstName.equals('TEST')")
```

-```@PostFilter```
```java
@PostFilter("hasRole('ROLE_CUSTOMER_QA') && filterObject.firstName.equals('TEST')")
```

The main difference between ```@PreAuthorize``` / ```@PostAuthorize``` and ```@PreFilter``` / ```@PostFilter``` annotations
is that ```@PreAuthorize``` / ```@PostAuthorize``` are used to create expression that will check if method can be executed,
```@PreFilter``` / ```@PostFilter``` on the other hand are used to filter collections based on security rules.

Filter example:
```java
@PostFilter("hasRole('ROLE_CUSTOMER_QA') && filterObject.firstName.equals('TEST')")
Iterable<Customer> findAll();
```

Method execution security example:
```java
@PreAuthorize("hasRole('ROLE_CUSTOMERS_READ')")
@GetMapping("/customers")
public ModelAndView index(){
    //...
}
```
