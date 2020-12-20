# What is the Template design pattern and what is the JDBC template?
Template design pattern is a behavioural design pattern that can be used to encapsulate algorithm/main flow with it steps
in a way to achieve steps customization and shared code re-usability. It is achieved by creating abstract class that contains
algorithm definition/main flow with shared code, and child classes extending abstract class which are customizing step 
or steps of the algorithm

Template design pattern can be used to achieve greater code reusability, however since it is using inheritance, which is
very string relationship between classes it can limit future flexibility of the system. You should use this pattern with
caution ad you should analyze i strategy design pattern will not give you similar results. Strategy uses composition instead
of inheritance and in some cases instead of using template method, strategy can be used to achieve code reusability and 
also code flexibility.

The Abstract class contains the main algorithm or the main execution flow ```generateReport()``` and also has two helper 
methods ```openFile() and closFile()``` The abstract methods are the steps that the concrete classes need to implement. Doing
this allows you to achieve code reusability since the ```generateRepor() opendFile()``` and ```closeFile()``` methods 
are shared. 

Jdbc Template is a class located in ```org.springframework.jdbc.core``` package. Goal of this class is to simplify use 
of JDBC by providing implementation of JDBC workflow, leaving application to provide SQL statements and results extractions

Jdbc Template executes SQL queries or updates, initiates iterations over ResultSet, ResultSet mapping, also it catches 
exceptions and translates them into generic exceptions. 

Code that interacts with Jdbc Template needs to provide implementation of callback interfaces which allows specific steps
of JDBC workflow customization:
- PreparedStatementCreator
- ResultSetExtractor
- PreparedStatementSetter
- RowMapper
