# What is the difference between $ and # in @Value expression?
```@Value``` annotations support two types of expressions:
- Expression starting with $ -> used to reference a property in Spring Environment Abstraction
- Expression starting with # -> SpEL expressions parsed and evaluated by SpEL