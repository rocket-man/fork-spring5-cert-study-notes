# What does the ** pattern in an antMatcher or mvcMatcher do?
```**``` pattern in antMatcher and mvcMatcher matches zero or more path segments until the end of the path.

```antMatcher``` and ```mvcMatcher``` support following rules:
- ```?``` - matches one character
- ```*``` - matches zero or more character within a path segment 
- ```**``` - matches zero or more path segments until the end of the path
- Regexps are supported for Path Variables 
    - ```{spring:[a-z] + }``` matches the regexp ```[a-z]+``` as a path variable named "spring"
    
For example, having following URI ```/departments/delete/5:```
- ```/departments/delete/*``` - matches
- ```/departments/delete/**``` - matches
- ```/*/5``` - does not match
- ```/**/5``` - matches
- ```/departments/dele??/*``` - matches