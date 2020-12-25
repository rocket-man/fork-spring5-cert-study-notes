# What does transaction propagation mean?
Transaction propagation defines how existing transaction is re-used when calling ```@Transactional``` method with transaction 
already running.

Transaction propagation can be defined in ```@Transactional``` annotation in ```propagation``` field as one of the following
options:

- ```REQUIRED``` - support a current transaction, creates a new one if does not exist
- ```SUPPORTS``` - support a current transaction, execute non-transactionally if none exists
- ```MANDATORY``` - support a current transaction, throw an exception if none exists
- ```REQUIRES NEW``` - create a new transaction, and suspend the current transaction if one exists
- ```NOT SUPPORTED``` - execute non-transactionally, suspend the current transaction if one exists
- ```NEVER``` - execute non-transactionally, throw an exception if a transaction exists
- ```NESTED``` - execute within a nested transaction if a current transaction exists, behave like REQUIRED else.