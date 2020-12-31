# How do you configure default schema and initial data?
Spring Boot uses following script to configure default schema and initial data:
- ```schema.sql``` - contains DDL for db objects creation
- ```data.sql``` - contains data that should be inserted upon db initialization

Spring Boot will also load:
- ```schema-${platform}.sql``` 
- ```data-${platform}.sql```

platform is the value of ```spring.datasource.platform``` property, this allows you to switch between database vendor specific 
scripts, for example platform may be ```mysql, postgressql, oracle``` etc.

Spring Boot will automatically initialize **only embedded** databases, if you want to initialize regular databases as well,
you need to set property.
```spring.datasource.initialization-mode=always```

If you would like to change default ```schema.sql``` and ```data.sql``` script names, you can use ```spring.datasource.schema```
and ```spring.datasource.data``` properties to achieve this.

