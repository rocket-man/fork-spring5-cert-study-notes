# What is @Query annotation used for?
```@Query``` annotation can be used on top of Repository method, and with it you can specify query that should be used
by JPA. When declaring one on top of finder method, specified query will be used, instead of generating one automatically 
based on finder method name.

Using ```@Query``` annotation allows you to achieve more control and flexibility of the JPA query that will be executed

```java
public interface EmployeeDao extends CrudRepository<Employee, Integer>{
    @Query("select e from Employee e where e.firstName = ?1 and e.lastName = ?2")
    Employee findFirstNameAndLastName(Strin firstName, String lastName);
}

```