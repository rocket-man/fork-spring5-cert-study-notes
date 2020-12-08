# What are the advantages of Java Config? What are the limitations@
Advantages of Java Config over XML Config:
- Compile Time Feedback due to Type-checking
- Refactoring Tools for Java without special support/plugin work out of the box with Java Config (special support needed for XML Config)

Advantages of Java Config over Annotation Based Config:
- Separation of concerns -> bean configuration is separated from bean implementation
- Technology agnostic -> beans may not depend on concrete IoC/DI implentation (makes it easier to switch technologies)
- Ability to integrate Spring with external libraries
- More centralized location of bean list

Limitations of Java Config:
- Configuration class cannot be final (because it creates a CGLIB proxy underneath the hood)
- Configuration class methods cannot be final
- All Beans have to be listed, for big applications, it might be a challenge compared to Component Scanning