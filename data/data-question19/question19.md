# What is the default rollback policy in a JUnit test, when you use the @RunWith(SpringJUnit4ClassRunner.class) in JUnit 4 or @ExtendWith(SpringExtension.class) in JUnit 5, and annotate your @Test annotated method with @Transactional?
Default rollback policy in ```@Test``` methods annotated with ```@Transactional``` is always rollback. This means that after 
test execution transaction will always be rolled back. The reason for this is that each test method should be able to change
state of database or call other classes that will change state of the database, however for the tests to be repeatable, changes
should be reverted after ```@Test``` method execution.

You can change this behaviour by using ```@Rollback``` annotation set to ```false```.