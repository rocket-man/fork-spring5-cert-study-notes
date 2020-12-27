# What is a Repository interface ?
Repository interface is a Java interface that describes ```Dao``` with expected behaviours, based on which Spring Data
will automatically generate ```Dao``` logic. Repository interface takes two arguments the entity type and a type of the
primary key of entities.

Custom Repository interface needs to extend one of the following interface:
- Repository - basic marker repository
- CrudRepository - adds generic methods for CRUD operations
- PagingAndSortingRepository - adds findAll method for paging/sorting
- JpaRepository - JPA specific extension Repository

```java
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

public interface EmployeeDao extends CrudRepository<Employee, EmployeeKey> {
    Employee findByEmail(String email);

    List<Employee> findByLastName(Stirg lastName);

    List<Employee> findBySalaryBetween(float min, float max);
}


@Configuration
@EnableJpaRepositories(basePackages = {"com.project.dao"})
public class JpaConfiguration{
    //...
}
```

From the examples above, in the first example you define expected behaviours. In the second example, framework generates 
Dao logic automatically based on interfaces from package pointed in the annotation ```@EnableJpaRepositories```
