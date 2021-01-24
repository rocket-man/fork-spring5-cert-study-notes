# How can you create a shared application context in a JUnit integration test?
"Shared Application Context" can be considered as:
- Shared context application
- Shared context instance

Context definition can be shared between tests in following way:
- Use base class for all tests which will contain ```@ContextContiguration``` and other annotations like for example ```@ActiveProfiles``` etc...
- Use custom annotation that will contain context configuration
- Use test configuration that inherits Application Configuration
- Use Base interface for all tests that will contain context configuration

Context instance is shared by default between all tests, as long as requested context matches one that is already cached

Context will be reused as long as ```@ContextConfiguration``` (locations, classes, initializers...) ```@ActiveProfiles, @TestPropertySource``` 
attributes are matched. To see full list of attributes that needs to be matched, you can look at ```MergedContextConfiguration``` class
that is used as key to ```ContextCache```. You can use ```@DirtyContext``` annotation to force spring to create a new instance 
of context for rest

