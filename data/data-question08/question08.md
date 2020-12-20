# What is a transaction? What is the difference between a local and a global transaction?
Transaction is an operation that consist of series of tasks, in which all of these tasks should be performed, or none of 
the tasks should be performed. These tasks are being treated as one unit of work. If all tasks in transactional are successful,
changes made by those tasks are preserved, if at least one of the tasks is unsuccessful, changes made by tasks that were
already completed will be reverted and any task awaiting execution will not be executed.

Transaction should follow ACID principle:
- Atomicity - All changes are applied or none changes are applied
- Consistency - System should go from one valid state to another valid state, any constraints on data should never be left 
in invalid state.
  
- Isolation - one transaction cannot affect other one, concurrent execution of transaction should leave system in the same 
state as if sequential execution of transaction would be performed
  
- Durability - guarantees that if transaction has been committed, data will be preserved, even in case of system/power failure

---
Global transaction is a kind of transactions that spans multiple transactional resources. Those resources can be anything,
but usually include databases (can be more than one) and queues. In Java, popular standard for managing global transactions 
is JTA, which is an API for using transaction system provided by Application Server.

Local transactions are resource specific transactions, they do not span across multiple transactional resources. Local 
transactions are much simpler than global transaction, however main disadvantages is lack of ability to treat series of tasks
dealing with multiple transactional resources such as databases or databases and queues as single unit of work.

