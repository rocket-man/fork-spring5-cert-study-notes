# What is a ProceedingJoinPoint ? When is it used ?
ProceedingJoinPoint is an object that can be provided to ```@Around``` advice as first argument, it is a type of JoinPoint
which can be used to change method arguments during method execution in runtime or block execution of original method entirely.

ProceedingJoinPoint is used in ```@Around``` advice, it contains all methods from JoinPoint and also adds:
- proceed - executes original method
- proceed(args) - executes original method with provided arguments

ProceedingJoinPoint can be used in following use cases:
- Conditionally block method execution
- Filter arguments 
- Inject additional argument