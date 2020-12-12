# What is dependency injection and what are the advantages
It is a technique for creating software in which objects do not create their dependencies on itself (avoid using new keyword for creating objects),
instead objects declare dependencies that they need (using autowired annotation), and the framework provides concrete dependencies to objects.

## Types of DI:
- Constructor injection
- Setter injection 
- Interface injection 

## Advantages:
- Increases code re-usability, readability, maintainability and testability
- Reduces coupling
- Increases cohesion 