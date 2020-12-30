# What is a Spring Boot starter POM? Why is it useful?
Spring Starter POM is a maven module that represents empty JAR with a set of dependencies required to work with
specified technology. Spring Starter may also provide auto-configuration to create beans required to integrate project with
technologies that you intend to use.

Spring Starters are useful, because they simplify project setup by assuring that all dependencies in correct versions are set.
If starter provides autoconfiguration as well, it integrates technology with Spring Framework.

This allows you to focus on business code instead of having to spend time on identifying which dependency set is required
and which versions are correct. Autoconfiguration allows you to use technology within Spring Framework without having to 
integrate technology with it manually