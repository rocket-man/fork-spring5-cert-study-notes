# What is the concept of AOP? Which problem does it solve? What is a cross cutting concern? Name three typical cross cutting concerns. What two problems arise if you don't solve a cross cutting concern via AOP?
AOP - Aspect Oriented Programming is a paradigm that complements Object-Oriented Programming (OOP) by providing a way to
separate groups of cross cutting concerns from business logic code. This is achieved by ability to add additional behaviour 
to the code without having to modify the code itself. This is achieved by specifying:
- Location of code which behaviour should be altered - **Pointcut** is matched with **Join** point 
- Code which should be executed that implements cross cutting concern - **Advice**

It is important not to overuse AOP because it makes the code harder to read, maintain and debug.

# Which problem does it solve?
Aspect Oriented Programming solves following challenges:
- Allows proper implementation of Cross cutting concerns
- Solves code Duplications by eliminating the need to repeat the code for funcionalities across different layers, such 
functionalities may include logging, performance logging, minitoring, transactions, caching.
- Avoids mixing unrelated code, for example mixing transaction logic code (commit, rollback) with business code makes 
code harder to read, separating concerns... code is easier to read, interpret, maintain.
  
# Name three typical cross cutting concerns
Common cross-cutting concerns:
- Logging
- Performance Logging
- Caching
- Security
- Transactions
- Monitoring

# What two problems arise if you don't solve a cross cutting concern via AOP?
Implementing cross-cutting concerns without AOP, produces following challenges:
- Code duplications -> Before/After code duplicated in all locations when normally Advise would be applied, refactoring
by extractions helps but does not fully solve the problem

- Mixing of concerns -> business logic code mixed with logging, transactions, catching makes code hard to read and to maintain. 