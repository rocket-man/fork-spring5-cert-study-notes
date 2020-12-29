# Why is it "opinionated"
Spring Boot is "opinionated" framework because it comes with the general idea of how the application should be organized,
provides default configurations and module setups for technology related aspects of application (embedded databases, mvc 
view resolvers, template rendering engines, ...).

In comparison with Spring Framework, Spring Boot provides starter and auto-configurations which intelligently fits default
configuration based on defined dependencies.

Main advantage on how Spring Boot approaches "opinionated" style, is that you can always override default configuration 
if it does not fit you use case. 

"Opinionated" has following advantages:
- Simplifies application setup
- Maximizes productivity, by allowing you to focus on business code instead of setup of technology related code.
- Allows you to write configuration only in case when defaults are not good fir for your case
- Allows easy integration with technology modules (Embedded Databases, Containers...)
- Minimizes the amount of setup code

The main disadvantage of "opinionated" is that, if your application does not fall into most use cases supported by the framework,
you will have to override most of the default setup, configurations and project organization, which might harm your productivity.

