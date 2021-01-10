# What is the DispatcherServlet and what is it used for?
DispatcherServlet is an internal Spring MVC component that implements HttpServlet from Java Servlet API and Front Controller
Design Pattern. It is used to handle all requests to the application, based on servlet mapping, delegate those request to 
controllers and produce response based on identified view.

DispatcherServlet has following responsibilities:
- Delegates received requests to Controllers
- Use View resolvers to resolve views pointed out by Controllers
- Produces response that is sent to user
- Handles shared concerns, like exception mapping, error handling, security etc...

Front Controller Design Pattern allows you to implement shared algorithms for entire application responsible for request 
processing and handling shared concerns.

Servlet is a Java Technology to create Web Applications on Java Platform with usage of Application Servers. It is a set 
of interfaces, classes and documentation allowing you to extend capabilities of Application Servers. Servlet is protocol
independent, however usually it is used to process HTTP Requests with usage of custom implementation of HttpServlet class.
Servlet registration requires url-patterns which informs application server which requests should be mapped to your servlet
