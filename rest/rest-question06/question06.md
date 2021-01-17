# Which HTTP methods does REST use?
REST uses following HTTP methods:
- ```HTTP GET```  - used to implement Read operations - fetch existing resource or list of resources
- ```HTTP POST``` - used to implement Create Operations - adding new element
- ```HTTP PUT``` - used to implement Create or Update Operations - Bulk Update or Update existing resource
- ```HTTP PATCH``` - partial update of existing resource of the system, for example, when wanting to update only First Name 
of customer entity
- ```HTTP DELETE``` - delete existing resource in the system


| URI | GET  | POST  |  PUT | DELETE |
| ----   | --- | --- | --- | --- |
| ```/customers``` | retrieves all customers | create new customer | Bulk update customers  |  Delete all customers |
| ```/customers/1``` | Retrieve specific customers | N/A |  Update existing customer  |  Delete specific customer |
| ```/customers/1/addresses``` | Retrieve addresses assigned to customer | Create new addresses assigned to customer |  Bulk update addresses to customer  |  Delete all addresses assigned to customer|