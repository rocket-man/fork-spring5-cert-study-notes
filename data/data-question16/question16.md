# Where can the @Transaction annotation be used? What is a typical usage if you put it at class level?
```@Transactional``` can be used on top of class or method, in classes or interfaces

If used on top of class, it applies to all public methods in the class.

If used on top of the method, it needs to have public access modifier, if used on top of protected / package-visible / private
method, transaction management will not be applied. 

