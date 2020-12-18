# What is the Joinpoint argument used for?
JoinPoint argument is an object that can be used to retrieve additional information about join point during execution. 
JoinPoint needs to be the first parameter of Advice, only in that case Spring Framework will inject JoinPoint into 
advice method.

Join Point is supported in following advice types:
- Before 
- After
- After Returning
- After Throwing

Examples of information that you can retrieve from JoinPoint:
- String representation of JoinPoint 
- Arguments of JoinPoint (for example Method Arguments)
- Signature of JoinPoint (for example method Signature)
- Kind / Type of Joint Point 
- Target / This object is proxied 
