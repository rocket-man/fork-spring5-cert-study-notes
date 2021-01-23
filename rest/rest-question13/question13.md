# What are the HTTP status return codes for a sucessful GET, POST, PUT  or DELETE operations?
- GET
    - 200 (OK) - when asked about existing for which content is returned  
- POST
    - 201 (Created) - when new resource was created
    - 200 (OK) - when some processing was executed but resources were not created
    - 204 (No Content) - when some processing was expected but no response is retrieved
- PUT
    - 201 (Created) - when new resources was created
    - 200 (OK) - when resources was updated, and updated content is returned 
    - 204 (No Content) - when resource was updated, and no content is returned

- DELETE 
    - 204 (No Content) - when resource was successfully deleted
    
In case of asynchronous operations, 202 (Accepted) may be returned with Location header indicating URI that can be used for pooling
