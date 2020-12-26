# Are you able to participate in a given transaction in Spring while working with JPA?
Yes, JPA in Spring uses ```JpaTransactionManager``` which supports cases when ```DataSource``` is used directly, so it allows 
mixing JPA and JDBC code under one transaction.

When using Spring Framework on Java EE Platform, it is possible to reuse existing transaction as well by using ```JtaTransactionManager```
which will delegate transaction management to Java EE container.