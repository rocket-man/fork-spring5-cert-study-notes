# What is a patter? What is an anti pattern ? Is dependency injection a patter ?
A design patter is a reusable solution to common occurring problems in software design.

Some examples of design pattern from the GoF:
- Factory Method
- **Builder** (with code example)
- Template Method
- Strategy 
- Observer
- Facade
- Composite
- ...

Indeed, Dependency Injection is a pattern that solves problems of flexible dependency creation.

An anti patter is ineffective and counter-productive solution. Examples:
- God object -> having a class that is huge, it has too many responsibilities, constructors, fields... it is hard to test and to apply changes
- Circular dependency -> there is no way to compile with this problem (A -> B -> C -> A)
- Sequential coupling -> when method need to be call in specific order
- Constant interface -> constants are meant to be for internal usage. When you have them in interfaces you are exposing them through the api