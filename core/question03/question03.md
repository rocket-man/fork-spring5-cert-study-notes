# What is an interface and what are the advantages of making use of them in Java? Why are they recommended for Spring beans ?

OOP definition - interface is a way to enforce actions for the classes that implements the interface

Java definition - an interface is a reference type, it contains a collection of abstract methods. Class
that implements the interface must override all methods from the interface, or it needs to declare methods 
as abstract if it does not know how to implement them. Java interface may also contain:
- Constants
- Default methods (Java 8)
- Static methods
- Nested Types   

Advantages of interfaces in Java:
- Allows decoupling between contract and its implementation
- Allows declaring contract between callee and caller
- Increases interchangeability -> as it is not bound to the concrete implementation of the class
- increases testability

Advantages in Spring:
- Allows use of JDK Dynamic Proxy
- Allows implementation hiding
- Allows to easily switch beans