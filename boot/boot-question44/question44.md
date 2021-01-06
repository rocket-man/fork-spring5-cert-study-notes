# When do you want to use @DataJpaTest for? What does it auto-configure?
You want to use ```@DataJpaTest``` annotation whenever writing an Integration Test for JPA related components of your 
application like ```Entities``` or  ```Repositories```.

```@DataJpaTest``` annotation configures:
- In-memory embedded database - behaviour can be disabled with ```@AutoConfigureTestDatabase(replace = Replace.NONE)```
- Scans and configures ```@Entity``` beans 
- Scans and configures Spring Data Repositories
- Configures ```TestEntityManager```
- Does not load other components like ```@Component```, ```@Service```, ```@Controller```, etc

Every ```@DataJpaTest``` is transactional by default, after each test transaction is rolled back. You can use ```@Transactional```
annotation to customize this behaviour. 

When using ```@DataJpaTest``` you can access ```TestEntityManager```, which contains sub-set of ```EntityManager``` that are
useful for testing.