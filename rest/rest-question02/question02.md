# What is a resource?
Resource is a named information available via URI. It can be a document, image, video, text files, etc... REST uses different 
form of representation resources, and client can specify format in which resource should be made available, for example
JSON, XML, Html, text, etc...

Resource can be made available as single resource or collection of resource. Resources can also have relationship with each
other, often used relation is "contained in" expressed by sub-collections.

REST usually provides set of methods that can be used to manipulate resources, like HTTP GET, POST, PUT, DELETE etc...

```http://localhost:8080/customers/1```
```http://localhost:8080/customers/1/addresses```
```http://localhost:8080/customers/1/addresses/2```
```http://localhost:8080/addresses/2/customer```

