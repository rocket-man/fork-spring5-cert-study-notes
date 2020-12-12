# What is the concept of a "container" what is its lifecycle?

Container is an execution environment which provides additional technical services for your code to use. 
Usually containers use IoC technique, that allows you to focus on creating business aspect of the code,
while technical aspects like communication details (HTTP, REST, SOAP) are provided by execution environment.

Spring provides a container for beans. It manages lifecyle of the beans and also provided additional services
through usage of Application Context.

Spring container lifecycle:
1. Application is started.
2. Spring container is created/.
3. Container reads configuration.
4. Bean definitions are created from configuration.
5. BeanFactoryPostProcessors are processing bean definitions.
6. Instances of Spring Beans are created.
7. Spring Beans are configured and assembled - resolve property values in dependencies.
8. BeanPostProcessors are called.
9. Application Runs.
10. Application gets down.
11. Spring Context is closed.
12. Destruction callbacks are invoked.


