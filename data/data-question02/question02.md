# How do you configure a DataSource in Spring? Which bean is very useful for development/test databases?
Data Source is represented by generic interface ```javax.sql.DataSource``` which represents any data source for sql database.

To configure data source in Spring you need to create a ```@Configuration``` class that will return ```javax.sql.DataSource``` bean.

You can use for example following types of ```javax.sql.DataSource```:
- DriverManagerDataSource - basic JDBC driver connection source
- BasicDataSource - Apache DBCP for Connection Pooling
- ComboPooledDataSource - C3P0 for Connection Pool
- SmartDataSource
- AbstractDataSource
- SingleConnectionDataSource
- TransactionAwareDataSourceProxy
- DataSourceTransactionManager

Configuration of Data Source in Spring is dependent on type of application that is executed.

Type of execution:
- Standalone - Data source is configured in ```@Configuration``` class and is created as bean of supported data source types.
- Spring Boot - Data Source is configured through ```application.properties```
- Application server - Data Source should be fetched from JNDI via ```JndiDataSourceLookup / JndiTemplate``` application 
server is responsible fo creating and managing data source requested in resources configurations of deployment descriptors.
  
When working with development/test databases, following beans are very useful:
- ```EmbeddedDatabaseBuilder``` - allows to easily configure H2/HSQLDB embedded database with schema/data initialization scripts without usage of ```EmbeddedDatabaseBuilder```
- ```DataSourceInitializer / ResourceDatabasePopulator``` - allows to use schema/data initialization scripts without usage of ```EmbeddedDatabaseBuilder```