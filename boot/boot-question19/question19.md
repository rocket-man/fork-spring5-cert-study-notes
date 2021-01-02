# Does Spring Boot do component scanning? Where does it look by default?
Yes, Spring Boot is performing component scan, because ```@SpringBootApplication``` annotation is enabling component 
scanning with usage of ```@ComponentScan``` annotation.

By default, Spring Boot will search for ```@Component``` annotated classes with the same root package as ```@SpringBootApplication```
annotated class.

You can change this behaviour by adding additional packages to scan with ```scanBasePackages``` or type-safe version of it 
```scanBasePackageClasses``` within ```@SpringBootApplication``` annotation.


