# What is the default rollback policy? How can you override it?
Default rollback policy in Spring Framework is set to automatic rollback, but only when unchecked exception is being
thrown from the method annotated with ```@Transactional``` annotation. When checked exception is being thrown from the method,
transaction is not being rolled back.

You can override this policy by setting ```rollbackFor / rollbackForClassName``` or ```noRollbackFor / nRollbackForClassName``` 
field with ```@Transactional``` annotation

See examples below:
```java

@Transactional
public void methodWithUncheckedExceptionCausingRollback() {
    throw new IllegalArgumentException("test unchecked exception that will cause rollback");
}

@Transactional
public void methodWithCheckedExceptionNotCausingRollback() throws CustomException {
    throw new CustomException("test checked exception that will not cause rollback");
}

@Transactional(noRollbackFor = IllegalArgumentException.class)
public void methodWithUncheckedExceptionNotCausingRollback() {
    throw new IllegalArgumentException("test unchecked exception that will not cause rollback because of noRollbackFor field");
}

@Transactional(rollbackFor = CustomException.class)
public void methodWithCheckedExceptionCausingRollback() throws CustomException {
    throw new CustomException("test checked exception that will cause rollback because of rollbackFor field");
}


```