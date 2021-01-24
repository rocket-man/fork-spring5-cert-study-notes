# How are mock frameworks such as Mockito or EasyMock used?
Mock Frameworks like Mockito or EasyMock are used mainly during Unit Testing to mock collaborators of classes under test. 
Mockito or EasyMock can be also used during Integration Testing when goal is to check cooperation between different objects,
while still mocking part of the system.

Mock created with Mockito or EasyMock is a dynamic object, which can "pretend" real object and return predefined results 
when invoking method on it. Additionally Mock allows you to verify if expected method were indeed called with expected arguments.

Above frameworks also allows you to inject mocks to classes under test in convenient way, with usage of annotations, with style
similar to IoC/DI without having to run within container at all, which is one of the reason why unit tests are so fast 
and lightweight

https://site.mockito.org
https://easymock.org