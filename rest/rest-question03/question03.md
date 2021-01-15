# What does CRUD stand for?
CRUD stands for Create, Read, Update, Delete. Those are the basics operations of data store. All of these, or subset 
can be implemented in REST service.

When using HTTP as application layer in REST, following HTTP methods are used for implementation:
- Create -> ```HTTP POST / HTTP PUT```
- Read -> ```HTTP GET```
- Update -> ```HTTP PUT/ HTTP PATCH```
- Delete -> ```HTTP DELETE```

Here are example conventions often used when implementing CRUD in REST


| URI | GET  | POST  |  PUT | DELETE |
| ----   | --- | --- | --- | --- |
| ```/customers``` | retrieves all customers | create new customer | Bulk update customers  |  Delete all customers |
| ```/customers/1``` | Retrieve specific customers | N/A |  Update existing customer  |  Delete specific customer |
| ```/customers/1/addresses``` | Retrieve addresses assigned to customer | Create new addresses assigned to customer |  Bulk update addresses to customer  |  Delete all addresses assgined to customer|