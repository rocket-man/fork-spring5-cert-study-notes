# How do you define a Repository interface? Why is it an interface not a class?
To define Repository interface, you need to follow those steps:
- Create Java interface that extends one of those: ```Repository, CrudRepository, PagingAndSortingRepository, JpaRepository```
- Create class with ```@Entity``` annotation
- Inside ```@Entity``` class, create a simple primary key annotated with ```@Id``` annotation or create class that will
represent complex key annotated with ```@EmbeddedId``` annotation at field level and ```@Embeddable``` at key class definion level
- Use ```@EnableJpaRepository``` to point out package to scan for Repositories

Repository interface is an interface, not a class for Spring Data to be able to use JDK Dynamic Proxy to intercept 
all calls to repository and also to allow creation of custom base repositories for every ```Dao``` based on ```SimpleJpaRepository```
configured at ```@EnableJpaRepository``` level

```java
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
}


@Configuration
@EnableJpaRepositories(basePackages = {"com.project.dao"})
public class JpaConfiguration{
    //...
}

@Entity
public class Employee{
    @id
    private int id;
    private String firstName;
    private String lastName;
}

```