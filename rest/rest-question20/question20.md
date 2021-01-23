# If you saw an example using RestTemplate would you understand what is going on?
RestTemplate API allows you to receive answer from Service beign called by returning:
- Object that represents transferred data
- ResponseEntity
    - Status code
    - Http Headers
    - Response Body
    
- HTTP Headers
- URI of created/posted object
- List of allowed HttpMethods by using HTTP Options request

Rest Template API can be categorized by HTTP request type, below is a list of commonly used operations:
- Generic (flexible)
  - exchange
    - executes HTTP requests against given URI, send request HttpEntity and returns the response as ResponseEntity
  - execute
    - executes HTTP requests against given URI, prepares the requets with the RequestCallback and reads response with ResponseExtractor
  
- HTTP GET
  - getForObject
  - getForEntity
  
- HTTP HEAD
  - headForHeaders
  
- HTTP POST
  - postForLocation
  - postForObject
  - postForEntity
  
- HTTP PUT
  - put
  
- HTTP PATCH
  - patchForObject
  
- HTTP DELETE
  - delete
  
- HTTP OPTIONS 
  - optionsForAllow 