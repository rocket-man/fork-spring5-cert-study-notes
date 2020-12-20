# When does JDBC template acquire (and release) a connection, for every method called or once per template? Why?
Connection lifecycle in JDBC depends on transaction being involved or not. 

if JDBC Template is used without transaction, then connection is acquired for every method call. Reason for this strategy 
is to minimize the amount of time when resource (connection) has to be held

if JDBC Template is used together with transaction, then ```DataSourceUtils``` which is using 
```TransactionSynchronizationManager``` will reuse connection between method calls as long as transaction is not committed
or rolled back. Reason for this strategy is that connection cannot be closed when transaction is in progress, since closing
connection would also rollback any changes made.

JDBC Template uses ```getConnection()``` method from ```DataSource``` class through ```DataSourceUtils``` class. If DataSource
is plain JDBC Connection source, then connection is usually opened/closed, however if Connection Pool, like DBCP or C3P0 
is used, then connection is not being opened/closed, however it is acquired or released from/to the pool.

