# What is a transactional isolation level? How many do we have and how are they ordered?
Transaction isolation determines how changes made under one transaction are visible in other transactions and to other
users of the system. Higher isolation level means that changes from one transaction are not visible and lower isolation
level means that changes from one transaction may "slip" into selects executed under the other transaction.

Higher transaction isolation level make data being visible in more consistent way, lower transaction isolation level makes
data less consistent but increases overall throughput and concurrency of the system.

There are three challenges that may occur due to Transaction isolation Level:
- Phantom Read
- Non-repeatable read
- Dirty read 

*Phantom read*:
- Transaction A - first reads
  - ```select id, name, surname from employee where id between 5 and 10;```
- Transaction B - writes
  - ```insert into employees values(7, 'John', 'Doe');```
- Transaction A - second read
  - ```select id, name, surname from employee where id between 5 and 10;```
    
High Isolation Level will make second read returning same value as first read, on the other hand however, lower isolation level will include new row 
with id = 7 in second read.

To prevent phantom read, you need to pick isolation level that uses range locks

*Non-repeatable read*:
- Transaction A - first reads
    - ```select id, name, surname from employee where id = 5;```
- Transaction B - write & commit
    - ```update employees set surname = 'Doe' where id = 5';```
- Transaction A - second read
    - ```select id, name, surname from employee where id = 5;```
    
High Isolation Level will make second read returning same values as first read, on the other hand however, lower isolation 
level will read new values for the record with id = 5

To prevent non-repeatable reads you need to use isolation level that uses read write locks on data being processed.

*Dirty read*:
- Transaction A - first reads
    - ```select id, name, surname from employee where id = 5;```
- Transaction B - write (commit does not have to happen)
    - ```update employees set surname = 'Doe' where id = 5';```
- Transaction A - second read
    - ```select id, name, surname from employee where id = 5;```

High Isolation Level will make second read returning same values as first read, on the other hand however, lower isolation
level will read new values for the record with id = 5, even if Transaction B will not commit the data.

To prevent dirty reads you need to use isolation level that prevents uncommitted changes by other transactions being visible
in your transaction.

---

Most relational databases support 4 transaction levels:
- Serializable
  - Highest isolation level
  - Read-write locks held until end of transaction
  - Range locks held until end of transaction 
    
- Repeatable read
  - Read-write locks held until end of transaction
    
- Read committed
  - Read locks held until end of select statement
  - Write locks held until end of transaction
    
- Read uncommitted
  - Lowest isolation level
  - It is possible to see changes from other transactions that are not committed 

---

In Spring Framework, you can use ```@Transactional``` annotation to set isolation level.
```
@Transactional(isolation = Isolation.SERIALIZABLE)
@Transactional(isolation = Isolation.REPEATABLE_READ)
@Transactional(isolation = Isolation.READ_COMMITTED)
@Transactional(isolation = Isolation.READ_UNCOMMITTED)
```

| Isolation Level   |     Phantom Read      |  Non-Repeatable read |   Dirty Read   |   Concurrency    |
|-------------------|:---------------------:|---------------------:|---------------:|-----------------:|
| Serializable      |  Not Possible         |    Not Possible      |  Not Possible  |   Very Poor   
| Repeatable Read   |    Possible           |    Not Possible      |  Not Possible  |   Poor
| Read Commited     |    Possible           |    Possible          |  Not Possible  |   Good
| Read Uncommited   |    Possible           |    Possible          |  Possible      |   Very Good
    