# MVC is an abbreviation for a design pattern. What does it stand for and what is the idea behind it?
MVC stands for Model-View-Controller, it is a design pattern which divides application into three main interconnected 
component types.

- Model: 
    - Data Access
    - Data Structures
    - Business Logic
    - CRUD logic
    
- View: 
    - Data representation to the user
    - Multiple representations of the same data are possible

- Controller:
    - Accept requests from the user
    - Issues command to the model 
    - Modifies the model
    - Decides on view to use
    
The flow of the request is the following. The user makes a request and the controller is the first to handle the request.
Then the controller is interacting with the model and manipulates the model. The data is being taken from the model, and the 
controller decides which view to use. Upon choosing the view, the data is rendered with the usage of the view and then, 
response is passed back to the user.

Spring MVC introduces ready to use components that you can use in your application for MVC pattern.

- Model 
  - Spring Data JPA
  - Spring Data JDBC
  - Spring Data MongoDB
  - Custom Repository Implementation, etc...
  
- View
  - Thymeleaf
  - FreeMarker
  - Velocity
  - Groovy Markup
  - JSP & JSTL, etc...
  
- Controller
  - @Controller classes
  - @RestController classes
  

Usage of MVC Design pattern has following advantages:
- Separation of concerns
- Increased code cohesion
- Increased code re-usability
- Reduces coupling between data, logic and information representation
- Lower maintenance code
- Increases extendibility