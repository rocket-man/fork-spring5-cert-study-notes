# Why is the usage of mvcMatcher recommended over antMatcher?
```mvcMatcher``` is more flexible and forgiving when writing down rules for String Security Configuration, thus making mistakes 
making mistakes when securing application is harder.

As an example let's consider following matcher rules:
- ```.mvcMatcher("/employees")``` 
- ```.antMatcher("/employees")```

Although they look very similar, they will work differently when executed against URI ```/employees``` and ```/employees/```
- /employees
    - ```.mvcMatchers("/employees")``` - matches
    - ```.antMatchers("/employees")``` - matches

- /employees/
    - ```.mvcMatchers("/employees")``` - matches
    - ```.antMatchers("/employees")``` - does not match
    
So in the above example, when using ```antMatchers``` it is easy to omit last slash, giving attackers possibility to bypass 
application security rules.
